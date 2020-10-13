package com.llk.bridge;

public class VCollar extends Collar {
    @Override
    public String getCollar() {
        return "v领";
    }

    @Override
    public void operateSomething() {
        //调用颜色维度的 doSomething()
        super.getColor().doSomething();
        //调用尺寸维度的 dealSomething()
        super.getSize().dealSomething();
    }
}
