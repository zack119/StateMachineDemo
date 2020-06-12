package cc.liubin.stateMachine.handler;

import cc.liubin.stateMachine.Event;
import cc.liubin.stateMachine.Order;

/**
 * @author: bin.liu
 * @date 2020/6/12 10:52
 */
public interface StateHandler {

    void handle(Order order);

    Event event();

}
