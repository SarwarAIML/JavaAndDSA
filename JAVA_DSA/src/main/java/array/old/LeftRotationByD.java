package array.old;

import java.util.Arrays;

public class LeftRotationByD {

    public static void rotateByOne(int[] array){
        int temp = array[0];
        for (int i = 1; i < array.length; i++) {
            array[i-1] = array[i];
        }
        array[array.length-1]=temp;
    }
    public static void leftRotateByD(int[] array,int d){
        reverseArray(array,0,d-1);
        reverseArray(array,d,array.length-1);
        reverseArray(array,0,array.length-1);

    }

    private static void reverseArray(int[] array, int low, int high) {

        while (low<high){
            swap(array,low,high);
            low++;
            high--;
        }
    }

    private static void swap(int[] array, int low, int high) {

        int temp = array[low];
        array[low] = array[high];
        array[high] = temp;
    }

    public static void main(String[] args) {
        int d=2;
        int[] arry1 = {10,30,5,4,9};
        int[] arry2 = {10,30,5,4,9};
        for (int i = 0; i <2 ; i++) {
            rotateByOne(arry1);
        }
        System.out.println(Arrays.toString(arry1));
        leftRotateByD(arry2,2);
        System.out.println(Arrays.toString(arry2));
    }
}
