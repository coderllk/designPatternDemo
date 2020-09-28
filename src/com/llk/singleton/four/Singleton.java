package com.llk.singleton.four;

//懒汉式(双重检查机制)
public class Singleton  {
    private static volatile  Singleton instance;//1
    public static Singleton getInstance(){//2
        if(instance == null){//3
            synchronized (Singleton.class) {//4
                if(instance == null) {//5
                    instance = new Singleton();//6
                }
            }
        }
        return instance;
    }

    private Singleton(){
        if (instance != null) {
            throw new RuntimeException("对象已存在不可重复创建");
        }
    }

}
