package com.gs.functionalInterfaces.bipredicate;

import com.gs.data.Student;
import com.gs.data.StudentDataBase;

import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class BiPredicateExample {

    Predicate<Student> p1 = student -> student.getGradeLevel() >= 3;
    Predicate<Student> p2 = student -> student.getGpa() >= 3.9;
    BiPredicate<Integer, Double> studentBiPredicate = (gradeLevel, gpa) -> gradeLevel >= 3 && gpa >= 3.9;

    BiConsumer<String, List<String>> studentbiConsumer = (name, activities) -> System.out.println(name + ": " + activities);
    Consumer<Student> studentConsumer = (student -> {
        if (studentBiPredicate.test(student.getGradeLevel(), student.getGpa())) {
            studentbiConsumer.accept(student.getName(), student.getActivities());
        }
    });

    public void printNameAndActivities(List<Student> studentList) {
        studentList.forEach(studentConsumer);
    }
    public static void main(String[] args) {
        List<Student> studentList = StudentDataBase.getAllStudents();
        new BiPredicateExample().printNameAndActivities(studentList);
    }
}