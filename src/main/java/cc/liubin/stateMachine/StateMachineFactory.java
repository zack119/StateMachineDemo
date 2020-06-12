package cc.liubin.stateMachine;

/**
 * @author: bin.liu
 * @date 2020/6/12 11:07
 */
public class StateMachineFactory {

    private StateMachineFactory() {
    }

    public static StateMachine getInstance() {
        return SingletonHolder.INSTANCE;
    }

    private static class SingletonHolder {
        private static final StateMachine INSTANCE = new OrderStateMachine();
    }
}
