package com.llk.decorator.breakfast;

public class Wheaten extends Food {

    @Override
    public int cost() {
        return this.getPrice();
    }

}
