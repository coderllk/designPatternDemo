package com.llk.state.lift;

public abstract class AbstractState implements State {

    @Override
    public void chooseFloor() {
        System.out.println("现在不能选择楼层");
    }

    @Override
    public void closeDoor() {
        System.out.println("现在不能关闭电梯门");
    }

    @Override
    public void openDoor() {
        System.out.println("现在不能打开电梯门");
    }

    @Override
    public void run() {
        System.out.println("现在不能运行");
    }

    @Override
    public void stop() {
        System.out.println("现在不能停止");
    }
}
