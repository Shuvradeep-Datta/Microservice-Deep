package com.deep.DeepShallow.DeepCopy;

public class DeepCopyMain {
    public static void main(String[] args) throws CloneNotSupportedException{
       Employee e1 = new Employee();
       e1.id=1;

       e1.address = new Address("Delhi");

       Employee e2 = e1.clone();
       e2.address.city = "Kolkata";

        System.out.println(e1.address.city);

    }
}
