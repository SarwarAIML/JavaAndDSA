package com.gs.streams.stream_terminal;

import com.gs.data.Student;
import com.gs.data.StudentDataBase;

import static java.util.stream.Collectors.averagingInt;
import static java.util.stream.Collectors.summingInt;

public class StreamSumAvgInExample {

    public static int summingIntExample(){
        return StudentDataBase.getAllStudents().stream()
                .collect(summingInt(Student::getNoteBooks));
    }

    public static Double average(){
        return StudentDataBase.getAllStudents().stream()
                .collect(averagingInt(Student::getNoteBooks));
    }

    public static void main(String[] args) {
        System.out.println("total numver of notebooks :: "+summingIntExample());
        System.out.println("average  numver of notebooks :: "+average());
    }
}