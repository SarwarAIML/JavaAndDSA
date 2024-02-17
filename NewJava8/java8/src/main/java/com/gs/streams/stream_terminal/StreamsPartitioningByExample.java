package com.gs.streams.stream_terminal;

import com.gs.data.Student;
import com.gs.data.StudentDataBase;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Predicate;

import static java.util.stream.Collectors.partitioningBy;
import static java.util.stream.Collectors.toSet;

public class StreamsPartitioningByExample {
    public static Predicate<Student> studentPredicate = (student)-> student.getGpa() >= 3.8;
    public static void partitioningBy_1(){
        Map<Boolean, List<Student>> booleanListMap = StudentDataBase.getAllStudents().stream()
                .collect(partitioningBy(studentPredicate));
        System.out.println(booleanListMap);
    }
    public static void partitioningBy_2(){
        Map<Boolean, Set<Student>> booleanListMap = StudentDataBase.getAllStudents().stream()
                .collect(partitioningBy(studentPredicate,toSet()));
        System.out.println(booleanListMap);
    }
    public static Predicate<Integer>  integerPredicate = integer -> integer % 2 == 0;
    public static void partitioningBy_3(){
        List<Integer>  integerList = List.of(1,2,3,4,5,6,7,8,9,10);
     Map<Boolean,List<Integer>> booleanListMap  = integerList.stream()
                .collect(partitioningBy(integerPredicate));
        System.out.println(booleanListMap);
    }

    public static void main(String[] args) {
    //    partitioningBy_1();
    //    partitioningBy_2();
        partitioningBy_3();

    }
}