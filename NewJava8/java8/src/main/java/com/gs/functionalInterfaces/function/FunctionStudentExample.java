package com.gs.functionalInterfaces.function;

import com.gs.data.Student;
import com.gs.data.StudentDataBase;
import com.gs.functionalInterfaces.predicate.PredicateStudentExample;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

public class FunctionStudentExample {
    public static Function<List<Student>, Map<String, Double>> studentFunction = (studentList -> {
        Map<String, Double> studentGradeMap = new HashMap<String, Double>();
        studentList.forEach(student -> {
            if (PredicateStudentExample.gradelevelPredicate.test(student)) {
                studentGradeMap.put(student.getName(), student.getGpa());
            }
        });
        return studentGradeMap;
    });

    public static void main(String[] args) {
        System.out.println(studentFunction.apply(StudentDataBase.getAllStudents()));
    }
}