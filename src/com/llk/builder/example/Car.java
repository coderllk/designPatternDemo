package com.llk.builder.example;


public class Car {
    private String type;//汽车类型 suv、越野等
    private String engine;//引擎
    private String steerWheel;//方向盘
    private String seats;//座位

    public Car(Builder builder){
        type = builder.type;
        engine = builder.engine;
        steerWheel = builder.steerWheel;
        seats = builder.seats;
    }

    //建造者类
    static class Builder{
        private String type;//
        private String engine;
        private String steerWheel;
        private String seats;

        public Builder type(String type){
            this.type = type;
            return this;
        }
        public Builder engine(String engine){
            this.engine = engine;
            return this;
        }
        public Builder steerWheel(String steerWheel){
            this.steerWheel = steerWheel;
            return this;
        }
        public Builder seats(String seats){
            this.seats = seats;
            return this;
        }
        public Car build(){
            return new Car(this);
        }
    }
}
