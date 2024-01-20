package com.gs.functionalInterfaces.predicate;

import com.gs.data.Student;
import com.gs.data.StudentDataBase;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
public class PredicateStudentExample {
    public static List<Student> studentList = new ArrayList<>();
    public static final Predicate<Student> gradelevelPredicate = (student -> student.getGradeLevel() >= 3);
    public static final Predicate<Student> gpaPredicate = (student -> student.getGpa() >= 3.9);

    static {
        studentList = StudentDataBase.getAllStudents();
    }
    public static void filterStudentByGradeLevel(){
        System.out.println("===================filterStudentByGradeLevel()========================");
        studentList.forEach(student -> {
            if (gradelevelPredicate.test(student)){
                System.out.println(student);
            }
        });
    }
    public static void filterStudentByGpa(){
        System.out.println("===================filterStudentByGpa()========================");
        studentList.forEach(student -> {
            if (gpaPredicate.test(student)){
                System.out.println(student);
            }
        });
    }
    public static void filterStudentByGradeAndGPA(){
        System.out.println("===================filterStudentByGradeAndGPA()========================");
        studentList.forEach(student -> {
            if (gradelevelPredicate.and(gpaPredicate).test(student)){
                System.out.println(student);
            }
        });
    }
    public static void main(String[] args) {
        filterStudentByGradeLevel();
        filterStudentByGpa();
        filterStudentByGradeAndGPA();
    }

}