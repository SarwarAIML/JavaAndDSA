package sorting;

import java.util.Arrays;

public class MergeTwoSortedArray {

    public static int[] merge2SortedArray_Naive(int[] a,int b[]){
        int[] c = new int[a.length+ b.length];
        for (int i = 0; i <a.length ; i++) {
            c[i] = a[i];
        }
        for (int i = 0; i < b.length ; i++) {
            c[a.length+i] = b[i];
        }
        Arrays.sort(c);
        return c;

    }

    public static int[] merge2SortedArray(int[] a,int[] b){

        int i=0,j=0,k = 0;
        int m = a.length;
        int n = b.length;
        int p = m+n;
        int c[] = new int[p];

        while (i< m && j<n){
            if (a[i]<b[j]){
                c[k++] = a[i++];
            }else {
                c[k++] = b[j++];
            }
        }
        while (i<m){
            c[k++] = a[i++];
        }
        while (j<n){
            c[k++] = a[j++];
        }
        return c;
    }

    public static void main(String[] args) {
   /*     int a[] ={10,15,20,20};
        int b[] = {1,12};
        int[] ints = merge2SortedArray_Naive(a, b);
        System.out.println(Arrays.toString(ints));
        System.out.println("::::::::::::merge2SortedArray:::::::::::::");
        int[] ints1 = merge2SortedArray(a, b);
        System.out.println(Arrays.toString(ints1));*/

        int arr1[] ={2,4,6,8};
        int arr2[] = {1,3,5,7};
        int[] ints2 = merge2SortedArray(arr1, arr2);
        System.out.println(Arrays.toString(ints2));
    }
}
