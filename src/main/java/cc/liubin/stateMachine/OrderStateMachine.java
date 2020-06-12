package cc.liubin.stateMachine;


import java.util.Objects;

/**
 * @author: bin.liu
 * @date 2020/6/12 10:39
 */
public class OrderStateMachine implements StateMachine {

    public State next(State state, Event event, Object context) {

        State nextState = null;
        switch (event) {
            case CREATE_ORDER:
                // todo content
                nextState = State.CREATE_ORDER;
                System.out.println("订单已创单");
                break;
            case PAY:
                if (Objects.equals(state, State.CREATE_ORDER)) {
                    nextState = State.PAY;
                    System.out.println("订单已支付");
                }

                break;
            case DELIVER:
                if (Objects.equals(state, State.PAY)) {
                    nextState = State.DELIVER;
                    System.out.println("订单已发货");
                } else {
                    System.out.println("发货错误");
                }
                break;
            default:
                // throw exp
                break;
        }
        return nextState;
    }

}
