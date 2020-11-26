package com.llk.template;

//普通房子
public class CommonHouse extends TemplateHouse{

    @Override
    protected void buildBase() {
        System.out.println("普通房子：打 2 米深的地基");
    }

    @Override
    protected void buildWall() {
        System.out.println("普通房子：砌 30厘米厚的土墙");
    }

    @Override
    protected void buildRoof() {
        System.out.println("普通房子：盖屋顶，平顶式屋顶");
    }
}
