package com.llk.adapter.objectAdapter;

import com.alibaba.fastjson.JSONObject;

public class MoJiWeatherAdapter implements IWeather {

    //聚合墨迹天气接口类
    private MoJiWeather moJiWeather;

    public MoJiWeatherAdapter(){
        this.moJiWeather = new MoJiWeather();
    }

    public String getWeather(String city){
        JSONObject weather = this.moJiWeather.getCurrentWeather(city);
        //转化
        String resWeather = weather.toJSONString();
        return resWeather;
    }

}
