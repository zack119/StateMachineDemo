package cc.liubin.stateMachine.handler;

import cc.liubin.stateMachine.Event;
import cc.liubin.stateMachine.Order;

/**
 * @author: bin.liu
 * @date 2020/6/12 12:16
 */
public class PayStateHandler extends AbstractStateHandler {

    @Override
    protected Object doHandle(Order order) {
        System.out.println("支付。。。");
        return null;
    }

    @Override
    public Event event() {
        return Event.PAY;
    }
}
