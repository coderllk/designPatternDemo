package com.llk.bridge;

public class Small extends Size {

    @Override
    public String getSize() {
        return "small";
    }

    @Override
    public void dealSomething() {
        System.out.println("调用了 Small 的 dealSomething() 方法");
    }

}
