package com.deep.infosys.stream.salaryrelated;

import com.deep.infosys.stream.Hierarchy.Employee;
import com.deep.infosys.stream.Hierarchy.EmployeeData;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class EmployeeMain {
    public static void main(String[] args) {
        List<Employee> employees = EmployeeData.getEmployees();

//        int empId =2;
//        int managerId = employees.stream().filter(e->e.getId() ==empId)
//                .map(Employee::getManagerId).findFirst().orElse(null);
////        Find colleagues of an employee (same manager)
//        List<Employee> sameColleague = employees.stream().
//                filter(e -> e.getManagerId() == managerId).filter(e -> e.getId() != empId).toList();
//        System.out.println(sameColleague);


        //Validate that each employee has a valid manager.

//        1st. Validate Employee

//        Set<Integer> validEmployee = employees.stream().map(Employee::getId).collect(Collectors.toSet());
//
//        // Check correct manager or not
//        List<Employee> invalidManager = employees.stream().filter(e -> e.getManagerId() != 0)
//                .filter(i -> !validEmployee.contains(i.getManagerId()))
//                .toList();
//        System.out.println(invalidManager);

//        Get list of employees grouped by manager → then sorted by salary.

//        Map<Integer, List<Employee>> collect = employees.stream().filter(e->e.getManagerId() != 0).collect(Collectors.groupingBy(
//                Employee::getManagerId,
//                Collectors.collectingAndThen(
//                        Collectors.toList(),
//                        list -> list.stream().sorted(Comparator.comparing(Employee::getSalary)).toList()
//                )
//        ));
//
//
//        System.out.println(collect);


//        Find manager with the largest team size



//
//        Map.Entry<Integer, Long> integerLongEntry = employees.stream().collect(Collectors.groupingBy(
//                Employee::getManagerId,
//                Collectors.counting()
//        )).entrySet().stream().max(Map.Entry.comparingByValue()).get();
//
//
//        System.out.println(integerLongEntry);


        //Find all employees whose manager salary is higher/lower than 100000
        //employeeMap Creation
//        Map<Integer, Employee> mapManager = employees.stream().collect(Collectors.toMap(
//                Employee::getId,
//                e -> e
//        ));
//
//
//        List<Employee> list = employees.stream().filter(t -> t.getManagerId() != 0).filter(e -> mapManager.get(e.getManagerId()).getSalary() > 10000).toList();
//        System.out.println(list);


//        Group employees by department → then inside that by manager

//        Map<String, Map<String, List<Employee>>> groupBydepartmentByManager =
//                employees.stream().collect(Collectors.groupingBy(
//                Employee::getDepartment,
//                Collectors.groupingBy(Employee::getDepartment)
//        ));
//
//        System.out.println(groupBydepartmentByManager);

//        For each manager, find the youngest employee in their team
        Set<Integer> onlyManager = employees.stream().map(e -> e.getManagerId()).collect(Collectors.toSet());


        Map<Integer, Employee> youngest = employees.stream().filter(e->e.getManagerId() !=0).filter(t->onlyManager.contains(t.getManagerId())).collect(Collectors.groupingBy(
                Employee::getManagerId,
                Collectors.collectingAndThen(
                        Collectors.minBy(Comparator.comparing(Employee::getAge)),
                        opt->opt.orElse(null)
                )
        ));

        System.out.println(youngest);

    }
}