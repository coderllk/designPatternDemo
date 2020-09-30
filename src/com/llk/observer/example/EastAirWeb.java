package com.llk.observer.example;


//东航自己的web网站，用来显示航班动态
//当 EastAirLineService 从塔台获取航班最新动态后，就调用 EastAirWeb 的 update 方法告诉它航班信息已更新
public class EastAirWeb {

    private AirData airData;

    //在网页上显示航班动态信息
    public void display(){
        System.out.println("东航网站：航班班次："+airData.getSeq());
        System.out.println("东航网站：是否延迟："+airData.isDelay());
        System.out.println("东航网站：起飞时间："+airData.getStart());
        System.out.println("东航网站：到达时间："+airData.getEnd());
    }

    //供 EastAirLineService 调用
    public void update(AirData airData){
        this.airData = airData;
        display();
    }

}
