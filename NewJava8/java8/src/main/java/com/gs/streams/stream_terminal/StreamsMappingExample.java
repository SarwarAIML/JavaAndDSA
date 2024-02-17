package com.gs.streams.stream_terminal;

import com.gs.data.Student;
import com.gs.data.StudentDataBase;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.*;

public class StreamsMappingExample {
    public static void main(String[] args) {

        List<String> nameList = StudentDataBase.getAllStudents().stream()
                .collect(mapping(Student::getName, toList()));
        System.out.println("namesList : "+nameList);

        Set<String> nameSet = StudentDataBase.getAllStudents().stream()
                .collect(mapping(Student::getName, toSet()));
        System.out.println("nameSet : "+nameSet);

        StudentDataBase.getAllStudents().stream()
                .map(student -> student.getName())
                .collect(toList());



    }
}