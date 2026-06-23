package com.deep.infosys.stream;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EmployeeMain {

    public static void main(String[] args) {

        List<Employee> employees = EmployeeData.getEmployees();
//    Answer of 1
//        List<Employee> employeeList = employees.stream()
//                .filter(e -> e.getDepartment().equalsIgnoreCase("IT"))
//                .toList();
//
//        System.out.println(employeeList);
//        Answer of 2
//        List<Employee> employeeList = employees.stream().filter(e -> e.getSalary() > 50000).toList();
//        System.out.println(employeeList);

//        Answer of 3
//        Comparator<Employee> comparing = Comparator.comparing(Employee::getSalary);
//
//        List<Employee> employeeList1 = employees.stream().sorted(comparing).toList();
//        System.out.println(employeeList1);
//        Comparator<Employee> comparing = Comparator.comparing(Employee::getSalary);
//
//        Employee employee = employees.stream().sorted(comparing).findFirst().get();
//        System.out.println(employee);

        //Grouping By Department
//        Map<String,Long> employee= employees.stream().collect(Collectors.groupingBy(
//                Employee::getDepartment,
//                Collectors.counting()
//        ));
//
//        System.out.println(employee);

//        Comparator<Employee> comparing = Comparator.comparing(Employee::getSalary);
//
//        Employee employee = employees.stream().sorted(comparing).findFirst().get();
//        System.out.println(employee);


//        Map<String, Long> collect = employees.stream().collect(
//                Collectors.groupingBy(
//                        Employee::getDepartment,
//                        Collectors.counting()));
//
//        Optional<String> s = collect.entrySet().stream().max(Map.Entry.comparingByValue()).map(Map.Entry::getKey);
//        System.out.println(s.get());

//        //Average Salary of each department
//        Map<String, Double> collect = employees.stream().collect(Collectors.groupingBy(
//                Employee::getDepartment,
//                Collectors.averagingDouble(Employee::getSalary)
//        ));
//        System.out.println(collect);


//        //Total Salary Budget
//        double sum = employees.stream().mapToDouble(Employee::getSalary).sum();
//        System.out.println(sum);

        //Get Employee name whose name start with

//        String s = employees.stream().filter(e -> e.getName().startsWith("A")).map(Employee::getName).findFirst().get();
//        System.out.println(s);

//        List<Employee> employeeList = employees.stream().filter(e -> e.getAge() > 30).toList();
//        System.out.println(employeeList);

//        //Employee Skill with Java
//        List<Employee> employeeList = employees.stream().filter(e -> e.getSkills().stream().anyMatch(s->"java".equalsIgnoreCase(s))).toList();
//        System.out.println(employeeList);


//        List<String> list = employees.stream().flatMap(t -> t.getSkills().stream()).distinct().toList();
//        System.out.println(list);


//        Create Map<Department, List<Employee>>

//        Map<Integer, String> collect = employees.stream().collect(Collectors.toMap(
//                Employee::getId,
//                Employee::getName
//
//        ));
//
//        System.out.println(collect);


        //Sorted by Multiple Condition
        Comparator<Employee> employeeComparator = Comparator.comparing(Employee::getSalary).thenComparing(Employee::getAge).thenComparing(Employee::getName);


//        List<Employee> employeeList = employees.stream().sorted(employeeComparator).toList();
//        System.out.println(employeeList);

//        Partition employees into salary >50k and ≤50k

//        Map<Boolean, List<Employee>> mapOfEmployee = employees.stream().collect(Collectors.partitioningBy(t -> t.getSalary() >= 50000));
//        Set<Map.Entry<Boolean, List<Employee>>> entries = mapOfEmployee.entrySet();
//        for(Map.Entry<Boolean, List<Employee>> entry:entries){
//            if(entry.getKey()){
//                System.out.println("Greater Than or Equals 50000");
//            }else {
//                System.out.println("Less than 50000");
//            }
//
//            for(Employee s:entry.getValue()){
//                System.out.println(s);
//            }
//        }

//        Comparator<Employee> employeeComparator1 = Comparator.comparing(Employee::getSalary).reversed();
//        Employee employee = employees.stream().sorted(employeeComparator1).skip(2).findFirst().get();
//        System.out.println(employee);

//        Set<String> collect = employees.stream().collect(Collectors.groupingBy(Employee::getName,
//                Collectors.counting()
//        )).entrySet().stream().filter(e -> e.getValue() > 1).map(Map.Entry::getKey).collect(Collectors.toSet());
//
//        System.out.println(collect);


//        Count how many employees have each skill

//        Map<String, Long> collect = employees.stream().flatMap(e -> e.getSkills().stream()).collect(Collectors.groupingBy(
//                Function.identity(),
//                Collectors.counting()
//
//        ));
//        System.out.println(collect);


//        String collect = employees.stream().map(Employee::getName).collect(Collectors.joining(",", "[", "]"));
//        System.out.println(collect);

//        Find highest salary employee in each department


//        Map<String, String> collect = employees.stream().collect(Collectors.groupingBy(
//                Employee::getDepartment,
//               Collectors.collectingAndThen(
//                 Collectors.maxBy(Comparator.comparingDouble(Employee::getSalary)),
//                 opt->opt.get().getName()
//               )
//
//        ));
//
//        System.out.println(collect);


//        Find youngest employee in each department

//        Map<String, String> collect = employees.stream().collect(Collectors.groupingBy(
//                Employee::getDepartment,
//                Collectors.collectingAndThen(
//                        Collectors.minBy(Comparator.comparingInt(Employee::getAge)),
//                        opt -> opt.get().getName()
//                )
//
//        ));
//
//        System.out.println(collect);
//        Comparator<Employee> comparing = Comparator.comparing(Employee::getExperienceInYears).reversed();
//
//
//        Employee employee = employees.stream().sorted(comparing).findFirst().get();
//        System.out.println(employee);

//        Find employees with salary between 40k and 60k

//        List<Employee> employeeList = employees.stream().filter(t -> t.getSalary() >= 50000 && t.getSalary() <= 60000).toList();
//        System.out.println(employeeList);


//        Handling null values safely in Stream (Objects::nonNull)
//        List<Employee> employeeList = employees.stream().filter(t ->Objects.nonNull(t.getDepartment())).toList();
//        System.out.println(employeeList);


//        Custom sort: Sort employees by name length
//        Comparator<Employee> comparing = Comparator.comparing(Employee::getName);
//        List<Employee> employeeList = employees
//                .stream().sorted(comparing).toList();
//        System.out.println(employeeList);


//        Collect employee names into TreeSet (sorted order)

//        TreeSet<String> collect = employees.stream().map(Employee::getName).collect(Collectors.toCollection(TreeSet::new));
//        System.out.println(collect);

//        Convert List<Employee> → Map<Department, TotalSalary>

//        Map<String, Double> collect = employees.stream().filter(t -> t.getDepartment() != null).collect(Collectors.groupingBy(
//                Employee::getDepartment,
//                Collectors.summingDouble(Employee::getSalary)
//        ));
//
//        System.out.println(collect);


//        Identify employees with more than 2 skills

        List<Employee> employeeList = employees.stream().filter(e -> e.getSkills().size() > 2).toList();

        System.out.println(employeeList);
    }

}
