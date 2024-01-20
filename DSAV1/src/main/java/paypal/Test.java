package paypal;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Simplifying
 * <p>
 * You are given a list/array of gs equalities such as:
 * <p>
 * [ "a + a = b", "b - d = c ", "a + b = d" ]
 * Use this information to solve a given formula in terms of the remaining symbol such as:
 * <p>
 * formula = "c + a + b"
 * in this gs:
 * <p>
 * "c + a + b" = "2a"
 * So the output is "2a"
 * <p>
 * 2a-b = 0
 * b-d-c = 0
 * a+b-d = 0
 */


public class Test {

    public static void main(String[] args) {

        List<String> list = new ArrayList<String>();
        list.add("a + a = b");
        list.add("b - d = c");
        list.add("a + b = d");

        System.out.println(list);
        String str1 = list.get(0);
        String str2 = list.get(1);
        String str3 = list.get(2);

        char[] chars1 = str1.toCharArray();
        System.out.println(Arrays.toString(chars1));
        char a = 'a';
        char b = 'b';
        char c = 'c';

        int aascia = a;
        int aascib = b;
        int aascic = c;
        System.out.println(a);
        System.out.println(aascia);
        System.out.println(aascia + aascib + aascic);
        System.out.println();
    }
}