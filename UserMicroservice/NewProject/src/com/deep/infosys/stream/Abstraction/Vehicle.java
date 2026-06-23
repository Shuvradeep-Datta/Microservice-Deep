package com.deep.infosys.stream.Abstraction;

  abstract class Vehicle {
      //This is partial implemented class

      //Instance variable
      int a=10;

        //Abstarct method
     abstract void tvs();

      //Concrete method
      void bajaj(){
          System.out.println("This is bajaj ct 100");
      }



      //Constructor


      public Vehicle(int a) {
          this.a = a;
      }
  }
