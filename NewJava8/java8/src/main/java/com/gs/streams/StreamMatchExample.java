package com.gs.streams;

import com.gs.data.StudentDataBase;

import java.util.stream.IntStream;

public class StreamMatchExample {
public static boolean allMatch(){
    return StudentDataBase.getAllStudents().stream()
            .allMatch(student -> student.getGpa() >=3.5);
}

    public static boolean anyMatch(){
        return StudentDataBase.getAllStudents().stream()
                .anyMatch(student -> student.getGpa() >=4.1);
    }
public static boolean isPalindrome(String string){
    return IntStream.range(0,string.length()/2)
            .allMatch(index->string.charAt(index) == string.charAt(string.length()-1-index));
}

    public static boolean noneMatch(){
        return StudentDataBase.getAllStudents().stream()
                .noneMatch(student -> student.getGpa() >=4.1);
    }
    public static void main(String[] args) {
        System.out.println("Result of allMatch : "+allMatch());
        System.out.println("String is Palindrome : "+isPalindrome("madam"));
        System.out.println("Result of anyMatch : "+anyMatch());
        System.out.println("Result of noneMatch : "+noneMatch());
    }
}