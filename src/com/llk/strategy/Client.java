package com.llk.strategy;

public class Client {
    public static void main(String[] args) {
        //人事部进行采购
        HrEmployee hrEmployee = new HrEmployee();
        //设置采购方式
        MinePurchaseStrategy minePurchaseStrategy = new MinePurchaseStrategy();
        hrEmployee.setStrategy(minePurchaseStrategy);
        hrEmployee.purchase();

        System.out.println("------更改采购方式后：--------");

        //设置另外一种采购方式
        PhonePurchaseStrategy phonePurchaseStrategy = new PhonePurchaseStrategy();
        hrEmployee.setStrategy(phonePurchaseStrategy);
        hrEmployee.purchase();
    }
}
