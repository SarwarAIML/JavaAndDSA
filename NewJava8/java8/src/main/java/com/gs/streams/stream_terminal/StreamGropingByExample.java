package com.gs.streams.stream_terminal;

import com.gs.data.Student;
import com.gs.data.StudentDataBase;

import java.util.*;
import java.util.function.Function;

import static java.util.function.UnaryOperator.identity;
import static java.util.stream.Collectors.*;

public class StreamGropingByExample {
    public static void groupStudentByGender(){
        Map<String, List<Student>> studentMap = StudentDataBase.getAllStudents().stream()
                .collect(groupingBy(Student::getGender));
        System.out.println(studentMap);
    }

    public static void groupStudentByGps(){
        Map<String, List<Student>> studentMap = StudentDataBase.getAllStudents().stream()
                .collect(groupingBy(student -> student.getGpa()>= 3.8 ? "OUTSTANDING":"AVERAGE"));
        System.out.println(studentMap);
    }

    public static void twoLevelGrouping_1(){
        Map<Integer, Map<String, List<Student>>> studentMap = StudentDataBase.getAllStudents().stream()
                .collect(groupingBy(Student::getGradeLevel, groupingBy(student -> student.getGpa() >= 3.8 ? "OUTSTANDING" : "AVERAGE")));
        System.out.println(studentMap);
    }

    public static void twoLevelGrouping_2(){
        Map<String, Integer> integerMap = StudentDataBase.getAllStudents().stream()
                .collect(groupingBy(Student::getName, summingInt(Student::getNoteBooks)));
        System.out.println(integerMap);
    }

    public static void threeArgumentGroupingBy_1(){
        String string = "GroupingByExample";
        LinkedHashMap<Character, Long> longLinkedHashMap = string.chars().mapToObj(ch -> Character.valueOf((char) ch))
                .collect(groupingBy(identity(), LinkedHashMap::new, counting()));
        System.out.println(longLinkedHashMap);
    }
    public static void threeArgumentGroupingBy_2(){
        LinkedHashMap<String, Set<Student>> studentLinkedHashmap = StudentDataBase.getAllStudents().stream()
                .collect(groupingBy(Student::getName, LinkedHashMap::new, toSet()));
        System.out.println(studentLinkedHashmap);
    }
    public static void calculateTopGPA(){
        Map<Integer, Optional<Student>> optionalMap = StudentDataBase.getAllStudents().stream()
                .collect(groupingBy(Student::getGradeLevel, maxBy(Comparator.comparing(Student::getGpa))));
        Map<Integer, Student> studentMap = StudentDataBase.getAllStudents().stream()
                .collect(groupingBy(Student::getGradeLevel,
                        collectingAndThen(maxBy(Comparator.comparing(Student::getGpa)), Optional::get)));
        System.out.println(studentMap);
    }

    public static void calculateLeastGPA(){
        Map<Integer, Optional<Student>> optionalMap = StudentDataBase.getAllStudents().stream()
                .collect(groupingBy(Student::getGradeLevel, minBy(Comparator.comparing(Student::getGpa))));
        Map<Integer, Student> studentMap = StudentDataBase.getAllStudents().stream()
                .collect(groupingBy(Student::getGradeLevel,
                        collectingAndThen(minBy(Comparator.comparing(Student::getGpa)), Optional::get)));
        System.out.println(studentMap);
    }
    public static void main(String[] args) {
     //   groupStudentByGender();
      //  groupStudentByGps();
     //   twoLevelGrouping_1();
     //   twoLevelGrouping_2();
     //   threeArgumentGroupingBy_1();
      //  threeArgumentGroupingBy_2();
        calculateTopGPA();
    }
}