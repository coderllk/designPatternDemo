package com.llk.observer.air;

import com.llk.observer.example.AirData;

//东方航空自己的 web 网站
public class EastAirWebObserver implements Observer {
    @Override
    public void update(AirData airData) {
        System.out.println("东航web网站获取到最新航班动态："+airData.toString());
    }
}
