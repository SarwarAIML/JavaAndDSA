package dsa1.array;

import java.util.Arrays;

public class LeftRotateAnArrayByD {



    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};

        leftRotateAnArrayByD(arr,2);
        System.out.println(Arrays.toString(arr));
    }

    private static void leftRotateAnArrayByD(int[] arr, int d) {
        reverseArray(arr,0,d-1);
        reverseArray(arr,d,arr.length-1);
        reverseArray(arr,0,arr.length-1);
    }

    private static void reverseArray(int[] arr, int low, int high) {
        while (low<high){
            swap(arr,low,high);
            low++;
            high --;
        }
    }
    private static void swap(int[] arr, int low, int high) {
        int tmp = arr[low] ;
        arr[low] = arr[high];
        arr[high] = tmp;
    }
}
