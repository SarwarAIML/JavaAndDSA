package com.gs.streams;

import com.gs.data.Student;
import com.gs.data.StudentDataBase;

import java.util.List;
import java.util.stream.Collectors;

public class SteamFlatMapExample {
    public static List<String> printStudentActivities(){
        System.out.println("printStudentActivities");
        return StudentDataBase.getAllStudents().stream()//steam student
                .map(Student::getActivities) //stream<List<String>
                .flatMap(List::stream)//Stream<String>
                .collect(Collectors.toList());
    }

    public static List<String>  printDistinctStudentActivities(){
        System.out.println("printDistinctStudentActivities");
        return StudentDataBase.getAllStudents().stream()//steam student
                .map(Student::getActivities) //stream<List<String>
                .flatMap(List::stream)//Stream<String>
                .distinct()
                .collect(Collectors.toList());
    }
    public static List<String>  printDistinctStudentActivitiesSorted(){
        System.out.println("printDistinctStudentActivities");
        return StudentDataBase.getAllStudents().stream()//steam student
                .map(Student::getActivities) //stream<List<String>
                .flatMap(List::stream)//Stream<String>
                .distinct()
                .sorted()
                .collect(Collectors.toList());
    }

    public static long  printDistinctStudentActivitiesCount(){
        System.out.println("printDistinctStudentActivitiesCount");
        return StudentDataBase.getAllStudents().stream()//steam student
                .map(Student::getActivities) //stream<List<String>
                .flatMap(List::stream)//Stream<String>
                .distinct()
                .count();
    }




    public static void main(String[] args) {
        System.out.println(printStudentActivities());
        System.out.println(printDistinctStudentActivities());
        System.out.println(printDistinctStudentActivitiesSorted());
        System.out.println(printDistinctStudentActivitiesCount());
    }
}