package com.llk.template;

public class Test {
    public static void main(String[] args) {

        System.out.println("建造普通房子：");
        TemplateHouse commonHouse = new CommonHouse();
        commonHouse.buildHose();

        System.out.println();
        System.out.println("建造别墅：");
        Villa villa = new Villa();
        villa.buildHose();
    }
}
