package com.gs.defaults;

import java.util.*;

public class DefaultMethodsExample1 {

    public static void main(String[] args) {

        List<String> stringList  = Arrays.asList("Adam", "Jenny", "Alex","Eric","Mike");
        /*
        Collections.sort(stringList);
        System.out.println(" Sorted List : "+stringList);*/

        stringList.sort(Comparator.naturalOrder());
        System.out.println(STR." Sorted List : \{stringList}");
        stringList.sort(Comparator.reverseOrder());
        System.out.println(STR." reversed Sorted List : \{stringList}");
        System.out.println("Sorting on Custom Objects");
        List<Employee> employeeArrayList = getEmployees();

        System.out.println(STR."Employee List without any sorting:: \{employeeArrayList}");
        System.out.println("Sorting using java 8");
        employeeArrayList.sort(Comparator.comparing(Employee::getId));

        System.out.println(STR."employeeArrayList ::\{employeeArrayList}");
        employeeArrayList.sort(Comparator.comparing(Employee::getId).reversed());
        System.out.println(STR."sorting in reverse order of employeeArrayList ::\{employeeArrayList}");
    }

    private static List<Employee> getEmployees() {
        Employee employee1 = new Employee(1,"Gulam");
        Employee employee5 = new Employee(5,"Sarwar");
        Employee employee2 = new Employee(2,"Sarwar");
        Employee employee3 = new Employee(3,"Afreen");
        Employee employee4 = new Employee(4,"Bahar");
        List<Employee> employeeArrayList = new ArrayList<Employee>();
        employeeArrayList.add(employee1);
        employeeArrayList.add(employee4);
        employeeArrayList.add(employee5);
        employeeArrayList.add(employee2);
        employeeArrayList.add(employee3);
        return employeeArrayList;
    }
}