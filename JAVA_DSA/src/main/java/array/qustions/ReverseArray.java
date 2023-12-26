package array.qustions;

import java.util.Arrays;

public class ReverseArray {

    public static void reverseArray(int[] array){
            int low = 0;
            int high = array.length-1;
            while (low < high)
            {
                int temp = array[low];
                array[low] = array[high];
                array[high] = temp;
                low ++;
                high--;
            }
    }

    public static void main(String[] args) {
        int[] array ={2,4,8,11,9,2,17};
        System.out.println("Array before reverse:"+Arrays.toString(array));
        reverseArray(array);
        System.out.println("Array After reverse :: "+Arrays.toString(array));
    }
}
