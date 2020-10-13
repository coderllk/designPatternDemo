package com.llk.bridge;

//款式维度
public abstract class Collar {
    private Color color;//组合颜色维度
    private Size size;//组合大小维度

    public abstract String getCollar();

    //调用实现类中的方法
    public abstract void operateSomething();

    public String showStyle(){
        String size = this.size.getSize();
        String color = this.color.getColor();
        String collar = getCollar();
        return size+" "+color+" "+collar;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }
}
