package com.llk.strategy;

//人事部
public class HrEmployee extends Employee {

    //人事部具有采购功能
    private PurchaseStrategy strategy;

    public HrEmployee() {
        super("人事部的员工");
    }

    public void setStrategy(PurchaseStrategy strategy) {
        this.strategy = strategy;
    }

    //采购
    public void purchase(){
        System.out.println(this.getName());
        this.strategy.purchase();
    }
}
