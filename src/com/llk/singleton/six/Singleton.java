package com.llk.singleton.six;

import java.util.Date;

//枚举类实现单例
public enum  Singleton {
    INSTANCE;//可以把它看成是 Singleton 的一个实例

    //定义一些方法
    public void doAction(){
        System.out.println("doAction()");
    }
}
