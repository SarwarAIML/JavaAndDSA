package Sorting.selectionSort;

import java.util.Arrays;

public class NaiveApproach {

    public static void selectSort(int arr[],int n){

        int temp[]= new int[n];
        for (int i = 0; i < n; i++) {

            int min_index = 0;
            for (int j = 1; j <n ; j++) {
                if (arr[j] < arr[min_index])
                    min_index = j;
                System.out.println("min_index:::"+min_index);
            }
            temp[i] = arr[min_index];
            arr[min_index] = Integer.MAX_VALUE;
        }
        for (int i = 0; i <n ; i++) {
            arr[i] = temp[i];
        }
    }

    public static void main(String[] args) {
        int [] arr  = {10,5,8,20,2,18};
        System.out.println(Arrays.toString(arr));
        selectSort(arr,6);
        System.out.println(Arrays.toString(arr));
    }
}
