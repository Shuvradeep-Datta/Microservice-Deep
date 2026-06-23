package com.deep.DeepShallow;

public class Employee implements Cloneable{

    int id;
    Address address;

    public  Employee clone() throws CloneNotSupportedException{
        return (Employee) super.clone();
    }
}
