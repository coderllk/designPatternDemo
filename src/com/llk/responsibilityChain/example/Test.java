package com.llk.responsibilityChain.example;

public class Test {
    public static void main(String[] args) {
        //创建三个处理器
        HandlerA a = new HandlerA();
        HandlerB b = new HandlerB();
        HandlerC c = new HandlerC();

        //构造处理器链  a -> b -> c
        a.setNextHandler(b);
        b.setNextHandler(c);

        //从 a 开始执行
        a.handle();
    }
}
