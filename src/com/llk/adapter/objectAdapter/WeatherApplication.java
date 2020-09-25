package com.llk.adapter.objectAdapter;

public class WeatherApplication {

    private IWeather weather;

    public WeatherApplication(IWeather weather){
        this.weather = weather;
    }

    public String get(String city){
        return this.weather.getWeather(city);
    }

}
