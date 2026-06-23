package com.deep.infosys.stream.Hierarchy;

import java.io.Serializable;
import java.util.concurrent.Callable;

import java.util.List;

public class Employee {

    private int id;
    private String name;
    private String department;
    private double salary;
    private int age;
    private int managerId;   // 0 = CEO
    private List<String> skills;

    public Employee() {}

    public Employee(int id, String name, String department, double salary,
                    int age, int managerId, List<String> skills) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
        this.age = age;
        this.managerId = managerId;
        this.skills = skills;
    }

    public int getId() { return id; }
    public String getName() { return name; }
    public String getDepartment() { return department; }
    public double getSalary() { return salary; }
    public int getAge() { return age; }
    public int getManagerId() { return managerId; }
    public List<String> getSkills() { return skills; }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", department='" + department + '\'' +
                ", salary=" + salary +
                ", age=" + age +
                ", managerId=" + managerId +
                ", skills=" + skills +
                '}';
    }
}
