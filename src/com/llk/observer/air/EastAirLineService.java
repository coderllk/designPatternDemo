package com.llk.observer.air;

import com.llk.observer.example.AirData;

import java.util.ArrayList;

/**
 * 该类是东航的航班动态服务类
 * 它的数据由机场塔台提供
 * 这些数据可以在东航自己的网站上显示，也可以提供给第三方平台使用：携程、智行
 */
public class EastAirLineService implements AirLineService {

    private AirData airData;

    //观察者列表
    private ArrayList<Observer> observerList;

    public EastAirLineService(){
        observerList = new ArrayList<Observer>();
    }

    //注册一个观察者
    @Override
    public void registerObserver(Observer observer) {
        if(null != observer) {
            observerList.add(observer);
        }
    }

    //移除一个观察者
    @Override
    public void removeObserver(Observer observer) {
        if(!observerList.contains(observer)) {
            observerList.remove(observer);
        }
    }

    //通知所有的观察者有最新动态信息
    @Override
    public void notifyObservers() {
        for(Observer o:observerList){
            o.update(airData);
        }
    }

    public void setAirData(AirData airData) {
        this.airData = airData;

        notifyObservers();
    }
}
