package list.singleLinkedList.Node.sorting;

import java.util.Arrays;

public class MergeSort {


    public static void mergeFunction(int[] a,int low,int mid,int high){

        int n1 = mid-low+1;
        int n2 = high-mid;
        int[] left = new int[n1];
        int right[] = new int[n2];
        //left and right array creation from a sub array
        for (int i = 0; i < n1; i++) {
            left[i] = a[low+i];
        }
        for (int i = 0; i < n2 ; i++) {
            right[i] = a[mid+i+1];
        }

        int i = 0;
        int j = 0 ;
        int k = low;
        while (i < n1 && j < n2 ) {
            if(left[i] < right[j]){
                a[k++] = left[i++];
            }else {
                a[k++] = right[j++];
            }
        }
        while (i < n1){
            a[k++] = left[i++];
        }
        while (j < n2){
            a[k++] = right[j++];;
        }

    }

    public static void mergeSort(int arr[],int l,int r){
        if (r > l){
            int mid = l + (r-l)/2;
            mergeSort(arr,l,mid);
            mergeSort(arr,mid+1,r);
            mergeFunction(arr,l,mid,r);
        }
    }



    public static void main(String[] args) {
      /*  int[] a = {10,15,20,11,30};
        mergeFunction(a,0,2,4);
        System.out.println(Arrays.toString(a));*/
        System.out.println("=================");
        int a[] = new int[]{10,5,30,15,7};
        int l=0,r=4;
        mergeSort(a,0, a.length-1);
        System.out.println(Arrays.toString(a));


    }
}