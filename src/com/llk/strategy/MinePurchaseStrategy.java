package com.llk.strategy;

//公司员工直接去供货商处，自取货物
public class MinePurchaseStrategy implements PurchaseStrategy {
    @Override
    public void purchase() {
        System.out.println("公司直接去供货商处，自取货物");
    }
}
