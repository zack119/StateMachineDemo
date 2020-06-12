package cc.liubin.stateMachine.handler;

import cc.liubin.stateMachine.Event;
import cc.liubin.stateMachine.Order;

/**
 * @author: bin.liu
 * @date 2020/6/12 12:19
 */
public class DeliverStateHandler extends AbstractStateHandler {

    @Override
    protected Object doHandle(Order order) {
        System.out.println("发货。。。");
        return null;
    }

    @Override
    public Event event() {
        return Event.DELIVER;
    }
}
