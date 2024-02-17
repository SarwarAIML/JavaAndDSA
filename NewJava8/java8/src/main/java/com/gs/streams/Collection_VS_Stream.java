package com.gs.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Collection_VS_Stream {
    public static void main(String[] args) {
        //1 can be modified
        List<String> names = new ArrayList<String>();
        names.add("Gulam");
        names.add("Sarwar");
        names.add("Afreen");
        names.remove(0);
        //1 can not be modified once created
        Stream<String> stream = names.stream();

        //2 collection can be accessed in any order (index based )
        names.get(2);

        //2 can be accessed sequentially
        stream.forEach(System.out::println);

        //3 collection is eagerly , while steam is lazily constructed means when terminal operation
        //will be called then it will be loaded

        //4 collection can be processed n number of times but steam will be processed once

        for (String str : names) //can be proceeds multiple times
            System.out.println(str);

        stream.forEach(System.out::println);//will give exceptions since it has been processed once

        //5 collection uses external iterator to iterate the collection
        // but steam using internal operator to iterate it

        names.listIterator();
        stream.forEach(System.out::println);



        //






        //     System.out.println(names);

    }
}