package com.deep.Map;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class EmployeeMain {
    public static void main(String[] args) {
        List<Employee> emp = Arrays.asList(
          new Employee(1,"Shuvradeep",Department.Math),
          new Employee(1,"Sayantan",Department.Physics),
          new Employee(1,"Suman",Department.Devops),
          new Employee(1,"Tapaswi",Department.DataEngineer)
        );

        Map<Department, List<Employee>> collect = emp.stream().collect(Collectors.groupingBy(
                Employee::getDepartment, Collectors.toList()
        ));

    }
}
