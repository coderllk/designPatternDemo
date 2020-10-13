package com.llk.bridge;

public class Red extends Color {
    @Override
    public String getColor() {
        return "red";
    }
    @Override
    public void doSomething() {
        System.out.println("调用了 Red 的 doSomething() 方法 ");
    }
}
