package com.deep.practice;

public class EmployeeFactoryMethod {

     public static Employee employeeSalary(String empType){
        if (empType.trim().equalsIgnoreCase("AndroidDeveloper")){
            return new AndroidDeveloper();
        } else if (empType.trim().equalsIgnoreCase("WebDeveloper")) {
            return new WebDeveloper();
        }else {
            return null;
        }
     }
}
