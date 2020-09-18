package com.llk.state.lift;

public interface State {

    //选择楼层
    void chooseFloor();

    //关闭电梯门
    void closeDoor();

    //打开电梯门
    void openDoor();

    //使电梯运行
    void run();

    //使电梯停止运行
    void stop();
}
