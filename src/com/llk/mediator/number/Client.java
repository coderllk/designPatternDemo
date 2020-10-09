package com.llk.mediator.number;

public class Client {
    public static void main(String[] args) {
        Mediator mediator = new ConcreteMediator();

        ColleagueA colleagueA = new ColleagueA(mediator);
        ColleagueB colleagueB = new ColleagueB(mediator);

        System.out.println("设置 A 中的数字：100");
        colleagueA.setNum(100);
        System.out.println("A 中的数字："+colleagueA.getNum());
        System.out.println("B 中的数字："+colleagueB.getNum());

        System.out.println("*****************");

        System.out.println("设置 B 中的数字：100");
        colleagueB.setNum(100);
        System.out.println("A 中的数字："+colleagueA.getNum());
        System.out.println("B 中的数字："+colleagueB.getNum());
    }
}
