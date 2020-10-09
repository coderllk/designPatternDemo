package com.llk.mediator.example;

public class ConcreteColleagueA extends Colleague {
    public ConcreteColleagueA(Mediator mediator) {
        super(mediator);
        mediator.setColleagueA(this);
    }

    @Override
    public void methodA() {
        System.out.println("ConcreteColleagueA methodA()");
        //通过中介者来调用其他同事类的方法
        super.getMediator().dealSomething("colleagueA");
    }

    @Override
    public void methodB() {
        System.out.println("ConcreteColleagueA methodB()");
    }

    public void methodC() {
        System.out.println("ConcreteColleagueA methodC()");
    }
}
