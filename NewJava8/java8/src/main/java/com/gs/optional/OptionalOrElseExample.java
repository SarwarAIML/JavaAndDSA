package com.gs.optional;

import com.gs.data.Student;
import com.gs.data.StudentDataBase;

import java.util.Optional;

public class OptionalOrElseExample {

    //orELse
    public static String optionalOrElse(){
      //  Optional<Student> optionalStudent = Optional.ofNullable(StudentDataBase.studentSupplier.get());
        Optional<Student> optionalStudent = Optional.ofNullable(null);// it will return Optional.empty()
        String name = optionalStudent.map(Student::getName).orElse("Default");
        return name;
    }

    //orElseGet
    public static String optionalOrElseGet(){
          Optional<Student> optionalStudent = Optional.ofNullable(StudentDataBase.studentSupplier.get());
      //  Optional<Student> optionalStudent = Optional.ofNullable(null);// it will return Optional.empty()
        String name = optionalStudent.map(Student::getName).orElseGet(()->"Default");
        return name;
    }

    //orElseThrow

    public static String optionalOrElseThrow(){
        Optional<Student> optionalStudent = Optional.ofNullable(StudentDataBase.studentSupplier.get());
        //  Optional<Student> optionalStudent = Optional.ofNullable(null);// it will return Optional.empty()
        String name = optionalStudent.map(Student::getName).orElseThrow(()-> new RuntimeException("No data Available"));
        return name;
    }


    public static void main(String[] args) {
        System.out.println(optionalOrElse());
        System.out.println(optionalOrElseGet());
        System.out.println(optionalOrElseThrow());
    }
}