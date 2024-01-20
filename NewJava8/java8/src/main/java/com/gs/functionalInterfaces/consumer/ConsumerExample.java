package com.gs.functionalInterfaces.consumer;

import com.gs.data.Student;
import com.gs.data.StudentDataBase;

import java.util.List;
import java.util.function.Consumer;

public class ConsumerExample {
    static Consumer<Student> c1= (student -> System.out.println(student));
    static Consumer<Student> c2= (student -> System.out.print(student.getName()+" "));
    static Consumer<Student> c3= (student -> System.out.println(student.getActivities()));

    public static void printStudent(){
        System.out.println("==========printStudent============");
        List<Student> allStudents = StudentDataBase.getAllStudents();
        allStudents.forEach(c1);
    }
    public static void printStudentName(){
        System.out.println("==========printStudentName============");
        List<Student> allStudents = StudentDataBase.getAllStudents();
        allStudents.forEach(c2);
        System.out.println();
    }
    public static void printStudentActivity(){
        System.out.println("==========printStudentActivity============");
        List<Student> allStudents = StudentDataBase.getAllStudents();
        allStudents.forEach(c3);
    }
    public static void printStudentNameActivity(){
        System.out.println("==========printStudentNameActivity============");
        List<Student> allStudents = StudentDataBase.getAllStudents();
        allStudents.forEach(c2.andThen(c3));
    }
    public static void printNameAndActivitiesUsingCondition(){
        System.out.println("==========printNameAndActivitiesUsingCondition============");
        List<Student> personList = StudentDataBase.getAllStudents();
        personList.forEach((student) -> {
            if( student.getGradeLevel()>=3 && student.getGpa()>3.9){
                c2.andThen(c3).accept(student);
            }
        });
    }

    public static void main(String[] args) {
        printStudent();
        printStudentName();
        printStudentActivity();
        printStudentNameActivity();
        printNameAndActivitiesUsingCondition();
    }
}