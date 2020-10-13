package com.llk.bridge;

public class Blue extends Color {
    @Override
    public String getColor() {
        return "blue";
    }

    @Override
    public void doSomething() {
        System.out.println("调用了 Blue 的 doSomething() 方法 ");
    }
}
