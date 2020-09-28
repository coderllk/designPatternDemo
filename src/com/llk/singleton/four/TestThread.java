package com.llk.singleton.four;


public class TestThread extends Thread {

    private String name;

    public TestThread(String name){
        this.name = name;
    }

    @Override
    public void run() {
        Singleton singleton = Singleton.getInstance();
        System.out.println("线程 "+name+" 获取到的实例："+singleton.hashCode());
    }
}
