package com.llk.builder.example;

public class Client {
    public static void main(String[] args) {
        Car car = new Car.Builder()
                .type("suv")
                .engine("engine")
                .seats("seats")
                .steerWheel("steerWhell")
                .build();
    }
}
