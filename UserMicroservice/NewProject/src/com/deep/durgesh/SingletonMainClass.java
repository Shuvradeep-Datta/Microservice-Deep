package com.deep.durgesh;

import java.io.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class SingletonMainClass {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException, IOException, ClassNotFoundException, CloneNotSupportedException {

//        System.out.println(samosa1.hashCode());
//
//        //break the Singleton Pattern
//
//        Constructor<Samosa> declaredConstructor = Samosa.class.getDeclaredConstructor();
//        declaredConstructor.setAccessible(true);
//        Samosa samosa = declaredConstructor.newInstance();
//        System.out.println(samosa.hashCode());


        //Serialize
//        Samosa samosa = Samosa.getSamosa();
//        System.out.println(samosa.hashCode());
//        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("abc.java"));
//        oos.writeObject(samosa);
//
//
//        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("abc.java"));
//        Samosa samosa1 = (Samosa) ois.readObject();
//        System.out.println(samosa1.hashCode());


        Samosa samosa1 = Samosa.getSamosa();
        System.out.println(samosa1.hashCode());


        Samosa cloneSamosa = (Samosa) samosa1.clone();
        System.out.println(cloneSamosa.hashCode());


    }
}
