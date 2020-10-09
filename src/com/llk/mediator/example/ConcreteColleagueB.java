package com.llk.mediator.example;

public class ConcreteColleagueB extends Colleague {
    public ConcreteColleagueB(Mediator mediator) {
        super(mediator);
        mediator.setColleagueB(this);
    }

    @Override
    public void methodA() {
        System.out.println("ConcreteColleagueB methodA()");
    }

    @Override
    public void methodB() {
        System.out.println("ConcreteColleagueB methodB()");
        super.getMediator().dealSomething("colleagueB");
    }
}
