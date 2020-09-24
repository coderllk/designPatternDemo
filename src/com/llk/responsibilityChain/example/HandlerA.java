package com.llk.responsibilityChain.example;

public class HandlerA extends Handler {
    @Override
    public void handle() {
        System.out.println("处理器A 执行完成");
        //当前处理器执行完成后，交给下一个处理器执行
        if(this.getNextHandler()!=null) {
            this.getNextHandler().handle();
        }
    }
}
