package Sorting.mergesort;

public class MergeSort {

    public static void main(String[] args) {
        int arr[] = {23,5,7,8,9,10};
        mergeSort(arr,0,arr.length-1);
    }

    private static void mergeSort(int[] arr, int low, int high) {

        if (high > low){
            int mid = low +(high-low)/2;
            mergeSort(arr,low,mid);
            mergeSort(arr,mid+1,high);
            merge(arr,low,mid,high);
        }
    }

    private static void merge(int[] arr, int low, int mid, int high)
    {
        int n1 = mid-low + 1;
        int n2 = high-mid;

        int left[] = new int[n1];
        int right[] = new int[n2];

        for (int i = 0; i < n1 ; i++) {
            left[i] = arr[low+i];
        }
        for (int i = 0; i < n2 ; i++) {
            right[i] = arr[mid+1+i];
        }

        int i =0 ;
        int j =0 ;
        int k = low;
        while (n1 < i && n2 < j){
            if (arr[i] < arr[j]){
                arr[k++] = left[i++];
            }
        }

    }
}
