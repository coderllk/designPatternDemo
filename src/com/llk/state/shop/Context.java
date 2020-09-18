package com.llk.state.shop;

public class Context {

    //当前状态
    private AbstractState currentState;

    public Context(){
        //初始状态
        this.currentState = new StartState();
    }

    public void create() {
        currentState.create(this);
    }

    public void take() {
        currentState.take(this);
    }

    public void send() {
        currentState.send(this);
    }

    public void receive() {
        currentState.receive(this);
    }

    public void cancel() {
        currentState.cancel(this);
    }

    public void setCurrentState(AbstractState currentState) {
        this.currentState = currentState;
    }
}
