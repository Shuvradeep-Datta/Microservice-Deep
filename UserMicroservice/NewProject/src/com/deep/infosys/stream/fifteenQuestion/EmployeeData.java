package com.deep.infosys.stream.fifteenQuestion;

import java.util.Arrays;
import java.util.List;

import java.util.Arrays;
import java.util.List;

public class EmployeeData {

    public static List<Employee> getEmployees() {

        return Arrays.asList(

                // --------------------------------------------
                // CEO LEVEL (Top of hierarchy, managerId = 0)
                // --------------------------------------------
                new Employee(1, "Ratan Tata", "Executive", 200000, 60, 0,
                        Arrays.asList("Leadership", "Strategy")),

                // --------------------------------------------
                // MANAGER LEVEL (Reports to CEO : managerId = 1)
                // --------------------------------------------
                new Employee(2, "Amit Sharma", "IT", 120000, 45, 1,
                        Arrays.asList("Java", "Architecture")),
                new Employee(3, "Sunita Mehra", "HR", 110000, 42, 1,
                        Arrays.asList("People Mgmt", "Policy")),
                new Employee(4, "Prakash Rao", "Finance", 115000, 48, 1,
                        Arrays.asList("Budgeting", "Audit")),

                // --------------------------------------------
                // TEAM LEAD LEVEL (Reports to IT Manager : 2)
                // --------------------------------------------
                new Employee(12, "Deepak Verma", "IT", 90000, 38, 2,
                        Arrays.asList("DevOps", "Cloud")),

                // --------------------------------------------
                // EMPLOYEE LEVEL — IT EMPLOYEES (Report to Manager 2)
                // --------------------------------------------
                new Employee(5, "Rahul Kumar", "IT", 70000, 28, 2,
                        Arrays.asList("Java", "Spring")),
                new Employee(6, "Sneha Gupta", "IT", 75000, 30, 2,
                        Arrays.asList("AWS", "Microservices")),
                new Employee(7, "Vikas Singh", "IT", 65000, 27, 2,
                        Arrays.asList("React", "Node")),

                // EMPLOYEES REPORTING TO TEAM LEAD (12)
                new Employee(13, "Rohit Jain", "IT", 40000, 24, 12,
                        Arrays.asList("HTML", "CSS", "JavaScript")),
                new Employee(14, "Meena Kumari", "IT", 42000, 23, 12,
                        Arrays.asList("Testing", "Automation")),

                // --------------------------------------------
                // HR TEAM (Reports to HR Manager : 3)
                // --------------------------------------------
                new Employee(8, "Anjali Das", "HR", 55000, 29, 3,
                        Arrays.asList("Recruitment")),
                new Employee(9, "Tarun Yadav", "HR", 50000, 26, 3,
                        Arrays.asList("Training")),
                new Employee(15, "Pooja Mishra", "HR", 48000, 25, 3,
                        Arrays.asList("Onboarding")),

                // --------------------------------------------
                // FINANCE TEAM (Reports to Finance Manager : 4)
                // --------------------------------------------
                new Employee(10, "Kiran Patel", "Finance", 60000, 32, 4,
                        Arrays.asList("Accounts")),
                new Employee(11, "Manoj Singh", "Finance", 65000, 35, 4,
                        Arrays.asList("Taxation"))
        );
    }
}
