package list.singleLinkedList.Node.sorting;

import java.util.Arrays;

public class SortedArraysIntersection {

    public static void main(String[] args) {
        int ar1[] = { 1, 5, 5,10, 20, 40, 80 };
        int ar2[] = { 5, 6, 7, 20, 30, 40, 50, 80 };
        int ar3[] = { 3, 4, 15, 20, 30, 40, 50, 60, 77, 80 };
        int ar4[] = { 3, 4, 15, 20, 30, 40, 50, 60, 77,78,79, 80 };
        int ar5[] = { 3, 4, 15, 20, 30, 40, 50, 60,64,65,69, 77,78,79, 80 };

        int[] finsIntersection = finsIntersection(ar1,ar2,ar3,ar4,ar5);
        System.out.println("intesectios of arrays are"+Arrays.toString(finsIntersection));
    }

    public static int[] finsIntersection(int[] ...arrays) {
        if (arrays ==null || arrays.length==0)
            return new int[0];
        for (int[] array : arrays){
            Arrays.sort(array);
        }

        int result[] = arrays[0];
        for (int i = 1; i <arrays.length ; i++) {
            result = inersect(result,arrays[i]);
        }
        return result;
    }

    public static int[] inersect(int[] array1, int[] array2) {
        int i = 0 ,j = 0 , k = 0;
        int result[] = new int[Math.min(array1.length, array2.length)];
        while (i< array1.length && j< array2.length){
            if (i> 0 && array1[i] == array1[i-1]){
                i++;
                continue;
            }
            if (array1[i] < array2[j]){
                i++;
            } else if (array1[i] > array2[j]) {
                j ++;
            }else {
                result[k++] = array1[i++];
                j++;
            }
        }
       return Arrays.copyOf(result,k);
    }

    int[] intersectOfArrayUsingJava8(int[] a,int[] b){

        int[] ints = Arrays.stream(a)
                .distinct()
                .filter(x -> Arrays.asList(b).contains(x)).toArray();

        return ints;
    }
}