package array.qustions;

import java.util.Arrays;

public class RemoveDuplicatesFormSortedArray {


    public static int removeDup(int arr[]){
        int index = 1;
        for (int i = 1; i < arr.length ; i++) {
            if (arr[index-1] != arr[i]){
                arr[index] = arr[i];
                index++;
            }
        }
        return index ++;
    }

    /**
     *
     * naive solutions
     * @param array
     * @return
     * time : O(n^2)
     */
    public static int removeDuplicates(int[] array){

        int temp[] = new int[array.length];
        temp[0] = array[0];
        int index  = 1;
        for (int i = 1; i < array.length; i++) {
            if (temp[index-1] != array[i]){
                temp[index++] = array[i];
            }
        }
        for (int i = 0; i < index; i++) {
            array[i] = temp[i];
        }
        return index;
    }

    public static void main(String[] args) {

        int arr[] = {10, 20, 20, 30, 30, 30};
        System.out.println("Before Removal::"+ Arrays.toString(arr));
        removeDuplicates(arr);
        System.out.println("After Removal::"+ Arrays.toString(arr));

        System.out.println("==========================");

        System.out.println("Before Removal::"+ Arrays.toString(arr));
        removeDup(arr);
        System.out.println("After Removal::"+ Arrays.toString(arr));

    }
}
