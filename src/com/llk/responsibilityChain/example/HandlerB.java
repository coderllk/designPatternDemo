package com.llk.responsibilityChain.example;

public class HandlerB extends Handler {

    @Override
    public void handle() {
        System.out.println("处理器B 执行完成");
        //当前处理器执行完成后，交给下一个处理器执行
        if(this.getNextHandler()!=null) {
            this.getNextHandler().handle();
        }
    }
}
