package com.gs.optional;

import com.gs.data.Student;
import com.gs.data.StudentDataBase;

import java.util.Optional;

public class OptionalExample {

    public static String getStudentName() {
        //   Student student = StudentDataBase.studentSupplier.get();
        Student student = null;
        if (student != null) {
            return student.getName();
        }
        return null;
    }

    public static Optional<String> getStudentNameOptional() {
       // Optional<Student> studentOptional = Optional.ofNullable(StudentDataBase.studentSupplier.get());
        Optional<Student> studentOptional = Optional.ofNullable(null);
        if (studentOptional.isPresent()) {
            studentOptional.get();//return the student
            return studentOptional.map(Student::getName);//Optional<String>
        }
        return Optional.empty();//Optional object with no value
    }

    public static void main(String[] args) {

/*
    String studentName =  getStudentName();
        if (studentName != null)
            System.out.println("Length of student name is :"+studentName.length());
        else
            System.out.println("Name not found ");
    }*/
        Optional<String> studentNameOptional = getStudentNameOptional();
        if (studentNameOptional.isPresent()) {
            System.out.println("Length of student name is :" + studentNameOptional.get().length());
        } else
            System.out.println("Name not found ");
    }

}