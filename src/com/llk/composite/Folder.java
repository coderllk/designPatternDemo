package com.llk.composite;

import java.util.ArrayList;
import java.util.List;

public class Folder extends File{
    private List<File> fileList;
    public Folder(String name, int size) {
        super(name, size);
        fileList = new ArrayList<>();
    }
    public Folder(String name) {
        super(name, 0);
        fileList = new ArrayList<>();
    }

    @Override
    public void display() {
        //显示当前文件夹的名称
        String prex = "";
        for(int i = 0;i<super.getHeight();i++){
            prex = prex+"--";
        }
        System.out.println(prex+super.getName());
        //循环显示该文件夹下的所有 File (可能是 TxtFile 或 Folder)
        for(File file:fileList){
            file.display();
        }
    }

    @Override
    public int countSize() {
        //当前目录下所有文件的大小之和
        int sum = 0;
        for(File file:fileList){
            sum = file.countSize() + sum;
        }
        return sum;
    }

    public void add(File file){
        file.setHeight(super.getHeight()+1);
        fileList.add(file);
    }

    public void remove(File file){
        fileList.remove(file);
    }
}
