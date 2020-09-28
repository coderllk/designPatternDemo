package com.llk.singleton.second;

public class Test {
    public static void main(String[] args) {
        /*//简单懒汉式测试
        Singleton singleton = Singleton.getInstance();
        Singleton singleton1 = Singleton.getInstance();

        System.out.println(singleton == singleton1);*/


        //验证多线程下懒汉式是否能达到单例的效果
        TestThread thread1 = new TestThread("thread1");
        TestThread thread2 = new TestThread("thread2");
        TestThread thread3 = new TestThread("thread3");
        TestThread thread4 = new TestThread("thread4");
        TestThread thread5 = new TestThread("thread5");
        TestThread thread6 = new TestThread("thread6");

        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
        thread5.start();
        thread6.start();



    }
}
