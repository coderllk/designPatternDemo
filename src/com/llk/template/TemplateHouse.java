package com.llk.template;

public abstract class TemplateHouse {
    //模板方法：定义建房子的步骤执行顺序
    public final void buildHose(){
        buyMaterial();
        buildBase();
        buildWall();
        buildRoof();
        buildSwimPool();
    }

    //基本方法：购买原材料，水泥、沙子等
    protected void buyMaterial(){
        System.out.println("购买水泥、沙子等");
    }

    //基本方法：打地基
    protected abstract void buildBase();

    //基本方法：砌墙
    protected abstract void buildWall();

    //基本方法：盖屋顶
    protected abstract void buildRoof();

    //钩子方法：建游泳池
    protected void buildSwimPool(){
        //空方法
    }
}
