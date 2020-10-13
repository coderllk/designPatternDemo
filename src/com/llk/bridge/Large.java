package com.llk.bridge;

public class Large extends Size {
    @Override
    public String getSize() {
        return "large";
    }
    @Override
    public void dealSomething() {
        System.out.println("调用了 Large 的 dealSomething() 方法");
    }
}
