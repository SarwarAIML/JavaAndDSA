package sorting;

import java.util.Arrays;

public class QuickSortPartitions {

    public static void naivePartition(int[] array,int low ,int high,int p){

        int index = 0; ;
        int size = high-low+1;
        int[] temp = new int[size];
        for (int i = low; i <=high; i++) {
            if (array[i] <= array[p]){
                temp[index++] = array[i];
            }
        }
        for (int i = low; i <=high; i++) {
            if (array[i] > array[p]){
                temp[index++] = array[i];
            }
        }

        for (int i = low; i <= high; i++) {
            array[i] = temp[i-low];
        }
    }

    public static int LomutoPartion(int arr[],int low,int high){
            int pivot = arr[high];
            int i = low-1;
        for (int j = low; j <=high-1 ; j++) {
            if (arr[j]< pivot){
                i ++;
                swap (arr,i,j);
            }
        }
        swap(arr,i+1,high);
        return i+1;
    }

    public static int hoarsPartition(int arr[],int low,int high) {
        int pivot = arr[low];
        int i = low - 1;
        int j = high + 1;
        while (true) {
            do {
                i++;
            } while (arr[i] < pivot);
            do {
                j--;
            } while (arr[j] > pivot);
            if (i >= j)
                return j;
            swap(arr, i, j);
        }
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[j];
        arr[j] = arr[i];
        arr[i] = temp;
    }

    public static void quickSortUsingLomutoPartition(int[] arr,int low,int high){
        if (low < high){
            int p = LomutoPartion(arr,low,high);
            quickSortUsingLomutoPartition(arr,0,p-1);
            quickSortUsingLomutoPartition(arr,p+1,high);
        }
    }
    public static void quickSortUsingHoarePartition(int arr[],int low,int high){
        if (low< high){
            int p = hoarsPartition(arr,low, high);
            quickSortUsingHoarePartition(arr,low,p);
            quickSortUsingHoarePartition(arr,p+1,high);
        }
    }

    public static int kthSmallestElement(int arr[],int k){
        int low = 0;
        int high = arr.length-1;
        while (low <=high){
            int p = LomutoPartion(arr,low,high);
            if (p == k-1){
                return p;
            } else if (p>k-1) {
               high = p-1;
            }else {
                low = p+1;
            }
        }
        return -1;
    }





    public static void main(String[] args) {

        int[] arr = {5,13,6,9,12,11,8};
        naivePartition(arr,0,6,6);
        System.out.println(Arrays.toString(arr));
        System.out.println("LomutoPartion:::::::::::-starts ");
        int arr1[] = new int[]{10,80,30,90,40,50,70};
        int n = arr.length;
        LomutoPartion(arr1,0,n-1);
        System.out.println(Arrays.toString(arr1));
        System.out.println("LomutoPartion:::::::::::-end ");
        System.out.println();
        System.out.println("hoarsPartition:::::::::::-start ");

        int arr2[] = {5,3,8,4,2,7,1,10};
        hoarsPartition(arr2,0,arr2.length-1);
        System.out.println(Arrays.toString(arr2));

        System.out.println("hoarsPartition:::::::::::-end ");
        System.out.println();

        System.out.println("quickSortUsingLomutoPartion:::::::::::-start ");
        int arr3[] = {8,4,7,9,3,10,5};
        quickSortUsingLomutoPartition(arr3,0,arr3.length-1);
        System.out.println(Arrays.toString(arr3));
        System.out.println("quickSortUsingLomutoPartion:::::::::::-end ");

        System.out.println("quickSortUsingHoarePartition:::::::::::-start ");
        int arr4[] = {8,4,7,9,3,10,5};
        quickSortUsingHoarePartition(arr4,0,arr3.length-1);
        System.out.println(Arrays.toString(arr4));
        System.out.println("quickSortUsingHoarePartition:::::::::::-end ");

        System.out.println("kthSmallestElemet:::::::::::-start ");
        int arr5[] = {8,4,7,9,3,10,5};
        int k = kthSmallestElement(arr5,3);
        System.out.println(arr4[k]);
        System.out.println("kthSmallestElemet:::::::::::-end ");
    }
}