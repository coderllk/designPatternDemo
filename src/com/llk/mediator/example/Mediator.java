package com.llk.mediator.example;

public abstract class Mediator {
    private ConcreteColleagueA colleagueA;
    private ConcreteColleagueB colleagueB;

    public abstract void dealSomething(String message);

    public ConcreteColleagueA getColleagueA() {
        return colleagueA;
    }

    public void setColleagueA(ConcreteColleagueA colleagueA) {
        this.colleagueA = colleagueA;
    }

    public ConcreteColleagueB getColleagueB() {
        return colleagueB;
    }

    public void setColleagueB(ConcreteColleagueB colleagueB) {
        this.colleagueB = colleagueB;
    }
}
