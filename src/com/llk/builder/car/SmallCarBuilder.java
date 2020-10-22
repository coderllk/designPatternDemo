package com.llk.builder.car;

public class SmallCarBuilder extends Builder{
    @Override
    public void setType() {
        super.getCar().setType("小轿车");
    }

    //具体实现生产 小轿车 的各个步骤，供 director 调用
    @Override
    public void setEngine() {
        super.getCar().setEngine("小轿车 的 engine");
    }

    @Override
    public void setSteerWheel() {
        super.getCar().setSteerWheel("小轿车 的 steerWheel");
    }

    @Override
    public void setSeats() {
        super.getCar().setSeats("小轿车 的 seats");
    }

    @Override
    public Car getResultCar() {
        //返回构建好的 小轿车 汽车
        //一般在 director 中调用
        return super.getCar();
    }
}
