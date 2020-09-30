package com.llk.observer.air;

import com.llk.observer.example.AirData;

//携程网
public class XieChengObserver implements Observer {
    @Override
    public void update(AirData airData) {
        System.out.println("携程获取到最新航班动态："+airData.toString());
    }
}
