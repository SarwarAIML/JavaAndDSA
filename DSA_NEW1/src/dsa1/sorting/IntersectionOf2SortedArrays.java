package dsa1.sorting;

import java.util.ArrayList;
import java.util.List;

public class IntersectionOf2SortedArrays {

    public static void intersectionOf2SortedArrays_Naive(int[] a,int[] b){

        for (int i = 0; i < a.length ; i++) {
            if (i > 0 && a[i-1] == a[i])
                continue;
            for (int j = 0; j < b.length ; j++) {
                if (a[i] == b[j]) {
                    System.out.println(a[i]);
                    break;
                }
            }
        }
    }

    public static void intersection(int[] a,int[] b){

        //       int a1[] = new int[]{3,5,10,10,10,15,15,20};
        //        int b1[] = new int[]{5,10,10,15,20};
        int i = 0 ;
        int j = 0 ;
        int k = 0 ;
        while (i< a.length && j < b.length){
            if (i > 0 && a[i] == a[i-1]) {
                i++;
                continue;
            }
            if (a[i] < b[j]){
                i++;
            } else if (a[i] > b[j]) {
                j++;
            }else {
                System.out.println(a[i]);
                i++;
                j++;
            }
        }
    }


    public static void main(String[] args) {

        int a[] = {1,20,20,40,60};
        int b[] = {2,20,20,20};
        intersectionOf2SortedArrays_Naive(a,b);
        System.out.println("=====================-=");

        int a1[] = new int[]{3,5,8,10,10,10,15,15,20};
        int b1[] = new int[]{5,8,8,8,8,10,10,10,10,15,20};
        intersection(a1,b1);

    }
}
