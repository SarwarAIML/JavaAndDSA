package com.gs.merhodRefrence;

import com.gs.data.Student;
import com.gs.data.StudentDataBase;

import java.util.function.Predicate;

public class RefectoryMethodReferenceExample {

    static Predicate<Student> predicate = RefectoryMethodReferenceExample::greaterThanGradeLevel;
    public static boolean greaterThanGradeLevel(Student student){
        return student.getGradeLevel() >=3;
    }
    public static void main(String[] args) {
        System.out.println(predicate.test(StudentDataBase.studentSupplier.get()));
    }
}