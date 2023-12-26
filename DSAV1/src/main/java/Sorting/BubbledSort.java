package Sorting;

import java.util.Arrays;

public class BubbledSort {

    //9,2,5,4
    public static void  bubbleSort(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            boolean isSwaped = false;
            for (int j = 0; j < arr.length-1-i; j++) {
                if (arr[j] > arr[j+1]){
                    swap(arr,j,j+1);
                    isSwaped = true;
                }
            }
            if (isSwaped == false){
                break;
            }

        }
    }
    private static void swap(int[] arr,int i ,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {

        int arr[] = {9,5,2,4};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
