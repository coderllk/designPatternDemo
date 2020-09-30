package com.llk.observer.example;

public class Test {
    public static void main(String[] args) {

        EastAirLineService service = new EastAirLineService();

        EastAirWeb eastAirWeb = new EastAirWeb();
        service.setEastAirWeb(eastAirWeb);

        XieCheng xieCheng = new XieCheng();
        service.setXieCheng(xieCheng);

        //模拟一组数据
        AirData airData = new AirData();
        airData.setSeq("FM42412");
        airData.setDelay(true);
        airData.setStart("17:30");
        airData.setEnd("19:35");

        //更新最新数据
        service.setAirData(airData);

    }
}
