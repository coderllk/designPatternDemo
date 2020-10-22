package com.llk.strategy;

//抽象的采购策略类
public interface PurchaseStrategy {
    //采购方法，由具体策略类来实现
    public void purchase();
}
