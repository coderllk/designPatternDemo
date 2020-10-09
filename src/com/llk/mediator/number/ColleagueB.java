package com.llk.mediator.number;

public class ColleagueB extends Colleague {
    public ColleagueB(Mediator mediator) {
        super(mediator);
        mediator.setColleagueB(this);
    }

    @Override
    public void setNum(int num) {
        super.setNum(num);
        //B 设置完自己的数字后，去修改 A 中的数字
        //通过中介者来修改 A 中的数字
        super.getMediator().BChangeA();
    }
}
