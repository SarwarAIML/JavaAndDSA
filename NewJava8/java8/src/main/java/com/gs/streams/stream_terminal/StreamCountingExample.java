package com.gs.streams.stream_terminal;

import com.gs.data.StudentDataBase;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.function.Function;
import java.util.stream.Collectors;

import static java.util.function.UnaryOperator.identity;
import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.groupingBy;

public class StreamCountingExample {

    public static long count(){
        return StudentDataBase.getAllStudents().stream()
                .filter(student -> student.getGpa() >= 3.9)
                .collect(counting());
    }
    public static void printCharOccurrence(String string){
        char[] charArray = string.toCharArray();
         String string1 = new String(charArray);
        string.chars().mapToObj(ch->Character.valueOf((char) ch))
                .collect(groupingBy(identity(), LinkedHashMap::new,counting()))
                .forEach((k,v)-> System.out.println(k+" : "+v));
    }

    public static void main(String[] args) {

        System.out.println("counting : "+ count());
         printCharOccurrence("geek for geeks");
    }
}