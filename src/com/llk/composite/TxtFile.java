package com.llk.composite;

public class TxtFile extends File {
    public TxtFile(String name, int size) {
        super(name+".txt", size);
    }

    @Override
    public void display() {
        String prex = "";
        for(int i = 0;i<super.getHeight();i++){
            prex = prex+"--";
        }
        System.out.println(prex+super.getName());
    }

    @Override
    public int countSize() {
        return super.getSize();
    }
}
