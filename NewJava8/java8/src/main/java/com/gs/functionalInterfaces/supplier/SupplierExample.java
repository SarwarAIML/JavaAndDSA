package com.gs.functionalInterfaces.supplier;

import com.gs.data.Student;
import com.gs.data.StudentDataBase;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Supplier;

public class SupplierExample {
    public static void main(String[] args) {

        Supplier<Student> studentSupplier = () -> {
            return    new Student("Adam",2,4.0,"male", Arrays.asList("swimming", "basketball","volleyball"));
        };
        Supplier<List<Student>> listSupplier = () -> StudentDataBase.getAllStudents();
        System.out.println("Student is ::"+studentSupplier.get());
        System.out.println("----------------------------------------------------");
        System.out.println("Student is ::"+listSupplier.get());




    }

}