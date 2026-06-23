package com.deep.durgesh;

import java.io.Serializable;

public class Samosa implements Cloneable {

    //To create singleton class


    private static Samosa samosa;

    private Samosa(){
//        if (samosa!=null){
//            throw new RuntimeException("You are trying to break Singleton pattern.");
//        }

    }

    public static  Samosa getSamosa(){
        if(samosa ==null){
          samosa = new Samosa();
        }

        return samosa;
    }


    public Object readResolve(){
        return samosa;
    }

    public Object clone() throws CloneNotSupportedException {
        //return super.clone();//its breaking Singleton
        return samosa; //fix
    }





}
