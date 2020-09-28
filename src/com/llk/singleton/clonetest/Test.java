package com.llk.singleton.clonetest;

//通过克隆 破坏单例
public class Test {

    public static void main(String[] args) throws Exception {
        Singleton singleton = Singleton.getInstance();
        System.out.println("getInstance() 获取的实例："+singleton.hashCode());

        Singleton clone = (Singleton) singleton.clone();
        System.out.println("通过 clone() 获取的实例："+clone.hashCode());

    }
}
