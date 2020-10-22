package com.llk.builder.car;

public class SuvCarBuilder extends Builder {
    @Override
    public void setType() {
        super.getCar().setType("suv");
    }

    //具体实现生产 suv 的各个步骤，供director 调用
    //给实例设置参数的地方
    @Override
    public void setEngine() {
        super.getCar().setEngine("suv 的 engine");
    }

    @Override
    public void setSteerWheel() {
        super.getCar().setSteerWheel("suv 的 steerWheel");
    }

    @Override
    public void setSeats() {
        super.getCar().setSeats("suv 的 seats");
    }

    @Override
    public Car getResultCar() {
        //返回构建好的 suv 汽车
        //一般在 director 中调用
        return super.getCar();
    }
}
