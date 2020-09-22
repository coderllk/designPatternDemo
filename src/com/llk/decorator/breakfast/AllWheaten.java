package com.llk.decorator.breakfast;

/**
 * 所有具体的主食类，即 ConcreteComponent
 */

class Roujiamo extends Wheaten {
    public Roujiamo(){
        this.setDescription("肉夹馍");
        this.setPrice(5);
    }
}

class Jianbing extends Wheaten {
    public Jianbing(){
        this.setDescription("煎饼果子");
        this.setPrice(4);
    }
}
