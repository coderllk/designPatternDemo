package com.llk.observer.example;

public class XieCheng {
    private AirData airData;

    //在携程 app 上显示航班动态信息
    public void display(){
        System.out.println("携程网收到：航班班次："+airData.getSeq());
        System.out.println("携程网收到：是否延迟："+airData.isDelay());
        System.out.println("携程网收到：起飞时间："+airData.getStart());
        System.out.println("携程网收到：到达时间："+airData.getEnd());
    }

    //供 EastAirLineService 调用
    public void update(AirData airData){
        this.airData = airData;
        display();
    }
}
