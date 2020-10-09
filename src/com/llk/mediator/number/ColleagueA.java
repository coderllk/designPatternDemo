package com.llk.mediator.number;

public class ColleagueA extends Colleague {
    public ColleagueA(Mediator mediator) {
        super(mediator);
        mediator.setColleagueA(this);
    }

    @Override
    public void setNum(int num) {
        super.setNum(num);
        //A 设置完自己的数字后，去修改 B 中的数字
        //通过中介者来修改 B 中的数字
        super.getMediator().AChangeB();
    }
}
