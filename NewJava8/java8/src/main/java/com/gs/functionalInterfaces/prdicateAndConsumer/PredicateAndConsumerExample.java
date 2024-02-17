package com.gs.functionalInterfaces.prdicateAndConsumer;

import com.gs.data.Student;
import com.gs.data.StudentDataBase;

import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class PredicateAndConsumerExample {

    Predicate<Student> p1 = student -> student.getGradeLevel() >= 3;
    Predicate<Student> p2 = student -> student.getGpa() >= 3.9;

    BiConsumer<String, List<String>> studentbiConsumer = (name, activities) -> System.out.println(name + ": " + activities);
    Consumer<Student> studentConsumer = (student -> {
        if (p1.and(p2).test(student)) {
            studentbiConsumer.accept(student.getName(), student.getActivities());
        }
    });

    public void printNameAndActivities(List<Student> studentList) {
        studentList.forEach(studentConsumer);
    }


    public static void main(String[] args) {
        List<Student> studentList = StudentDataBase.getAllStudents();
        new PredicateAndConsumerExample().printNameAndActivities(studentList);

    }
}