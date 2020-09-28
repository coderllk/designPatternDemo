package com.llk.singleton.first;

public class Test {

    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();

        System.out.println(singleton == singleton2);
    }

}
