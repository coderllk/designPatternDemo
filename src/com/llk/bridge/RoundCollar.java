package com.llk.bridge;

public class RoundCollar extends Collar {
    @Override
    public String getCollar() {
        return "圆领";
    }

    @Override
    public void operateSomething() {
        //调用尺寸维度的 dealSomething()
        super.getSize().dealSomething();
    }
}
