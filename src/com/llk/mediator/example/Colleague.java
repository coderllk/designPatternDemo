package com.llk.mediator.example;

public abstract class Colleague {
    private Mediator mediator;
    public Colleague(Mediator mediator){
        this.mediator = mediator;
    }

    public Mediator getMediator() {
        return mediator;
    }

    public abstract void methodA();
    public abstract void methodB();
}
