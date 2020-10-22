package com.llk.strategy;

//通过打电话的方式让供货商发货
public class PhonePurchaseStrategy implements PurchaseStrategy {
    @Override
    public void purchase() {
        System.out.println("通过打电话的方式让供货商发货");
    }
}
