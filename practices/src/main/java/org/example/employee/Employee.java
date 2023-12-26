package org.example.employee;


import java.util.ArrayList;
import java.util.List;

public class Employee {
    int empNum;
    int salary;

    public Employee(int empNum, int salary) {
        this.empNum = empNum;
        this.salary = salary;
    }

    public int getEmpNum() {
        return empNum;
    }

    public void setEmpNum(int empNum) {
        this.empNum = empNum;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empNum=" + empNum +
                ", salary=" + salary +
                '}';
    }
}