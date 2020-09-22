package com.llk.decorator.example;

public class Food {
    private int price;//价格
    private String description;//描述



    public int cost(){
        return this.price;
    }

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
