package com.gs.streams;

import com.gs.data.Student;
import com.gs.data.StudentDataBase;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;


public class SteamMapExample {

    public static List<String> getNameList(){
        return StudentDataBase.getAllStudents().stream()
                .map(Student::getName)
                .map(String::toUpperCase)
                .collect(Collectors.toList());
    }

    public static Set<String> getNameSet(){
        return StudentDataBase.getAllStudents().stream()
                .map(Student::getName)
                .map(String::toUpperCase)
                .collect(Collectors.toSet());
    }
    public static void main(String[] args) {
        System.out.println(getNameList());
        System.out.println(getNameSet());
    }
}