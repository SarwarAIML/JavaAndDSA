package list.singleLinkedList.Node.sorting;

import java.util.Arrays;

public class BubbleSort {

    public static void bubbleSort(int[] arr){
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j < arr.length-1; j++) {
                if (arr[j] > arr[j+1])
                    swap(arr,j,j+1);
            }
        }
    }

    public static void bubbleSortOptimized1(int arr[]){

        for (int i = 0; i < arr.length-1 ; i++) {
            for (int j = 0; j < arr.length-1-i; j++) {
                if (arr[j] > arr[j+1])
                    swap(arr,j,j+1);
            }
        }
    }

    public static void bubbleSortOptimized2(int arr[]){

        for (int i = 0; i < arr.length-1 ; i++) {
            boolean swapedFlag = false ;
            for (int j = 0; j < arr.length-1-i; j++) {
                if (arr[j] > arr[j+1])
                    swap(arr,j,j+1);
                swapedFlag = true ;
            }
            if (!swapedFlag )
                break;
        }
    }

    private static void swap(int[] arr, int j, int i) {
        System.out.println(j);
        int temp = arr[j];
        arr[j] = arr[i];
        arr[i] = temp;
    }

    public static void main(String[] args) {

        int arr1[] = {2, 1, 4, 3};
        bubbleSort(arr1);
        System.out.println("arr1[]:::"+ Arrays.toString(arr1));
        System.out.println("=====================");
        int arr2[] = {2, 1, 4, 3};
        bubbleSortOptimized1(arr2);
        System.out.println("arr1[]:::"+ Arrays.toString(arr2));

        System.out.println("=====================");
        int arr3[] = {2, 1, 4, 3};
        bubbleSortOptimized2(arr3);
        System.out.println("arr1[]:::"+ Arrays.toString(arr3));

    }
}