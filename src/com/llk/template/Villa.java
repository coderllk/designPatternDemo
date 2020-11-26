package com.llk.template;

//别墅
public class Villa extends TemplateHouse{
    @Override
    protected void buildBase() {
        System.out.println("别墅：打 5 米深的地基");
    }

    @Override
    protected void buildWall() {
        System.out.println("别墅：砌 50 厘米厚的砖墙");
    }

    @Override
    protected void buildRoof() {
        System.out.println("别墅：盖屋顶，哥特式风格的屋顶");
    }

    @Override
    protected void buildSwimPool() {
        System.out.println("别墅：建一个 100 平方米的游泳池");
    }
}
