package cc.liubin.stateMachine;

import cc.liubin.stateMachine.handler.StateHandler;

/**
 * @author: bin.liu
 * @date 2020/6/12 16:03
 */
public interface Dispatcher {

    void register(Event event, StateHandler handler);

    void dispatch(final Event event, Order order);

    void shutdown();

}
