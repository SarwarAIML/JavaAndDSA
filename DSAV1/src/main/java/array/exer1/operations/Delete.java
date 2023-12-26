package array.exer1.operations;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Delete {

    public static void main(String[] args) {

        int array[] = {3,8,12,5,16};
        int x = 12 ;
        System.out.println(Arrays.toString(array));
        int newSize = delete(array,x);
        System.out.println(Arrays.toString(array));
    }

    public static int delete(int[] array, int x) {

        int i ;
        for ( i = 0; i < array.length ; i++) {
            if (array[i] == x)
                break;
        }
        if (i == array.length)
            return array.length;

        for (int j = i; j < array.length-1 ; j++) {
                array[j] = array[j+1];
        }
        array[array.length-1] = 0 ;
        return (array.length-1);
    }
}
