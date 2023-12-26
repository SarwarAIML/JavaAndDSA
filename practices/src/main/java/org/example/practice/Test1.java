package org.example.practice;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Test1 {

    public static void main(String[] args) {

        String str = "abcdefghijklmnopqrtsuvwxyz";


        long count = str.chars().filter(i -> i >= 'a' && i <= 'z')
                .distinct().count();
        if (count == 26)
            System.out.println("Conatins all latters of alphabets");

        Set<Character> uniqueChar = new TreeSet<Character>();
        str.chars().mapToObj(c->(char)c)
                .filter(Character::isLetter)
                .map(Character::toLowerCase)
                .forEach(uniqueChar::add);

        if (uniqueChar.size() == 26)
            System.out.println("all chars are there ");

        String albhabets = IntStream.range('a','z')
                .mapToObj(c->(char)c)
                .map(String::valueOf)
                .collect(Collectors.joining());


        int[] array = {1,2,3,4,5,6,7,8,9};

        //[17:01] Sanjay Ghosh
        //rotate it by 2 steps
        //[17:01] Sanjay Ghosh
        //[8, 9, 1, 2, 3, 4, 5, 6, 7]

        System.out.println(Arrays.toString(array));

        rightRotatebyD(array,2);

        System.out.println(Arrays.toString(array));


    }

    public static void rightRotatebyD(int[] array,int d) {

        reverseArray(array,0,array.length-1);
        reverseArray(array,0,d-1);
        reverseArray(array,d,array.length-1);
    }

    private static void reverseArray(int[] arrr,int low, int high) {

        while (low<high){
            int temp = arrr[low];
            arrr[low] = arrr[high];
            arrr[high] = temp;
            low++;
            high--;

        }
    }
}
