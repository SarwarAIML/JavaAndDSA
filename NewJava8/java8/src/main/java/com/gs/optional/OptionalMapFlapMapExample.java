package com.gs.optional;

import com.gs.data.Bike;
import com.gs.data.Student;
import com.gs.data.StudentDataBase;

import java.util.Optional;

public class OptionalMapFlapMapExample {

    //filter
    public static void optionalFilter(){
        Optional<Student> optionalStudent =
                Optional.ofNullable(StudentDataBase.studentSupplier.get());
        optionalStudent.filter(student -> student.getGpa()>= 3.5)//will print empty if predicate not satisfy
                .ifPresent(System.out::println);
    }

    //map
    public static void optionalMap() {
        Optional<Student> optionalStudent =
                Optional.ofNullable(StudentDataBase.studentSupplier.get());
        if (optionalStudent.isPresent()) {
            Optional<String> optionalName = optionalStudent.filter(student -> student.getGpa() >= 3.5)
                    .map(student -> student.getName());
            System.out.println("Student Name is : "+optionalName.get());
        }
    }
    // flatmap

    public static void optionalFlatMap(){
        Optional<Student> optionalStudent = StudentDataBase.getOptionalStudent();
        if (optionalStudent.isPresent()){
            Optional<Bike> bikeOptional = optionalStudent.flatMap(Student::getBike);
            System.out.println(bikeOptional);
        }


    }


    public static void main(String[] args) {
        optionalFilter();
        System.out.println("map example ");
        optionalMap();
        System.out.println("flatMapExample ");
        optionalFlatMap();
    }
}