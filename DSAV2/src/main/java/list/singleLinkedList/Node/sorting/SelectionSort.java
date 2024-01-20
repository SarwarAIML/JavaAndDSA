package list.singleLinkedList.Node.sorting;

import java.util.Arrays;

public class SelectionSort {

    public static void selectionSort_Navive(int[] arr){
        int[] temp = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            int min_index = 0;
            for (int j = 1; j < arr.length ; j++) {
                if (arr[j] < arr[min_index]){
                    min_index = j;
                }
            }
            temp[i] = arr[min_index];
            arr[min_index] = Integer.MAX_VALUE;
        }
        for (int i = 0; i < arr.length; i++) {
            arr[i] = temp[i];
        }
    }


    public static void selectionSort(int arr[]){
        for (int i = 0; i < arr.length; i++) {

            int min_index = i;
            for (int j = i+1; j < arr.length; j++) {
                if (arr[j] < arr[min_index]){
                    min_index = j;
                }
            }
            swap(arr,min_index,i);

        }
    }

    private static void swap(int[] arr, int min_index, int i) {
        int temp = arr[min_index];
        arr[min_index] = arr[i];
        arr[i] = temp;

    }

    public static void main(String[] args) {
        int[] array = {10,15,5,8,20,2,8};
        selectionSort_Navive(array);
        System.out.println(Arrays.toString(array));
        System.out.println("==============================");

        int[] array1 = {10,15,5,8,20,2,8};
        selectionSort(array1);
        System.out.println(Arrays.toString(array1));
        System.out.println("==============================");
    }
}