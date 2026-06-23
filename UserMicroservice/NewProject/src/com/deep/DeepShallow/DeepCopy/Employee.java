package com.deep.DeepShallow.DeepCopy;

public class Employee  implements Cloneable{
    public int id;
    Address address;




    public Employee clone() throws CloneNotSupportedException{
        Employee copy = (Employee) super.clone();
        copy.address = new Address(this.address.city);

        return copy;


    }
}
