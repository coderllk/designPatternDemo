package com.llk.singleton.serializabletest;

import java.io.*;

//通过反序列化破坏单例
public class Test {
    public static void main(String[] args) throws Exception {
        Singleton singleton = Singleton.getInstance();
        System.out.println("getInstance() 获取的实例："+singleton.hashCode());
        //序列化对象到文件中
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("E:/singleton.txt"));
        oos.writeObject(singleton);
        if(oos!=null){
            oos.close();
        }
        //反序列化
        File file = new File("E:/singleton.txt");
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));
        Singleton singleton2 = (Singleton) ois.readObject();

        System.out.println("反序列化获取的实例："+singleton2.hashCode());

        if(ois!=null){
            ois.close();
        }

    }
}
