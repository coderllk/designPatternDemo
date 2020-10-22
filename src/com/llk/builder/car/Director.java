package com.llk.builder.car;

public class Director {
    private Builder builder;

    //生产 suv 汽车
    public Car createSuvCar(){
        builder.setType();
        builder.setEngine();
        builder.setSeats();
        builder.setSteerWheel();
        return builder.getResultCar();
    }

    //生产 小轿车
    public Car createSmallCar(){
        builder.setType();
        builder.setSeats();
        builder.setEngine();
        builder.setSteerWheel();
        return builder.getResultCar();
    }

    //生产一辆测试车辆
    public Car createTestSmallCar(){
        builder.setEngine();
        builder.setSteerWheel();
        return builder.getResultCar();
    }

    public void setBuilder(Builder builder) {
        this.builder = builder;
    }
}
