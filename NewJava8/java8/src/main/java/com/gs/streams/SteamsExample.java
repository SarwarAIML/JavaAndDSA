package com.gs.streams;

import com.gs.data.Student;
import com.gs.data.StudentDataBase;

import java.lang.ref.SoftReference;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;
public class SteamsExample {
    static Predicate<Student> studenGradeLevelPredicate = student -> student.getGradeLevel() >= 3;
    static Predicate<Student> studentGpaPredicate = student -> student.getGpa() >= 3.9;
    public static void main(String[] args) {
        Map<String, List<String>> studentMap = StudentDataBase.getAllStudents().stream()
                .filter(studenGradeLevelPredicate)
                .filter(studentGpaPredicate)
                .collect(Collectors.toMap(Student::getName, Student::getActivities));
        System.out.println(studentMap);
    }

}