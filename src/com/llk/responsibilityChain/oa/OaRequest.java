package com.llk.responsibilityChain.oa;

public class OaRequest {
    private String name;//请假人姓名
    private int day;//请假天数

    public OaRequest(String name, int day) {
        this.name = name;
        this.day = day;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }
}
