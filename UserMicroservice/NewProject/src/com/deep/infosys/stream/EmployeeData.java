package com.deep.infosys.stream;

import java.util.Arrays;
import java.util.List;

public class EmployeeData {

    public static List<Employee> getEmployees() {

        return Arrays.asList(
                new Employee(1, "Amit", "IT", 55000, 28, Arrays.asList("Java", "Spring"),6),
                new Employee(2, "Sita", "HR", 45000, 32, Arrays.asList("Recruitment", "Communication"),3),
                new Employee(3, "Sita", "Finance", 60000, 35, Arrays.asList("Excel", "Accounts"),7),
                new Employee(4, "Priya", "IT", 75000, 26, Arrays.asList("Java", "AWS", "Microservices"),8),
                new Employee(5, "John", "Sales", 50000, 30, Arrays.asList("Negotiation", "CRM"),5),
                new Employee(6, "Arjun", "IT", 90000, 40, Arrays.asList("Architecture", "DevOps"),10),
                new Employee(7, "Meera", "Marketing", 47000, 29, Arrays.asList("SEO", "Content Writing"),2),
                new Employee(8, "Minakshi", null, 97000, 56, Arrays.asList("Robot", "Editor","Multi Editor"),9)
        );
    }
}
