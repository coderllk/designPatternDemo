package com.llk.adapter.classAdapter;

import com.alibaba.fastjson.JSONObject;

public class MoJiWeatherAdapter extends MoJiWeather implements IWeather{

    public String getWeather(String city){
        JSONObject weather = getCurrentWeather(city);
        //转化
        String resWeather = weather.toJSONString();
        return resWeather;
    }

}
