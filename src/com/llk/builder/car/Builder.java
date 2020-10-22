package com.llk.builder.car;

//抽象的建造者类
public abstract class Builder {
    private Car car;
    public Builder(){
        //真正创建产品实例的地方
        this.car = new Car();
    }

    public abstract void setType();

    //生产汽车的三个步骤
    public abstract void setEngine();
    public abstract void setSteerWheel();
    public abstract void setSeats();

    public abstract Car getResultCar();

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }
}
