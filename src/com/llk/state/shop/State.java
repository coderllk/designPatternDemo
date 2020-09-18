package com.llk.state.shop;

public interface State {

    //用户创建订单
    void create(Context context);

    //商家接单
    void take(Context context);

    //商家发货
    void send(Context context);

    //用户收货
    void receive(Context context);

    //用户取消订单
    void cancel(Context context);
}
