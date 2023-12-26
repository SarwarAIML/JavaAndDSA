package array;

import java.util.Arrays;

public class MoveAllZeroToEnd {

    public static void main(String[] args) {

        int arr[] = {1, 9, 8, 4, 0, 0, 2, 7, 0, 6, 0, 9};
        System.out.println(Arrays.toString(arr));
        moveZeroToEndNaive(arr);
        System.out.println(Arrays.toString(arr));
        moveZeroToEnd(arr);
        System.out.println("After moveZeroToEnd call ");
        System.out.println(Arrays.toString(arr));
    }

    private static void moveZeroToEnd(int[] arr) {
        int count = 0 ;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0){
                swap(arr,count,i);
                count++;
            }
        }
    }

    private static void moveZeroToEndNaive(int[] arr) {

        for (int i = 0; i < arr.length ; i++)
        {
            if (arr[i] == 0)
            {
                for (int j = i+1; j < arr.length ; j++)
                {
                    if (arr[j] != 0)
                    {
                        swap(arr,i,j);
                        break;
                    }
                }
            }

        }
    }
    private static void swap(int[] arr , int index1, int index2) {
        int temp = arr[index1] ;
        arr[index1] = arr[index2] ;
        arr[index2] = temp ;
    }
}
