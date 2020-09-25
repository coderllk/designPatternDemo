package com.llk.adapter.objectAdapter;

public class Test {
    public static void main(String[] args) {
        WeatherApplication application = new WeatherApplication(new MoJiWeatherAdapter());
        System.out.println(application.get("mianyang"));
    }
}
