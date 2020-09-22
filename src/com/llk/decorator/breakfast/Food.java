package com.llk.decorator.breakfast;

/**
 * 食品类，即 Component
 */
public abstract class Food {

    private int price;//价格
    private String description;//描述

    public abstract int cost();

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
