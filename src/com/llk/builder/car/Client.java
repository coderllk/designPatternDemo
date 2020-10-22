package com.llk.builder.car;

public class Client {
    public static void main(String[] args) {

        Director director = new Director();

        //生产一辆 suv 汽车
        SuvCarBuilder suvCarBuilder = new SuvCarBuilder();
        director.setBuilder(suvCarBuilder);
        Car suvCar = director.createSuvCar();
        System.out.println(suvCar);

        //生产一辆 小轿车
        SmallCarBuilder smallCarBuilder = new SmallCarBuilder();
        director.setBuilder(smallCarBuilder);
        Car smallCar = director.createSmallCar();
        System.out.println(smallCar);

        //生产一辆用于测试引擎的小汽车
        SmallCarBuilder testSmallCarBuilder = new SmallCarBuilder();
        director.setBuilder(testSmallCarBuilder);
        Car testSmallCar = director.createTestSmallCar();
        System.out.println(testSmallCar);

    }
}
