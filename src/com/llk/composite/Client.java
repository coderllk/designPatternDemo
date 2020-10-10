package com.llk.composite;

public class Client {
    public static void main(String[] args) {
        Folder firstFolder = new Folder("firstFolder");
        firstFolder.setHeight(0);
        TxtFile firstTxt = new TxtFile("firstTxt",1);
        firstFolder.add(firstTxt);

        Folder secondFolder = new Folder("secondFolder");
        firstFolder.add(secondFolder);
        TxtFile secondTxt = new TxtFile("secondTxt",3);
        TxtFile thirdTxt = new TxtFile("thirdTxt",4);
        secondFolder.add(secondTxt);
        secondFolder.add(thirdTxt);


        Folder thirdFolder = new Folder("thirdFolder");
        firstFolder.add(thirdFolder);
        TxtFile fourthTxt = new TxtFile("fourthTxt",6);
        thirdFolder.add(fourthTxt);

        //显示文件树
        firstFolder.display();

        //显示firstFolder文件夹所占空间大小
        System.out.println("firstFolder所占空间："+firstFolder.countSize()+"M" );
    }
}
