package com.llk.bridge;

public class Middle extends Size {
    @Override
    public String getSize() {
        return "middle";
    }
    @Override
    public void dealSomething() {
        System.out.println("调用了 Middle 的 dealSomething() 方法");
    }
}
