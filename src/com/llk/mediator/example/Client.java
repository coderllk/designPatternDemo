package com.llk.mediator.example;

public class Client {
    public static void main(String[] args) {
        Mediator mediator = new ConcreteMediator();

        ConcreteColleagueA colleagueA = new ConcreteColleagueA(mediator);
        ConcreteColleagueB colleagueB = new ConcreteColleagueB(mediator);

        //colleagueA.methodA();
        colleagueB.methodB();
    }
}
