package com.llk.singleton.five;

//静态内部类的方式
public class Singleton {

    private Singleton(){
        if(InnerSingleton.INSTANCE != null){
            throw new RuntimeException("对象已存在不可重复创建");
        }
    }

    //静态内部类
    private static class InnerSingleton{
        private static Singleton INSTANCE  = new Singleton();
    }

    public static Singleton getInstance(){
        return InnerSingleton.INSTANCE;
    }
}
