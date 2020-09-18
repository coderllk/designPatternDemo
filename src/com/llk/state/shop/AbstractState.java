package com.llk.state.shop;

public abstract class AbstractState implements State{

    @Override
    public void create(Context context) {
        throw new RuntimeException("当前不能创建订单");
    }

    @Override
    public void take(Context context) {
        throw new RuntimeException("当前不能接单");
    }

    @Override
    public void send(Context context) {
        throw new RuntimeException("当前不能发货");
    }

    @Override
    public void receive(Context context) {
        throw new RuntimeException("当前不能收货");
    }

    @Override
    public void cancel(Context context) {
        throw new RuntimeException("当前不能取消订单");
    }

}
