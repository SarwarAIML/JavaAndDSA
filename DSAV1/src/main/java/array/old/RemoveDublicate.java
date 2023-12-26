package array.old;

import java.util.Arrays;
import java.util.Collections;

public class RemoveDublicate {
    /**
     *
     * @param arry
     * @return
     * make sure array is sorted
     */
    static int removeDublicate(int[]  arry){
        int[] temp = new int[arry.length-1];
        temp[0]=arry[0];
        int res = 1;
        for (int i = 1; i <arry.length-1 ; i++) {
            if (temp[res-1] !=arry[i]){
                temp[res] = arry[i];
                res++;
            }
        }
        for (int i = 0; i <res ; i++)
            arry[i] = temp[i];
        return res;
    }

    /**
     *
     * @param array
     * @return
     * make sure array is sorted otherwise it won't work
     * this the efficient method
     */
    static int removeDublicate1(int[] array){
        int index = 1;
        int n = array.length-1;
        for (int i = 1; i <n ; i++) {
            if (array[index-1] != array[i]){
                array[index] = array[i];
                index++;
            }
        }
        return index;
    }
    public static int removeDublicatePra(int[] array ){
        int intdex = 1;
        for (int i = 1; i < array.length ; i++) {
            if (array[intdex-1] !=array[i] ){
                array[intdex] = array[i];
                intdex++;
            }
        }
        return intdex;
    }


    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        int[] array = {2,9,8,6,12,9,8};
        Arrays.sort(array);
        int index = removeDublicate1(array);
        for (int i = 0; i <index ; i++) {
            System.out.print(array[i]+" ");
        }
    }
}
