package cc.liubin.stateMachine.handler;

import cc.liubin.stateMachine.Event;
import cc.liubin.stateMachine.Order;

/**
 * @author: bin.liu
 * @date 2020/6/12 11:24
 */
public class CreateOrderStateHandler extends AbstractStateHandler{

    @Override
    public Event event() {
        return Event.CREATE_ORDER;
    }

    @Override
    protected Object doHandle(Order order) {
        System.out.println("创单。。。");
        return null;
    }
}
