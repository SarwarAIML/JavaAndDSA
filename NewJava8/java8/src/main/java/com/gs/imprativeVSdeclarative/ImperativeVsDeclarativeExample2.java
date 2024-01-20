package com.gs.imprativeVSdeclarative;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ImperativeVsDeclarativeExample2 {

    public static void main(String[] args) {

        List<Integer> integerList = Arrays.asList(1,2,3,4,4,5,5,6,7,7,8,9,9);

        // imperative style of coding
        //remove duplicate from the list
        List<Integer> uniqueList  = new ArrayList<>();
        for (Integer num : integerList )
            if (!uniqueList .contains(num))
                uniqueList.add(num);


        List<Integer> uniqueList1 = integerList.stream().parallel().distinct()
                                    .collect(Collectors.toList());
        System.out.println("uniqueList  :"+uniqueList);
        System.out.println("uniqueList1 :"+uniqueList1);

    }
}