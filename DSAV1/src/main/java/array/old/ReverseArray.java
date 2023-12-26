package array.old;

import java.util.Arrays;

public class ReverseArray {

    public static int[] reversearray(int[] array){
        int low = 0;
        int high = array.length-1;
        while (low < high){
            int temp = array[low];
            array[low] = array[high];
            array[high]=temp;
            low++;
            high--;
        }
        return array;
    }

    public static void main(String[] args) {
        int[] array = {2,9,8,6,12};
        System.out.println(Arrays.toString(reversearray(array)));
    }
}
