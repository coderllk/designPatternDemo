package com.llk.observer.example;

/**
 * 该类是东航的航班动态服务类
 * 它的数据由机场塔台提供
 * 这些数据可以在东航自己的网站上显示，也可以提供给第三方平台使用：携程、智行
 */
public class EastAirLineService {
    private AirData airData;

    private EastAirWeb eastAirWeb;//东航的 web 网站
    private XieCheng xieCheng;//携程网


    //通知 所有的客户端 有最新的航班动态
    public void notifyCurrentAirData(){
        //通知东航 web 网站
        this.eastAirWeb.update(airData);
        //通知携程网
        this.xieCheng.update(airData);
    }

    public void setAirData(AirData airData) {
        this.airData = airData;

        notifyCurrentAirData();
    }

    public void setEastAirWeb(EastAirWeb eastAirWeb) {
        this.eastAirWeb = eastAirWeb;
    }

    public void setXieCheng(XieCheng xieCheng) {
        this.xieCheng = xieCheng;
    }
}
