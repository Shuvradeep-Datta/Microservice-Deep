package com.deep.infosys.stream.fifteenQuestion;

import java.util.List;
import java.util.stream.Stream;

public class EmployeeMain {
    public static void main(String[] args) {
        List<Employee> employees = EmployeeData.getEmployees();
//        int manager = 1;
////        Get all employees reporting to a given manager (managerId = X).
//        List<String> employees1 = allEmployeeName(manager, employees);
//        System.out.println(employees1);

//        List<Employee> list = employees.stream().filter(t -> t.getManagerId() == 0).toList();
//        System.out.println(list);

        //Get all employees reporting directly to CEO

        int ceo =1;
        List<Employee> employees1 = indirectlyCEO(ceo, employees);
        System.out.println(employees1);


    }

    private static List<Employee> indirectlyCEO(int ceo, List<Employee> employees) {

        List<Employee> direct = employees.stream().filter(t -> t.getManagerId() == ceo).toList();
        List<Employee> indirectList = direct.stream().flatMap(t -> indirectlyCEO(t.getId(), employees).stream()).toList();

        return Stream.concat(direct.stream(),indirectList.stream()).toList();

    }

//    private static List<Employee> directlyToCEO(int ceo, List<Employee> employees) {
//        List<Employee> list = employees.stream().filter(t -> t.getManagerId() == ceo).toList();
//        return list;
//    }

//    private static List<String> allEmployeeName(int manager, List<Employee> employees) {
//        List<String> list = employees.stream().filter(e -> e.getId() == manager).map(Employee::getName).toList();
//        return list;
//
//    }

//    private static List<Employee> allEmployee(int manager, List<Employee> employees) {
//
//        List<Employee> list = employees.stream().filter(e -> e.getManagerId() == manager).toList();
////        System.out.println(list);
//        return list;
//    }

}
