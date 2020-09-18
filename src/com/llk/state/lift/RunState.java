package com.llk.state.lift;

public class RunState extends AbstractState {

    private Context context;

    public RunState(Context context){
        this.context = context;
    }

    @Override
    public void chooseFloor() {
        System.out.println("选择了楼层");
        context.setCurrentState(new RunState(context));
    }

    @Override
    public void stop() {
        System.out.println("电梯停止");
        context.setCurrentState(new StopState(context));
    }
}
