package com.llk.decorator.breakfast;

/**
 * 辅料基类，即 Decorator
 */
public class Material extends Food {

    //被修饰的主食对象，或者是包含主食的辅料对象
    private Food food;

    public Material(Food food){
        this.food = food;
    }

    /**
     * 各个装饰者子类使用该 cost() 方法来装饰 主食类的 cost() 方法
     * @return
     */
    @Override
    public int cost() {
        //返回辅料的价格 和 主食的价格
        return super.getPrice()+food.cost();
    }

    /**
     * 各个装饰者子类使用该 getDescription() 方法来装饰 主食类的 getDescription() 方法
     * @return
     */
    @Override
    public String getDescription() {
        //将辅料的描述与主食的描述信息拼接，表示用户点了该主食和相应的辅料
        return super.getDescription() +" " +food.getDescription();
    }
}
