package com.llk.decorator.breakfast;

/**
 * 所有具体的辅料类，即 ConcreteDecorator 类
 */


class Lettuce extends Material {
    public Lettuce(Food food) {
        super(food);
        this.setPrice(1);
        this.setDescription("生菜");
    }
    //本例的 cost() 方法就直接采用 Material 的默认实现
}

class Potato extends Material {
    public Potato(Food food) {
        super(food);
        this.setPrice(2);
        this.setDescription("土豆丝");
    }
}

class Egg extends Material {
    public Egg(Food food) {
        super(food);
        this.setPrice(2);
        this.setDescription("鸡蛋");
    }
}

class Lijirou extends Material {
    public Lijirou(Food food) {
        super(food);
        this.setPrice(4);
        this.setDescription("里脊肉");
    }
}

class Larou extends Material {
    public Larou(Food food) {
        super(food);
        this.setPrice(5);
        this.setDescription("腊肉");
    }
}


