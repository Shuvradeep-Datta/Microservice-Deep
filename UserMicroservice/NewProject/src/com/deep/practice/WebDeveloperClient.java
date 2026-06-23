package com.deep.practice;

public class WebDeveloperClient {
    public static void main(String[] args) {
        Employee androidDeveloper = EmployeeFactoryMethod.employeeSalary("AndroidDeveloper");
        System.out.println(androidDeveloper
                .salary());

        Employee webDeveloper = EmployeeFactoryMethod.employeeSalary("WebDeveloper");
        System.out.println(webDeveloper
                .salary());
    }
}
