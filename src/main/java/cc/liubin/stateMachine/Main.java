package cc.liubin.stateMachine;

import cc.liubin.stateMachine.handler.CreateOrderStateHandler;
import cc.liubin.stateMachine.handler.DeliverStateHandler;
import cc.liubin.stateMachine.handler.PayStateHandler;

/**
 * @author: bin.liu
 * @date 2020/6/12 17:35
 */
public class Main {

    public static void main(String[] args) {
        Dispatcher dispatcher = new AsyncDispatcher();
        dispatcher.register(Event.CREATE_ORDER, new CreateOrderStateHandler());
        dispatcher.register(Event.PAY, new PayStateHandler());
        dispatcher.register(Event.DELIVER, new DeliverStateHandler());

        Order order = new Order();
        dispatcher.dispatch(Event.CREATE_ORDER, order);
//        dispatcher.dispatch(Event.pay, order);
        dispatcher.dispatch(Event.DELIVER, order);

        dispatcher.shutdown();
    }
}
