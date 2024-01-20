package list.singleLinkedList.Node.sorting;

import java.util.Arrays;
import java.util.stream.Stream;

public class UnionOfArrays {

    public static void main(String[] args) {

        int a[] ={3,8,8};
        int b[] ={2,8,8,10,15};

        int[] result = unionOfArrays(a,b);
        System.out.println(Arrays.toString(result));
    }

    private static int[] unionOfArrays(int[] ...arrays) {
        if (arrays.length == 0 || arrays == null)
            return new int [0];
        for (int[] array :arrays){
            Arrays.sort(array);
        }
        int result[] =  arrays[0];
        for (int i = 1; i <arrays.length ; i++) {
            result = union(result,arrays[i]);
        }
        return result;
    }
    public static int[] union(int[] array1, int[] array2) {
        int i = 0;
        int j = 0 ;
        int k = 0;
        int result[] = new int[array1.length+array2.length];
        while (i < array1.length && j < array2.length ){
            if (i > 0 && array1[i] == array1[i-1]) {
                i++;
                continue;
            }
            if (j > 0 && array1[j] == array1[j-1]) {
                j++;
                continue;
            }
            if (array1[i] < array2[j]){
                result[k++] = array1[i++];
            } else if (array1[i] > array2[j]) {
                result[k++] = array2[j++];
            }else {
                result[k++] = array1[i++];
                j++;
            }

        }
        while (i < array1.length ){
            if (i == 0 || array1[i] != array1[i-1]) {
                result[k++] = array1[i++];
            }else {
                i++;
            }
        }
        while (j < array2.length ){
            if (j == 0 || array2[j] != array2[j-1]) {
                result[k++] = array2[j++];
            }else {
                j++;
            }
        }
        return Arrays.copyOf(result,k);
    }

    Integer[] unionOfArrayUsingJava8(int[] a,int[] b){
        return Stream.of(a,b).flatMap(Stream::of).toArray(Integer[]::new);
    }
}