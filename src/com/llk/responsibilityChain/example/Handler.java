package com.llk.responsibilityChain.example;

public abstract class Handler {

    private Handler nextHandler;//下一个处理器

    public abstract void handle();//处理请求的方法

    public Handler getNextHandler() {
        return nextHandler;
    }

    public void setNextHandler(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }
}
