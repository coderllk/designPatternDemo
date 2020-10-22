package com.llk.bridge;

public class Client {
    public static void main(String[] args) {
        Color red = new Red();//创建一个颜色Implementor实例
        Size large = new Large();//创建一个尺寸大小Implementor实例

        Collar vCollar = new VCollar();//创建一个Abstraction的实例
        //给Abstraction设置Implementor
        vCollar.setColor(red);
        vCollar.setSize(large);

        System.out.println(vCollar.showStyle());
        vCollar.operateSomething();
    }
}
