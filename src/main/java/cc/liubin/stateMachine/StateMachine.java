package cc.liubin.stateMachine;

/**
 * @author: bin.liu
 * @date 2020/6/12 09:57
 */
public interface StateMachine {

    State next(State state, Event event, Object context);

}
