package array;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class RemoveDuplicateFromArray {

    public static void main(String[] args) {

        int arr[] = {10, 20, 20, 30, 30, 30};

        int index = removeDuplicateNaive(arr);
        for (int i = 0; i <index ; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        System.out.println("efficient Solution if dsa1.array is shorted ");
        int index1 = removeDuplicate(arr);
        for (int i = 0; i <index1 ; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        System.out.println("efficient Solution if dsa1.array is not shorted ");
        int unsortedarr[] = {5, 1, 2, 6, 4, 4, 5, 6, 8, 7};
        removeDup(unsortedarr);
    }

    //efficient solution if dsa1.array is sorted
    private static int removeDuplicate(int[] arr) {
        int index = 1;
        for (int i = 1; i < arr.length ; i++) {
            if (arr[i] != arr[index-1]){
                arr[index] = arr[i];
                index ++;
            }

        }
        return index;
    }

    //this is applicable for sorted dsa1.array
    private static int removeDuplicateNaive(int[] arr) {

        int[] temp = new int[arr.length] ;
        temp[0] = arr[0];
        int tempindex = 1;
        for (int i = 1; i < arr.length ; i++) {
            if (temp[tempindex-1] != arr[i]) {
                temp[tempindex] = arr[i];
                tempindex++;
            }
        }
        for (int i = 0; i <tempindex ; i++) {
            arr[i] = temp[i];
        }
        return tempindex;
    }

    //if dsa1.array is not sorted
    public static void removeDup(int[] arr) {

        HashSet set = new LinkedHashSet<Integer>();
        for (int i = 0; i < arr.length ; i++) {
            set.add(arr[i]);
        }
        set.forEach(element -> System.out.print(element + " "));
    }
}
