package com.llk.mediator.example;

public class ConcreteMediator extends Mediator {

    /**
     *
     * @param message：中介者收到什么样的 消息 就进行相应的处理
     *               与同事类中调用该方法是传入的值要匹配
     */
    @Override
    public void dealSomething(String message) {
        if("colleagueA".equals(message)){
            super.getColleagueB().methodA();
        }else if("colleagueB".equals(message)){
            super.getColleagueA().methodC();
            super.getColleagueA().methodB();
            super.getColleagueA().methodA();
        }
    }
}
