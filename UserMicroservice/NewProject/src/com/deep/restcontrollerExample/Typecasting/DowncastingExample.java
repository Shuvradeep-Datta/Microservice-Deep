package com.deep.restcontrollerExample.Typecasting;

public class DowncastingExample {
    public static void main(String[] args) {
        Animal a = new Animal();
        if(a instanceof  Dog){
            Dog d =(Dog) a;
            System.out.println(d);
        }else{
            System.out.println("Down casting happens wrongly..");
        }


    }
}
