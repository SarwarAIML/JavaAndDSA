package list.singleLinkedList.Node.sorting;

import java.util.Arrays;

public class CycleSort {

    public static void cycleSortDistinct(int[] arr){
        for (int cs = 0 ; cs < arr.length-2;cs++){
            int item = arr[cs];
            int pos = cs;
            for (int i = cs+1; i < arr.length ; i++) {
                if (arr[i] < item)
                  pos++;
            }
    //        swap(arr,item,arr[pos]);
            int temp = item ;
            item = arr[pos];
            arr[pos] = temp;
            while (pos != cs){
                pos = cs;
                for (int i = cs+1; i < arr.length; i++) {
                    if (arr[i] < item)
                        pos++;
                }
                //swap(item,arr[pos])
                temp=item;
                item=arr[pos];
                arr[pos]=temp;
            }
        }
    }


    public static void main(String[] args) {
        int arr[] = { 20,40,50,10,30 };
        cycleSortDistinct(arr);
        System.out.println(Arrays.toString(arr));
    }

    //task
    // implement cycle sort with duplicate elements
    //modify the cycle sort so that it counts the minimum number of swaps required  to sort an array
}