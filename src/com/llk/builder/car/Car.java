package com.llk.builder.car;

//产品类
public class Car {
    private String type;//汽车类型 suv、越野等
    private String engine;//引擎
    private String steerWheel;//方向盘
    private String seats;//座位

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public String getSteerWheel() {
        return steerWheel;
    }

    public void setSteerWheel(String steerWheel) {
        this.steerWheel = steerWheel;
    }

    public String getSeats() {
        return seats;
    }

    public void setSeats(String seats) {
        this.seats = seats;
    }

    @Override
    public String toString() {
        return "Car{" +
                "type='" + type + '\'' +
                ", engine='" + engine + '\'' +
                ", steerWheel='" + steerWheel + '\'' +
                ", seats='" + seats + '\'' +
                '}';
    }
}
