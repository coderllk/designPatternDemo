package com.llk.observer.example;

//描述航班动态数据的类
public class AirData {

    private String seq;//航班班次

    private String start;//起飞时间

    private String end;//达到时间

    private boolean delay;//是否延迟

    public String getStart() {
        return start;
    }

    public void setStart(String start) {
        this.start = start;
    }

    public String getEnd() {
        return end;
    }

    public void setEnd(String end) {
        this.end = end;
    }

    public boolean isDelay() {
        return delay;
    }

    public void setDelay(boolean delay) {
        this.delay = delay;
    }

    public String getSeq() {
        return seq;
    }

    public void setSeq(String seq) {
        this.seq = seq;
    }

    @Override
    public String toString() {
        return "AirData{" +
                "seq='" + seq + '\'' +
                ", start='" + start + '\'' +
                ", end='" + end + '\'' +
                ", delay=" + delay +
                '}';
    }
}
