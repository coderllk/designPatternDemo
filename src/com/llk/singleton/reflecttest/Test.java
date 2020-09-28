package com.llk.singleton.reflecttest;

public class Test {

    public static void main(String[] args) {
        //Singleton instance = Singleton.getInstance();
        for(int i = 1;i<=5;i++){
            ThreadTest threadTest = new ThreadTest("thread"+i);
            threadTest.start();
        }
    }

}
