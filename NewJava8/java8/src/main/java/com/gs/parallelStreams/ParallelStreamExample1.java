package com.gs.parallelStreams;

import com.gs.data.Student;
import com.gs.data.StudentDataBase;

import java.util.List;
import java.util.stream.Collectors;

public class ParallelStreamExample1 {
    public static List<String> sequentialStudentActivities(){
        System.out.println("sequentialStudentActivities");
        long startTime = System.currentTimeMillis();
        List<String> activities = StudentDataBase.getAllStudents().stream()//steam student
                .map(Student::getActivities) //stream<List<String>
                .flatMap(List::stream)//Stream<String>
                .distinct()
                .sorted()
                .collect(Collectors.toList());
        long endTime = System.currentTimeMillis();
        System.out.println("Duration to execute the pipeline in sequential : "+(endTime-startTime));
        return activities;
    }
    public static List<String> parallelStudentActivities(){
        System.out.println("parallelStudentActivities");
        long startTime = System.currentTimeMillis();
        List<String> activities = StudentDataBase.getAllStudents()
                .stream()//steam student
                .parallel()
                .map(Student::getActivities) //stream<List<String>
                .flatMap(List::stream)//Stream<String>
                .distinct()
                .sorted()
                .collect(Collectors.toList());
        long endTime = System.currentTimeMillis();
        System.out.println("Duration to execute the pipeline in parallel : "+(endTime-startTime));
        return activities;
    }
    public static void main(String[] args) {
        sequentialStudentActivities();
        parallelStudentActivities();
    }
}