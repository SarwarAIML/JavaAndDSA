package com.gs.functionalInterfaces.biconsumer;

import com.gs.data.Student;
import com.gs.data.StudentDataBase;

import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.stream.Collectors;

public class BiconsumerExample {
    static BiConsumer<String,List<String>> biConsumer = (name,activities) ->{
        System.out.println(name +" : "+activities);
    };
    public static void printNameAndActivity(){
        System.out.println("================printNameAndActivity()=================");
        List<Student> allStudents = StudentDataBase.getAllStudents();
        allStudents.forEach(student -> biConsumer.accept(student.getName(),student.getActivities()));

    }
    public static void printEvenOddFromList(){
        List<Integer> lis=List.of(3,1,8,34,7,5);
        Map<Boolean, List<Integer>> map = lis.stream().collect(Collectors.partitioningBy(num -> num % 2 == 0));
        List<Integer> integerList = map.get(true);
        List<Integer> integerList1 = map.get(false);
        System.out.println(integerList);
        System.out.println(integerList1);
    }

    public static void main(String[] args) {
        BiConsumer<String,String> stringStringBiConsumer =
                (s1,s2)-> System.out.println(s1+" "+s2);

        stringStringBiConsumer.accept("hello","biconsumer");

        BiConsumer<Integer,Integer> multiplication= (a,b)-> {
            System.out.println("Multiplication is:"+(a*b));
        };
        BiConsumer<Integer,Integer> division= (a,b)-> {
            System.out.println("Division is:"+(a/b));
        };

        multiplication.andThen(division).accept(10,2);
        System.out.println("=============");
        printNameAndActivity();

    }

}