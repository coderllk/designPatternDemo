package com.llk.state.shop;

/**
 * 初始状态
 */
class StartState extends AbstractState{

    @Override
    public void create(Context context) {
        System.out.println("用户创建订单");
        //订单创建完成后，切换到 已创建 状态
        context.setCurrentState(new CreatedState());
    }

}

/**
 * 已创建 状态
 */
class CreatedState extends AbstractState{

    @Override
    public void take(Context context) {
        System.out.println("商家接单");
        //商家接单后，切换到 已接单 状态
        context.setCurrentState(new TokenState());
    }

    @Override
    public void cancel(Context context) {
        System.out.println("用户取消订单");
        //用户取消订单后， 切换到已取消状态
        context.setCurrentState(new CanceledState());
    }
}

/**
 * 已接单 状态
 */
class TokenState extends AbstractState{
    @Override
    public void send(Context context) {
        System.out.println("商家发货");
        //商家接单后，切换到 已发货 状态
        context.setCurrentState(new SentState());
    }

    @Override
    public void cancel(Context context) {
        System.out.println("用户取消订单");
        //用户取消订单后， 切换到已取消状态
        context.setCurrentState(new CanceledState());
    }
}

/**
 * 已发货状态
 */
class SentState extends AbstractState{
    @Override
    public void receive(Context context) {
        System.out.println("用户收货");
        //用户收货后，切换到 已收货状态
        context.setCurrentState(new ReceivedState());
    }

    @Override
    public void cancel(Context context) {
        System.out.println("用户取消订单");
        //用户取消订单后， 切换到已取消状态
        context.setCurrentState(new CanceledState());
    }
}

/**
 * 已收货 状态
 */
class ReceivedState extends AbstractState{
    //已收货状态为最终状态，没有任何行为
}

/**
 * 已取消 状态
 */
class CanceledState extends AbstractState{
    //已取消状态为最终状态，没有任何行为
}