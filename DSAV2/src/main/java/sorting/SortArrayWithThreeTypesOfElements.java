package sorting;


import java.util.Arrays;

/**
 * Description
 *
 * This video discusses a famous interview problem in
 * which you need to segregate an array of elements containing three types of elements. The types are:
 *
 * Sort an array of 0s, 1s, 2s.
 * Three-way partitioning when multiple occurrences of a pivot may exist.
 * Partitioning around a range.
 *
 *
 */
public class SortArrayWithThreeTypesOfElements {


    public static void DutchNationalFlagProblem(int [] arr){
        int low = 0;
        int mid = 0 ;
        int high = arr.length-1;

        while (mid <=high ){
            if (arr[mid] == 0){
                swap(arr,mid,low);
                low++;
                mid++;
            }else if (arr[mid] ==1){
                mid++;
            }else {
                swap(arr,mid,high);
                high--;
            }
        }

    }

    public static void sortAroundPivot(int[] arr,int pivot){
        int low = 0;
        int mid = 0;
        int high = arr.length-1;
        while (mid<=high){
            if (arr[mid] < pivot){
                swap(arr,low,mid);
                low++;
                mid++;
            } else if (arr[mid] == pivot) {
                mid++;
            }else {
                swap(arr,mid,high);
                high--;
            }
        }
    }

    public static void partitioningAroundRange(int arr[],int a,int b){
        int low = 0;
        int high = arr.length-1;
        int mid = 0 ;
        //10,5,6,3,20,9,40,2
        while (mid <= high ) {
            if(arr[mid] < a){
                swap(arr,low,mid);
                low++;
                mid++;
            } else if (arr[mid] >=a && arr[mid]  <= b ) {
                mid++;
            } else {
                swap(arr,mid,high);
                high--;
            }
        }
    }

    private static void swap(int[] arr, int i, int j)
    {

        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }


    public static void main(String[] args) {
        int arr[] = new int[]{0,1,1,2,0,1,1,2};

        System.out.println("DutchNationalFlagProblem:::::::::::-start ");
        DutchNationalFlagProblem(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println("DutchNationalFlagProblem:::::::::::-end ");

        int arr1[] = {2,1,2,20,10,20,1,1,2};

        System.out.println("sortAroundPivot:::::::::::-start ");
        sortAroundPivot(arr1 ,2);
        System.out.println(Arrays.toString(arr1));
        System.out.println("sortAroundPivot:::::::::::-end ");

        int arr2[] = {10,5,6,3,20,9,40,2};

        System.out.println("partitioningAroundRange:::::::::::-start ");
        partitioningAroundRange(arr2 ,5,10);
        System.out.println(Arrays.toString(arr2));
        System.out.println("partitioningAroundRange:::::::::::-end ");

    }
}
