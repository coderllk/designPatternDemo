package com.llk.state.shop;

public class OrderClientTest {

    public static void main(String[] args) {
        Context context = new Context();

        context.create();//创建订单
        context.take();//接单
        //context.cancel();//取消订单
        context.send();//发货
        context.receive();//收货
    }

}
