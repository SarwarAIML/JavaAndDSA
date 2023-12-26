package array;

import java.util.Arrays;

public class ReverseArray {

    public static void main(String[] args) {

        int arr[] = {3, 8, 12, 5, 6};
        reverseArray(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void reverseArray(int[] arr) {
        int low = 0 ;
        int high = arr.length-1;
        while (low < high) {
            swap(arr, low, high);
            low++;
            high--;
        }
    }
    private static void swap(int[] arr, int low, int high) {
        int tmp = arr[low] ;
        arr[low] = arr[high];
        arr[high] = tmp;
    }
}
