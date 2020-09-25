package com.llk.adapter.objectAdapter;


import com.alibaba.fastjson.JSONObject;

/**
 * 墨迹天气 jar 包提供的获取天气情况的方法
 */
public class MoJiWeather {

    public JSONObject getCurrentWeather(String city){
        JSONObject weather = new JSONObject();
        weather.put("city",city);
        weather.put("temperature",20);//温度
        weather.put("type","sun");//天气：下雨、太阳等
        return weather;
    }

}
