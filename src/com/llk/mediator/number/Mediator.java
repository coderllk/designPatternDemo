package com.llk.mediator.number;

public abstract class Mediator {
    private ColleagueA colleagueA;
    private ColleagueB colleagueB;

    public ColleagueA getColleagueA() {
        return colleagueA;
    }

    public void setColleagueA(ColleagueA colleagueA) {
        this.colleagueA = colleagueA;
    }

    public ColleagueB getColleagueB() {
        return colleagueB;
    }

    public void setColleagueB(ColleagueB colleagueB) {
        this.colleagueB = colleagueB;
    }

    //同事 A 改变 同事 B 中的数字
    public abstract void AChangeB();

    //同事 B 改变 同事 A 中的数字
    public abstract void BChangeA();
}
