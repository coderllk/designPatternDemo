package com.llk.mediator.number;


public class ConcreteMediator extends Mediator {
    @Override
    public void AChangeB() {
        //将 A 中的数字 除以 10 赋值给 B
        int num = super.getColleagueA().getNum();
        super.getColleagueB().changeNum( num /10 );
    }

    @Override
    public void BChangeA() {
        //将 B 中的数字 乘以 10 赋值给 A
        int num = super.getColleagueB().getNum();
        super.getColleagueA().changeNum( num *10 );
    }
}
