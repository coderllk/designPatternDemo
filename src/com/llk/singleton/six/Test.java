package com.llk.singleton.six;

public class Test {
    public static void main(String[] args) {
        Singleton instance = Singleton.INSTANCE;
        Singleton instance1 = Singleton.INSTANCE;
        instance.doAction();
        System.out.println(instance == instance1);
    }
}
