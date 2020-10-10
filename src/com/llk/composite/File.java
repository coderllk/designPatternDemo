package com.llk.composite;

public abstract class File {
    private String name;//文件名称
    private int size;//文件大小，如果是文件夹，则为其中所有文件的大小之和
    private int height;//文件相对于根目录的深度，主要用于展示时体现层次结构

    public File(String name,int size){
        this.name = name;
        this.size = size;
    }

    //显示当前文件
    public abstract void display();

    //计算当前文件的大小
    public abstract int countSize();

    public String getName() {
        return name;
    }

    public int getSize() {
        return size;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}
