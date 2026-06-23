package com.deep.infosys.stream.Hierarchy;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class EmployeeMain2 {
    public static void main(String[] args) {
        List<Employee> employees = EmployeeData.getEmployees();

        //Find highest-paid employee working under CEO.
        int ceo =1;
        Employee employee = highestPaid(ceo, employees).stream().max(Comparator.comparing(Employee::getSalary)).orElse(null);
        System.out.println(employee);

    }

    private static List<Employee> highestPaid(int ceo, List<Employee> employees) {
        //direct employee
        List<Employee> direct = employees.stream().filter(t -> t.getManagerId() == ceo).toList();

        List<Employee> indirect = direct.stream().flatMap(e -> highestPaid(e.getId(), employees).stream()).toList();

        return Stream.concat(direct.stream(),indirect.stream()).toList();



    }
}
