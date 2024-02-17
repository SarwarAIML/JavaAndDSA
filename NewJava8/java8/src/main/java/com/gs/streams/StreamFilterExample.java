package com.gs.streams;

import com.gs.data.Student;
import com.gs.data.StudentDataBase;

import java.util.List;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toList;

public class StreamFilterExample {

    public static List<Student> filterStudentByGender(){
        System.out.println(":::::::::::::::::filterStudentByGender:::::::::::::::::::::");
        return StudentDataBase.getAllStudents().stream()
                .filter(student -> student.getGender().equals("female"))
                .collect(toList());
    }
    public static void main(String[] args) {
        filterStudentByGender().forEach(System.out::println);
    }
}