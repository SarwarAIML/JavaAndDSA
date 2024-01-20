package list.singleLinkedList.Node.sorting;


import java.util.Arrays;

/**
 * This video discusses a famous interview problem in
 * which you need to segregate an array of elements containing two types of elements. The types are:
 * <p>
 * Segregate negative and positive elements.
 * Segregate even and odd elements.
 * Sort a binary array.
 * <p>
 * we will solve these problems using HoarePartition
 */

public class SortArrayWithTwoTypesOfElements {


    public static void segPositiveNegativeElements(int arr[]) {

        int i = -1;
        int j = arr.length;
        while (true) {
            do {
                i++;
            } while (arr[i] < 0);
            do {
                j--;
            } while (arr[j] >= 0);
            if (i >= j)
                return;
            swap(arr, i, j);
        }
    }

    public static void segregateEvenOddElements(int arr[]) {
        int i = -1;
        int j = arr.length;
        while (true) {
            do {
                i++;
            } while (arr[i] % 2 != 0);
            do {
                j--;
            } while (arr[j] % 2 == 0);
            if (i >= j)
                return;
            swap(arr, i, j);
        }
    }

    public static void segregateZerosOnes(int[] arr) {
        int i = -1;
        int j = arr.length;
        while (true) {
            do {
                i++;
            } while (arr[i] == 0);
            do {
                j--;
            } while (arr[j] == 1);
            if (i >= j)
                return;
            swap(arr, i, j);
        }
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        System.out.println("segPositiveNegativeElements:::::::::::-start ");
        int arr[] = {13, -12, 18, -10};
        segPositiveNegativeElements(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println("segPositiveNegativeElements:::::::::::-end ");


        System.out.println("segregateEvenOddElements:::::::::::-start ");
        int arr1[] = {2, 5, 18, 10, 3};
        segregateEvenOddElements(arr1);
        System.out.println(Arrays.toString(arr1));
        System.out.println("segregateEvenOddElements:::::::::::-end ");

        System.out.println("segregateZerosOnes:::::::::::-start ");
        int arr2[] = {1, 0, 1, 1, 0};
        segregateZerosOnes(arr2);
        System.out.println(Arrays.toString(arr2));
        System.out.println("segregateZerosOnes:::::::::::-end ");
    }
}