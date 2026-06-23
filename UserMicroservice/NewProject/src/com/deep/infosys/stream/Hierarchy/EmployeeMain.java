package com.deep.infosys.stream.Hierarchy;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EmployeeMain {
    public static void main(String[] args) {
        List<Employee> employees = EmployeeData.getEmployees();


//        Get all employees reporting to a given manager Input: managerId = 2

//        List<Employee> list = employees.stream().filter(t -> t.getManagerId() == 2).toList();
//        System.out.println(list);

//        Get employee names reporting to a given manager.

        int managerId = 2;
//
//
//        List<String> list = employees.stream().filter(t -> t.getManagerId() == 2).map(Employee::getName).toList();
//        System.out.println(list);

//        Count how many employees report to a manager.

//        Long collect = employees.stream().count();
//        System.out.println(collect);

//        boolean b = employees.stream().anyMatch(e -> e.getManagerId() == managerId);
//        System.out.println(b);

//        Create Map<ManagerName, List<Employee>> (groupingBy + mapping)


//        Map<Integer, String> managerMap = employees.stream().collect(Collectors.toMap(
//                Employee::getId,
//                Employee::getName
//        ));
//
//
//        Map<String, List<Employee>> collect = employees.stream().filter(t -> t.getManagerId() != 0)
//                .collect(Collectors.groupingBy(
//                        t -> managerMap.get(t.getManagerId()),
//                        Collectors.mapping(
//                                e -> e,
//                                Collectors.toList()
//                        )
//                ));
//
//        System.out.println(collect);




//        Find all managers (employees whose id appears as managerId in others)

//        Long list = employees.stream().filter(t -> employees.stream().anyMatch(emp -> emp.getManagerId() == t.getId())).count();
//        System.out.println(list);

//        Find employees who are NOT managers (leaf nodes)

//        Set<Employee> collect = employees.stream().filter(t -> employees.stream().anyMatch(emp -> emp.getManagerId() != t.getId())).collect(Collectors.toSet());
//        System.out.println(collect);


//        Count team size for each manager (Map<Manager, Count>)

//        Map<Integer, String> mapManager = employees.stream().collect(Collectors.toMap(
//                Employee::getId,
//                Employee::getName
//        ));
//
//        Map<String, Long> collect = employees.stream().filter(t->t.getManagerId() !=0).collect(Collectors.groupingBy(
//                e -> mapManager.get(e.getManagerId()),
//                Collectors.counting()
//        ));
//        System.out.println(collect);


//        Find the CEO (managerId = 0).

//        Employee employee = employees.stream().filter(t -> t.getManagerId() == 0).findFirst().get();
//        System.out.println(employee);


//        Get all employees who report directly to CEO
//        List<Integer> ceoList = employees.stream().filter(t -> t.getManagerId() == 0).map(Employee::getId).toList();
//
//
//        Set<Employee> collect = employees.stream().filter(t -> ceoList.contains(t.getManagerId())).collect(Collectors.toSet());
//        System.out.println(collect);

//        Get all employees who report indirectly to CEO (multi-level)

//        List<Employee> list = employees.stream().filter(t -> t.getManagerId() != 0).toList();
//        System.out.println(list);

        //Get all employees who report indirectly to CEO (multi-level).

            int ceoId =1;
//        List<Employee>indirectReports = getIndirectReports(ceoId,employees);
//        System.out.println(indirectReports);

        long l = totalNumberUnderCEO(ceoId, employees);
        System.out.println(l);

    }

    private static long totalNumberUnderCEO(int ceoId, List<Employee> employees) {

        //get Direct list
        List<Employee> direct = employees.stream().filter(e -> e.getManagerId() == ceoId).toList();
        //get Size of directList
        long directSize = direct.size();

        long indirectSize = direct.stream().mapToLong(e->totalNumberUnderCEO(e.getId(),employees)).sum();

        return directSize+indirectSize;

    }

//    private static List<Employee> getIndirectReports(int ceoId, List<Employee> employees) {
//
//        //getDirect List
//        List<Employee> direct = employees.stream().filter(e -> e.getManagerId() == ceoId).toList();
//        //get their Ids
//        List<Integer> directIds = direct.stream().map(Employee::getId).toList();
//
//        //Employees reporting to direct manager
//        List<Employee> nextLevel = employees.stream().filter(e -> directIds.contains(e.getManagerId())).toList();
//
//        //indirect manger
//
//        List<Employee> deepeer = nextLevel.stream().flatMap(t -> getIndirectReports(t.getId(), employees).stream()).toList();
//
//        return  Stream.concat(nextLevel.stream(), deepeer.stream()).toList();
//
//
//
//    Count total number of employees under CEO.



    }




