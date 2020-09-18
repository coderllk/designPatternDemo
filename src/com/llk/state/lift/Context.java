package com.llk.state.lift;

public class Context {

    private State currentState;//当前状态

    public Context(){
        //开始时的默认状态为 停止状态
        currentState = new StopState(this);
    }

    public void chooseFloor() {
        currentState.chooseFloor();
    }

    public void closeDoor() {
        currentState.closeDoor();
    }

    public void openDoor() {
        currentState.openDoor();
    }

    public void run() {
        currentState.run();
    }

    public void stop() {
        currentState.stop();
    }

    public void setCurrentState(State currentState) {
        this.currentState = currentState;
    }
}
