package com.llk.decorator.example;

class Roujiamo extends Food {

    public Roujiamo() {
        this.setDescription("肉夹馍");
        this.setPrice(5);
    }
}

class RoujiamoEgg extends Food {

    public RoujiamoEgg() {
        this.setDescription("肉夹馍 鸡蛋");
        this.setPrice(7);
    }
}

class RoujiamoEggLarou extends Food {

    public RoujiamoEggLarou() {
        this.setDescription("肉夹馍 鸡蛋 腊肉");
        this.setPrice(7);
    }
}

// ... 更多