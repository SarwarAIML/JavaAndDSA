package com.gs.streams;

import com.gs.data.Student;
import com.gs.data.StudentDataBase;

import java.util.Optional;

public class StreamsFindAnyFirstExample {

    public static Optional<Student> findAnyStudent(){
        return StudentDataBase.getAllStudents().stream()
                //adam
                //jenny
                //emily
                .filter(student -> student.getGpa()>=3.9)
                .findAny();
    }

    public static Optional<Student> findFirstStudent(){
        return StudentDataBase.getAllStudents().stream()
                //adam
                //jenny
                //emily
                .filter(student -> student.getGpa()>=3.9)
                .findFirst();
    }
    public static void main(String[] args) {
        Optional<Student> studentFindAnyOptional = findAnyStudent();
        studentFindAnyOptional.ifPresent(System.out::println);

        Optional<Student> studentFindFirstOptional = findFirstStudent();
        studentFindFirstOptional.ifPresent(System.out::println);
    }
}