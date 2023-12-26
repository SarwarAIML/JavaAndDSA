package array.old;


import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

/**
 * Sort an array of 0s, 1s and 2s | Dutch National Flag problem
 *
 * Given N balls of colour red, white or blue arranged in a line in random order.
 * You have to arrange all the balls such that the balls with the same colours
 * are adjacent with the order of the balls, with the order of the colours being red,
 * white and blue (i.e., all red coloured balls come first then the white coloured balls
 * and then the blue coloured balls).
 *
 * Sort an array of 0s, 1s, and 2s using the Pointer Approach:
 * This approach is based on the following idea:
 *
 * The problem is similar to “Segregate 0s and 1s in an array”.
 * The problem was posed with three colors, here `0′, `1′ and `2′. The array is divided into four sections:
 * arr[1] to arr[low – 1]
 * arr[low] to arr[mid – 1]
 * arr[mid] to arr[high – 1]
 * arr[high] to arr[n]
 * If the ith element is 0 then swap the element to the low range.
 * Similarly, if the element is 1 then keep it as it is.
 * If the element is 2 then swap it with an element in high range.
 *
 */

public class DutchNationalFlagProblem {
    public static void swap(int[] arr,int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] =temp;
    }
    public static void segregate0and1and2(int[] arr){
        int low = 0;
        int mid = 0;
        int high = arr.length-1;
        while (mid <= high){

            switch (arr[mid]){
                case 0:
                    swap(arr, low, mid);
                    low++;
                    mid++;
                    break;
                case 1:
                    mid++;
                    break;
                case 2:
                    swap(arr, mid, high);
                    high--;
                    break;
            }
        }
    }
    public static void main(String[] args) {
        int arr[] = { 0, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0, 1 };
        segregate0and1and2(arr);
        System.out.println( Arrays.toString(arr));
    }
}
