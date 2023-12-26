package array.old;

import java.util.Arrays;
import java.util.Collections;

public class LeftRotationByOne {

    static void leftRotateByOne(int[] array){
        int temp = array[0];
        for (int i = 1; i < array.length ; i++)
            array[i-1] = array[i];
        array[array.length-1] = temp;
    }

    public static void main(String[] args) {
      int array[] = {10,4,5,6,8,9};
        leftRotateByOne(array);
        System.out.println(Arrays.toString(array));
    }
}
