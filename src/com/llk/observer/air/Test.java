package com.llk.observer.air;

import com.llk.observer.example.AirData;

public class Test {
    public static void main(String[] args) {
        //创建东航航班动态服务
        EastAirLineService service = new EastAirLineService();
        //创建携程网客户端，并注册
        Observer xieCheng = new XieChengObserver();
        service.registerObserver(xieCheng);//注册

        Observer eastAirWeb = new EastAirWebObserver();
        service.registerObserver(eastAirWeb);//注册

        //模拟一组数据
        AirData airData = new AirData();
        airData.setSeq("FM42412");
        airData.setDelay(true);
        airData.setStart("17:30");
        airData.setEnd("19:35");

        //有最新的航班动态信息
        service.setAirData(airData);

    }
}
