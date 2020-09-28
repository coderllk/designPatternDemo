package com.llk.singleton.three;

// synchronized 同步方法 懒汉式
public class Singleton {

    //私有化构造方法
    private Singleton(){
        if(instance !=null) {
            throw new RuntimeException("对象已存在不可重复创建");
        }
    }

    //静态私有实例引用
    private static Singleton instance;

    //返回单例实例
    public static synchronized Singleton getInstance(){
        if(instance == null){//如果未创建，则创建一个
            instance = new Singleton();
        }
        //已创建过，就直接返回
        return instance;
    }
}
