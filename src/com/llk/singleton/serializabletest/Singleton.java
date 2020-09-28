package com.llk.singleton.serializabletest;

import java.io.Serializable;

public class Singleton implements Serializable {
    private static volatile Singleton instance;//1

    public static Singleton getInstance() {//2
        if (instance == null) {//3
            synchronized (Singleton.class) {//4
                if (instance == null) {//5
                    instance = new Singleton();//6
                }
            }
        }
        return instance;
    }

    private Singleton() {
        if (instance != null) {
            throw new RuntimeException("对象已存在不可重复创建");
        }
    }

    //返回 instance
    private Object readResolve() {
        return getInstance();
    }

}
