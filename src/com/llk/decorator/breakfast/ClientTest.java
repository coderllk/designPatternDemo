package com.llk.decorator.breakfast;

public class ClientTest {
    public static void main(String[] args) {
        //用户先点一个肉夹馍
        Roujiamo roujiamo = new Roujiamo();
        //加一份生菜
        Lettuce lettuce = new Lettuce(roujiamo);
        //加一份土豆
        Potato potato = new Potato(lettuce);
        //加一份腊肉
        Larou larou = new Larou(potato);
        System.out.println(larou.cost());//加了辅料后的价格
        System.out.println(larou.getDescription());
    }
}
