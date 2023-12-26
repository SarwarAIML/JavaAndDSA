package dsa1.string.pattern;

import java.util.Arrays;

public class Test2 {

    public static void main(String[] args) {
        int[] arr = new int[5];
        Arrays.fill(arr,1);
        test(arr);
    }
    private static void test(int[] arr) {


        for (int i = 0; i < arr.length; i++) {
            int i1 = arr[i];
            System.out.println(i1);
            int i2 = ++arr[i];
            System.out.println(i2);
        }
    }
}
