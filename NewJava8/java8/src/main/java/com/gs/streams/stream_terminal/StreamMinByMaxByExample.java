package com.gs.streams.stream_terminal;

import com.gs.data.Student;
import com.gs.data.StudentDataBase;

import java.util.Comparator;
import java.util.Optional;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.maxBy;
import static java.util.stream.Collectors.minBy;

public class StreamMinByMaxByExample {

    public static Optional<Student> minByExample(){
        return StudentDataBase.getAllStudents().stream()
                .collect(minBy(Comparator.comparing(Student::getGpa)));
    }
    public static Optional<Student> maxByExample(){
        return StudentDataBase.getAllStudents().stream()
                .collect(maxBy(Comparator.comparing(Student::getGpa)));
    }
    public static void main(String[] args) {
        System.out.println("minBy example : "+minByExample());
        System.out.println("=================================");
        System.out.println("minBy example : "+maxByExample());
    }
}