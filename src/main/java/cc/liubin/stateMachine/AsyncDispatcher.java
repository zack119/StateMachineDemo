package cc.liubin.stateMachine;

import cc.liubin.stateMachine.handler.StateHandler;

import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author: bin.liu
 * @date 2020/6/12 16:17
 */
public class AsyncDispatcher implements Dispatcher {

    private ExecutorService executor;

    Map<Event, StateHandler> stateHandlerMap;

    public AsyncDispatcher() {
        executor = Executors.newSingleThreadExecutor();
        stateHandlerMap = new ConcurrentHashMap<>();
    }

    @Override
    public void register(Event event, StateHandler handler) {
        stateHandlerMap.putIfAbsent(event, handler);
    }

    @Override
    public void dispatch(Event event, Order order) {
        StateHandler stateHandler = stateHandlerMap.get(event);
        if (Objects.isNull(stateHandlerMap)) {
            throw new RuntimeException("StateHandler is not exist " + event);
        }

        executor.execute(() -> {
            try {
                System.out.println("AsyncDispatcher handle event start;event= " + event);
                stateHandler.handle(order);
                System.out.println("AsyncDispatcher handle event end;event= " + event);
            } catch (Exception e) {
                System.out.println("AsyncDispatcher handle event exception;event= " + event);
                e.printStackTrace();
            }
        });
    }

    @Override
    public void shutdown() {
        executor.shutdown();
        System.out.println("AsyncDispatcher shutdown");
    }


}
