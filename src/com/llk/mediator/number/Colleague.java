package com.llk.mediator.number;

public abstract class Colleague {
    private Mediator mediator;
    private int num ;
    public Colleague(Mediator mediator){
        this.mediator = mediator;
    }

    public Mediator getMediator() {
        return mediator;
    }

    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }
    public void changeNum(int num){
        this.num = num;
    }
}
