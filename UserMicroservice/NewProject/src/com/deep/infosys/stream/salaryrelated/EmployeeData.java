package com.deep.infosys.stream.salaryrelated;

import com.deep.infosys.stream.Hierarchy.Employee;

import java.util.Arrays;
import java.util.List;

public class EmployeeData {

    public static List<com.deep.infosys.stream.Hierarchy.Employee> getEmployees() {

        return Arrays.asList(

                // CEO Level (managerId = 0)
                new com.deep.infosys.stream.Hierarchy.Employee(1, "Ratan Tata", "Executive", 200000, 60, 0,
                        Arrays.asList("Leadership", "Strategy")),

                // MANAGERS (report to CEO)
                new com.deep.infosys.stream.Hierarchy.Employee(2, "Amit Sharma", "IT", 120000, 45, 1,
                        Arrays.asList("Java", "Architecture")),
                new com.deep.infosys.stream.Hierarchy.Employee(3, "Sunita Mehra", "HR", 110000, 42, 1,
                        Arrays.asList("People Mgmt", "Policy")),
                new com.deep.infosys.stream.Hierarchy.Employee(4, "Prakash Rao", "Finance", 115000, 48, 1,
                        Arrays.asList("Budgeting", "Audit")),

                // TEAM UNDER MANAGER — IT TEAM (managerId = 2)
                new com.deep.infosys.stream.Hierarchy.Employee(5, "Rahul", "IT", 70000, 28, 2,
                        Arrays.asList("Java", "Spring")),
                new com.deep.infosys.stream.Hierarchy.Employee(6, "Sneha", "IT", 75000, 30, 2,
                        Arrays.asList("AWS", "Microservices")),
                new com.deep.infosys.stream.Hierarchy.Employee(7, "Vikas", "IT", 65000, 27, 2,
                        Arrays.asList("React", "Node")),

                // TEAM UNDER MANAGER — HR TEAM (managerId = 3)
                new com.deep.infosys.stream.Hierarchy.Employee(8, "Anjali", "HR", 55000, 29, 99,
                        Arrays.asList("Recruitment")),
                new com.deep.infosys.stream.Hierarchy.Employee(9, "Tarun", "HR", 50000, 26, 3,
                        Arrays.asList("Training")),

                // TEAM UNDER MANAGER — FINANCE TEAM (managerId = 4)
                new com.deep.infosys.stream.Hierarchy.Employee(10, "Kiran", "Finance", 60000, 32, 4,
                        Arrays.asList("Accounts")),
                new com.deep.infosys.stream.Hierarchy.Employee(11, "Manoj", "Finance", 65000, 35, 4,
                        Arrays.asList("Taxation")),

                // EXTRA TEAM LEAD LEVEL (optional deeper hierarchy)
                new com.deep.infosys.stream.Hierarchy.Employee(12, "Deepak", "IT", 90000, 38, 2,
                        Arrays.asList("DevOps", "Cloud")),
                new com.deep.infosys.stream.Hierarchy.Employee(13, "Rohit", "IT", 40000, 24, 12,
                        Arrays.asList("HTML", "CSS", "JavaScript")),
                new com.deep.infosys.stream.Hierarchy.Employee(14, "Meena", "IT", 42000, 23, 12,
                        Arrays.asList("Testing", "Automation")),

                // Another hierarchy under Manager HR
                new Employee(15, "Pooja", "HR", 48000, 25, 3,
                        Arrays.asList("Onboarding"))
        );
    }
}


