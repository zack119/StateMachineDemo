package cc.liubin.stateMachine.handler;

import cc.liubin.stateMachine.Order;
import cc.liubin.stateMachine.StateMachineFactory;

/**
 * @author: bin.liu
 * @date 2020/6/12 11:00
 */
public abstract class AbstractStateHandler implements StateHandler {

    @Override
    public void handle(Order order) {
        this.before(order);
        Object context = this.doHandle(order);
        order.setOrderState(StateMachineFactory.getInstance().next(order.getOrderState(), event(), context));
        this.after(order);
    }

    protected  void before(Order order) {

    }

    protected void after(Order order) {

    }

    protected abstract Object doHandle(Order order);

}
