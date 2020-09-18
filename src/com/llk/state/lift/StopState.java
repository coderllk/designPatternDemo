package com.llk.state.lift;

public class StopState extends AbstractState {

    private Context context;

    public StopState(Context context){
        this.context = context;
    }

    @Override
    public void chooseFloor() {
        System.out.println("选择了楼层");
        //在停止状态，选择楼层后，电梯将切换到运行状态
        context.setCurrentState(new RunState(context));
    }

    @Override
    public void closeDoor() {
        System.out.println("关闭电梯门");
        context.setCurrentState(new StopState(context));
    }

    @Override
    public void openDoor() {
        System.out.println("打开电梯门");
        context.setCurrentState(new StopState(context));
    }

    @Override
    public void run() {
        System.out.println("电梯运行");
        context.setCurrentState(new RunState(context));
    }
}
