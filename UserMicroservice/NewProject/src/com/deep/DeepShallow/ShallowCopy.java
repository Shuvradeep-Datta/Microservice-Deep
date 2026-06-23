package com.deep.DeepShallow;

public class ShallowCopy {
    public static void main(String[] args) throws CloneNotSupportedException {
        Employee emp1 = new Employee();
        emp1.id =1;
        emp1.address =  new Address();
        emp1.address.city = "Mumbai";


        /*Shallow copy Explaining...*/

        Employee emp2 = emp1.clone();
        emp2.address.city = "Madras";

        System.out.println(emp1.address.city);


    }
}
