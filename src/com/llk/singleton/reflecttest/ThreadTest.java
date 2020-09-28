package com.llk.singleton.reflecttest;

import java.lang.reflect.Constructor;

public class ThreadTest extends Thread {

    private String name;

    public ThreadTest(String name){
        this.name = name;
    }

    @Override
    public void run() {
        //获取 Singleton 类的字节码
        Class clazz = Singleton.class;
        try {
            //获取 Singleton 类的第一个默认构造函数，即我们定义的 private Singleton(){}
            Constructor<Singleton> constructor = clazz.getDeclaredConstructors()[0];

            //设置允许访问私有的构造器，设置后，就可以调用私有的构造方法
            constructor.setAccessible(true);
            //使用构造方法创建实例
            Singleton singleton = constructor.newInstance();

            System.out.println("线程 "+ name +" 创建的实例 ："+singleton.hashCode());

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
