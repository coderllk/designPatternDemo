package com.llk.singleton.first;

//饿汉式
public class Singleton {

    //构造器私有化，其他的内不能通过 new Singleton() 来创建对象
    private Singleton(){

    }

    //指向单实例的私有静态变量
    private static Singleton instance = new Singleton();

    //其他类获取该单实例的方法
    public static Singleton getInstance(){
        return instance;
    }

}
