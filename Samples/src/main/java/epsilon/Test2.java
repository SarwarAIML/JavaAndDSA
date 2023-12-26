package epsilon;

import java.util.Arrays;

public class Test2 {

    public static void quickSortUsingLomutoPartition(int arr[],int low,int high){
        if (low < high) {
            int p = LomutoPartion(arr,low,high);
            quickSortUsingLomutoPartition(arr,0,p-1);
            quickSortUsingLomutoPartition(arr,p+1,high);
        }
    }



    public static  int LomutoPartion(int[] arr,int low,int high){

        int pivot = arr[high];
        int i = low-1;
        for (int j = low; j <= high-1; j++) {
            if (arr[j] <pivot) {
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr,i+1,high);
        return i+1;
    }

    public static void swap(int arr[] ,int i,int j){
        int temp = arr[j];
        arr[j] = arr[i];
        arr[i] = temp;
    }

    public static void main(String[] args) {

        int arr[] = {12,3,4,6,7,8,9,19,14,6};
        //  3,4, 6 7 8,9,14
        quickSortUsingLomutoPartition(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));

    }
}
