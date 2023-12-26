package org.example.practice;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Persistance1 {

    public static void main(String[] args) {



        String InputPhrase = "I want to try to play football, but every time I try I lose interest because it is hard";
        String InpurWords = "I,try";

      char chars = InputPhrase.chars().mapToObj(s -> Character.toLowerCase(Character.valueOf((char) s)))
               .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
               .entrySet()
               .stream()
              .filter(entry -> entry.getKey().equals("i"))
              .filter(entry -> entry.getKey().equals("try"))
              .filter(entry -> entry.getValue() >0)
              .map(entry -> entry.getKey() )
               .findFirst()
               .get();
        System.out.println(chars);



    }
}
