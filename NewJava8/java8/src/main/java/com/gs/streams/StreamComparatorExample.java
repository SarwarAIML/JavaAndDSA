package com.gs.streams;

import com.gs.data.Student;
import com.gs.data.StudentDataBase;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toList;

public class StreamComparatorExample {

    public static List<Student> sortStudentByName(){
        System.out.println("::::::::::::::::::::::::::Student sorted by name::::::::::::::::::::::::");
        return StudentDataBase.getAllStudents().stream()
                .sorted(Comparator.comparing(Student::getName))
                .collect(toList());
    }

    public static List<Student> sortStudentByGpa(){
        System.out.println("::::::::::::::::::::::::::Student sorted by GPA::::::::::::::::::::::::");
        return StudentDataBase.getAllStudents().stream()
                .sorted(Comparator.comparing(Student::getGpa))
                .collect(toList());
    }

    public static List<Student> sortStudentByGpaDesc(){
        System.out.println("::::::::::::::::::::::::::Student sorted by GPA Descending ::::::::::::::::::::::::");
        return StudentDataBase.getAllStudents().stream()
                .sorted(Comparator.comparing(Student::getGpa).reversed())
                .collect(toList());
    }


    public static void main(String[] args) {
        System.out.println(sortStudentByName());
        System.out.println(sortStudentByGpa());
        System.out.println(sortStudentByGpaDesc());
    }
}