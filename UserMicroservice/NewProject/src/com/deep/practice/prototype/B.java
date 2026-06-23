package com.deep.practice.prototype;

import com.deep.practice.A;

 class B extends A {
   int x=10;

     public B() {
         System.out.println("Inside constructor B....");
     }

     private void show() {
        System.out.println("Showing method..."+x);
    }

    public static void main(String[] args) {
        new B();
    }
}
