package com.llk.state.lift;

public class ClientTest {

    public static void main(String[] args) {
        Context context = new Context();//创建上下文对象
        context.openDoor();//打开电梯门，用进入电梯
        context.closeDoor();//用户关闭电梯门
        context.run();//电梯开始运行
        context.chooseFloor();//选择楼层
        context.chooseFloor();//选择楼层
        context.stop();//电梯停止
        context.openDoor();//电梯开门

        /*Context context = new Context();//创建上下文对象
        context.openDoor();//打开电梯门，用进入电梯
        context.closeDoor();//用户关闭电梯门
        context.run();//电梯开始运行
        context.chooseFloor();//选择楼层
        context.openDoor();*/
    }
}
