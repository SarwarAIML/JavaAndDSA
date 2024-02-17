package com.gs.streams;

import com.gs.data.Student;
import com.gs.data.StudentDataBase;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamsReduceExample {
    public static int performMultiplication(List<Integer> integerList){
        System.out.println(":::::::::::::::performMultiplication()::::::::::::::");
        return integerList.stream()
                //1
                //3
                //5
                //7
                //a=1(initial value), b =1(from stream) (initial value of a is 1 and b will be 1 from steam)-> resul 1 will be returned
                //a =1 ,b = 3 (from steam) -> result 3 is returned
                // a = 3 ,b =5 (from stream) -> result 15 is returned
                // a = 15 , b = 7(fromm steam) - > result 105 is returned
                .reduce(1,(a,b)->a*b);
    }
    public static Optional<Integer> performMultiplicationWithoutIdentity(List<Integer> integerList){
        System.out.println(":::::::::::::::performMultiplicationWithoutIdentity()::::::::::::::");
        return integerList.stream()
                //1
                //3
                //5
                //7
                .reduce((a,b)->a*b);
    }

    public static Optional<Student> getHighestGpaStudent(){
        System.out.println(":::::::::::::::getHighestGpaStudent()::::::::::::::");
        return StudentDataBase.getAllStudents().stream()
                .reduce((student, student2) ->student.getGpa() > student2.getGpa() ? student:student2);
    }


    public static void main(String[] args) {

        List<Integer> integers = Arrays.asList(1,3,5,7);
        System.out.println(performMultiplication(integers));
        Optional<Integer> result = performMultiplicationWithoutIdentity(integers);
        result.ifPresent(System.out::println);

        Optional<Student> student = getHighestGpaStudent();
        student.ifPresent(System.out::println);

    }
}