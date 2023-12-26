package org.example.epsilon;

import java.util.Arrays;

public class Epsillon {



    public static int[] mergeArray(int a[],int b[]){
        int i = 0;
        int j = 0;
        int k = 0;
        int[]  c = new int[a.length+ b.length];
        while (i < a.length && j< b.length ) {
            if (a[i] < b[j]){
                c[k++] =a[i++];
            } else {
                c[k++] = b[j++];
            }

        }
        while (i< a.length){
            c[k++] = a[i++];
        }

        while (j< b.length){
            c[k++] = b[j++];
        }
        return c;
    }

    public static void main(String[] args) {
        int arr1[] ={2,4,6,8};
        int arr2[] = {1,3,5,7};
        int[] ints = mergeArray(arr1, arr2);
        System.out.println(Arrays.toString(ints));

    }
}
