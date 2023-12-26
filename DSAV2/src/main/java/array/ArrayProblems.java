package array;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;

public class ArrayProblems {


    /**
     *
     * @param arr
     * @return
     *
     * Description
     * Our Task: Given an array arr[ ] of size n, the task is to
     * find the largest element in the given array.
     *
     * 1) Naive Method:
     * In this approach, we traverse the array for each element present in the array. We compare all elements with each other to find the largest element in the array.
     * Time Complexity: O(n2)
     *
     * 2) Efficient Method:
     * One of the most simplest and basic approach to solve this problem is to simply traverse the whole list and find the maximum among them.
     *
     * Follow the steps below to implement this idea:
     *
     * Create a local variable max to store the maximum among the list
     * Initialize max with the first element initially, to start the comparison.
     * Then traverse the given array from second element till end, and for each element:
     * Compare the current element with max
     * If the current element is greater than max, then replace the value of max with the current element.
     * At the end, return and print the value of the largest element of array stored in max.
     * Time Complexity: O(n)
     *
     *
     *
     */

    public static  int largestElement(int arr[]){
        int largestIndex = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > arr[largestIndex])
                largestIndex = i;
        }
        return largestIndex;
    }

    /**
     *
     * @param arr
     * @return
     *
     * 2) Efficient Approach:
     * In this approach, we find the 2nd largest element in the array,
     * by a single traversal through the array. We maintain the record of the
     * Largest and Second Largest element, which traversing through the array.
     *
     * Time Complexity: O(n)
     *
     *
     */
    public static int SecondLargestElement(int arr[])
    {
        int largest = 0;
        int secondLargest = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > arr[largest]){
                secondLargest = largest;
                largest = i;
            }else if (arr[i] != arr[largest]){
                if (secondLargest == -1 || arr[i] > arr[secondLargest])
                    secondLargest = i;
            }
        }
        return secondLargest;

    }

    /**
     *
     * @param arr
     * @return
     */
    public static boolean isArraySorted(int[] arr){

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[i-1])
                return false;
        }
        return true;
    }

    /**
     *
     * @param arr
     */
    public static void reverseArray(int arr[]){

        int low = 0;
        int high = arr.length-1;
        while (low<=high)
        {
            int temp = arr[high];
            arr[high] = arr[low];
            arr[low] = temp;
            low++;
            high--;
        }

    }


    /**
     * Our Task: Given a sorted array, the task is to remove the duplicate elements from the array.
     * @param array
     *
     * 1) Naive Approach
     * In this approach, we traverse the array and find the distinct elements,
     * which are then copied to a new array. After all the distinct elements are copied to the new array,
     * the elements from the new array are transferred back to the original array.
     *
     * Time Complexity : O(n)
     * Auxiliary Space : O(n)  // new array for storing distinct elements is required
     *
     *
     *
     */
    public static void removeDuplicate_Naive(int[] array){

        int[] temp = new int[array.length];
        temp[0] = array[0];
        int tempIndex = 1;
        for (int i = 1; i < array.length; i++) {
            if (temp[tempIndex-1] != array[i] ){
                temp[tempIndex++] = array[i];
            }

        }

        for (int i = 0; i < tempIndex; i++) {
            array[i] = temp[i];
        }


    }
    /**
     * 2) Efficient Approach:
     * In this approach we compare the current element with the previous
     * distinct element and check if the current element is a distinct element or not.
     *
     * Time Complexity : O(n)
     * Auxiliary Space : O(1)
     * @param array
     */

    public static int removeDuplicate(int[] array){

        int index = 1;
        for (int i = 1; i < array.length; i++) {
            if (array[index-1] != array[i]){
                array[index++] = array[i];
            }
        }
        return index ;
    }



    /**
     * Given a sorted array, the task is to remove the duplicate elements from the array.
     * @param arr
     *2) Efficient Approach
     * In this approach, we maintain a count of the non-0 elements traversed.
     * When a 0 element is found, we place the value of the non-0 element at the element place of arr[count].
     *
     * Time Complexity: O(n).
     * Auxiliary Space: O(1).
     *
     * idea is we fix elements of array from A0 to Ai-1 element and when new element comes
     * if it is zero do nothing
     * if  Ai != 0 then swap Ai with zero element
     * for keep tracking of non zero element take a count variable
     *
     * Input: arr[]  = {1, 2, 0, 0, 0, 3, 6}
     * Output: 1 2 3 6 0 0 0
     *
     * Input: arr[] = {0, 1, 9, 8, 4, 0, 0, 2, 7, 0, 6, 0, 9}
     * Output: 1 9 8 4 2 7 6 9 0 0 0 0 0
     *
     */

    public static void moveZeroToEnd(int[] arr){

        int count = 0 ;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0){
                swap(arr,count,i);
                count++;
            }
        }


    }

    private static void swap(int[] arr, int low, int high) {
        int tmp = arr[low] ;
        arr[low] = arr[high];
        arr[high] = tmp;
    }


    /**
     *
     * @param arr
     * Our Task: Given an array, the task is to Left Rotate an Array by One.
     *
     * Steps to Solve the Problem:
     * Store the 1st element(index 0) in a temporary variable.
     * Start from the 2nd element (index 1) and move the elements back by one position.
     * Update the value of the last element in the array, by the value of the 1st variable,
     * which was initially stored in the temporary variable.
     *
     *
     * Time Complexity: O(n)
     *
     *
     *
     * Space Complexity: O(1)
     */

    public static void leftRotateByeOne(int[] arr){
        int temp  = arr[0];
        for (int i = 1; i < arr.length; i++) {
            arr[i-1] = arr[i];
        }
        arr[arr.length-1] = temp;
    }

    /**
     *
     * @param arr
     * @param d
     *
     * 3) Reversal Approach (Efficient):
     * This approach consists of 3 reversal steps:
     *
     * Reverse the elements from 0 to d-1 index
     * Reverse the elements from d to n-1 index
     * finally reverse the whole array
     * Time Complexity: Theta(n)
     *
     * Space Complexity: Theta(1)
     */
    public static void leftRotateByeD(int arr[],int d){
        reverseArray(arr,0,d-1);
        reverseArray(arr,d,arr.length-1);
        reverseArray(arr,0,arr.length-1);
    }

    public static void rightRotateByD(int[] array,int d) {

        reverseArray(array,0,array.length-1);
        reverseArray(array,0,d-1);
        reverseArray(array,d,array.length-1);
    }


    private static void reverseArray(int[] arr, int low, int high) {
        while (low<high){
            swap(arr,low,high);
            low++;
            high --;
        }
    }

    /**
     *
     * @param arr
     *
     * Given an array, the task is to write a program to print all the LEADERS in the array.
     *
     * What is a Leader?
     * An element is a leader if it is greater than all the elements to its right side.
     * And the rightmost
     * element is always a leader.
     *
     */
    public static void leader(int[] arr){
        for (int i = 0; i < arr.length; i++) {

            boolean isLeader = false ;
            for (int j = i+1; j <arr.length ; j++) {
                if (arr[i] <= arr[j]){
                    isLeader = true;
                    break;
                }
            }
                if (!isLeader )
                    System.out.println(arr[i]);
        }
    }

    /**
     * 2) Efficient Approach:
     * The idea is to scan all the elements from right to left in
     * an array and keep track of the maximum till now.
     * When the maximum changes its value, print it.
     *
     * Time Complexity: O(n)
     * Auxiliary Space: O(1)
     * @param arr
     *
     * In computer programming, a "leader" in an array is an element which
     * is greater than all the elements to its right side.
     * The rightmost element is always a leader.
     */
    public static void printLeaders(int[] arr) {
        int n = arr.length;
        if (n == 0)
            return;
        int maxFromRight = arr[n-1];
        // Rightmost element is always a leader
        System.out.print(maxFromRight + " ");

        for(int i = n - 2; i >= 0; i--) {
            if (arr[i] > maxFromRight) {
                maxFromRight = arr[i];
                System.out.print(maxFromRight + " ");
            }
        }

        System.out.println(); // For a new line after printing all leaders
    }

    /**
     *
     * @param arr
     * @return
     *
     * Given an array arr[] of integers, find out the maximum difference between any two
     * elements such that the larger element appears after the smaller number.
     * find max(arr[j]-arr[i]) such that j > i ;
     *
     *1) Naive Approach:
     * We use two loops. In the outer loop, pick elements one by one and in the inner
     * loop calculate the difference of the picked element with every other element in
     * the array and compare the difference with the maximum difference calculated so far.
     * Below is the implementation of the above approach :
     * Time Complexity : O(n^2)
     * Auxiliary Space : O(1)
     *
     */

    public static int maxDiff_Naive(int arr[]){
        int maxDiff = arr[1] - arr[0];
        for (int i = 0; i <arr.length-2 ; i++) {
            for (int j = i+1; j < arr.length-1 ; j++) {
                maxDiff = Math.max(maxDiff,arr[j]-arr[i]);
            }
        }
        return maxDiff;
    }

    public static  int maxDiff(int arr[]){
      int maxDif = arr[1]-arr[0];
      int minValue = arr[0];
        for (int i = 1; i <arr.length ; i++) {
            maxDif = Math.max(maxDif,arr[i]-maxDif);
            minValue = Math.min(minValue,arr[i]);
        }
      return maxDif;
    }

    /**
     *
     * @param arr
     */
    public static void printFreqSortedArray(int[] arr){

        int freq = 1;
        int i = 1 ;
        while (i < arr.length) {
            while (i < arr.length && arr[i] == arr[i-1]){
                freq++;
                i ++;
            }
            System.out.println(arr[i-1] +" :: "+freq);
            i++;
            freq = 1;
        }
        if (arr.length == 1 || arr[arr.length-1] != arr[arr.length-2])
            System.out.println(arr[arr.length-1] +":: "+ 1);
    }

    /**
     *
     * @param array
     */
    public static void printFreqInUnsortedArray(int[] array){

        Map<Integer,Integer> map = new LinkedHashMap<Integer,Integer>();
        for (int num : array){
           map.put(num,map.getOrDefault(num, 0) + 1);
        }
        System.out.println(map);
    }

    /**
     *
     * @param price
     * @return
     *
     * Efficient Approach (Valley Peak Approach):
     * In this approach, we just need to find the next greater
     * element and subtract it from the current element so that the
     * difference keeps increasing until we reach a minimum. If the sequence is a
     * decreasing sequence, so the maximum profit possible is 0.
     *
     * Follow the steps below to solve the problem:
     * maxProfit = 0
     * if price[i] > price[i – 1]
     * maxProfit = maxProfit + price[i] – price[i – 1]
     *
     * Time Complexity: O(n), Traversing over the array of size n
     * Auxiliary Space: O(1)
     */
    public static int maxProfit(int[] price){
        int maxProfit = 0;
        for (int i = 1; i < price.length; i++) {
            if (price[i] > price[i-1]){
                maxProfit +=  price[i] - price[i-1];
            }
        }
        return maxProfit;
    }

    public static void zeroOneSorting(int arr[]){

        int type0 = 0;
        int type1 = arr.length-1;
        while (type0<type1){
            if (arr[type0] == 1){
                if (arr[type1] ==0){
                    swap(arr,type0,type1);
                }
                type1--;
            }else {
                type0++;
            }
        }

    }












    public static void main(String[] args) {


        System.out.println("===============zeroOneSorting Start==============");
        int arr11[]={0,1,0,0,1,1,1,0,1};
        zeroOneSorting(arr11);
        System.out.println(Arrays.toString(arr11));
        System.out.println("===============zeroOneSorting End==============" + "\n");

        //removeDuplicate
        int  arr10[] = {1,5,3,8,12};
        System.out.println("===============maxProfit Start==============");
        System.out.println(maxProfit(arr10));
        System.out.println("===============printFreqInUnsortedArray End==============" + "\n");

       int  arr9[] = {2, 2, 6, 6, 7, 7, 7, 11};
        System.out.println("===============printFreqInUnsortedArray Start==============");
        printFreqInUnsortedArray(arr9);
        System.out.println("===============printFreqInUnsortedArray End==============" + "\n");



        int  arr8[] = {2, 2, 6, 6, 7, 7, 7, 11};
        System.out.println("===============printFreq Start==============");
        printFreqSortedArray(arr8);
        System.out.println("===============printFreq End==============" + "\n");



        int   arr7[] = {2, 3, 10, 6, 4, 8, 1};
        System.out.println("===============maxDiff Start==============");
        System.out.println(maxDiff(arr7));
        System.out.println("===============maxDiff End==============" + "\n");


        int   arr6[] = {2, 3, 10, 6, 4, 8, 1};
        System.out.println("===============maxDiff_Naive Start==============");
        System.out.println(maxDiff_Naive(arr6));
        System.out.println("===============maxDiff_Naive End==============" + "\n");


        int   arr5[] = {1, 2, 3, 4, 5, 2};
        System.out.println("===============leader_Efficient Start==============");
        printLeaders(arr5);
        System.out.println("===============leader_Efficient End==============" + "\n");


        int   arr4[] = {1, 2, 3, 4, 5, 2};
        System.out.println("===============leader Start==============");
        leader(arr4);
        System.out.println("===============leader End==============" + "\n");





        int[] array3 = {1,2,3,4,5,6,7,8,9};
        //  //[8, 9, 1, 2, 3, 4, 5, 6, 7]
        System.out.println("===============rightRotateByD Start==============");
        rightRotateByD(array3,2);
        System.out.println(Arrays.toString((array3)));
        System.out.println("===============rightRotateByD End==============" + "\n");


        int   arr2[] = {1, 2, 0, 0, 0, 3, 6};
        System.out.println("===============leftRotateByeOne Start==============");
        leftRotateByeOne(arr2);
        System.out.println(Arrays.toString((arr2)));
        System.out.println("===============leftRotateByeOne End==============" + "\n");



      int   arr1[] = {1, 2, 0, 0, 0, 3, 6};
        System.out.println("===============moveZeroToEnd Start==============");
        moveZeroToEnd(arr1);
        System.out.println(Arrays.toString((arr1)));
        System.out.println("===============moveZeroToEnd End==============" + "\n");


        int arra13[] = {2,5,6,6,9,3};
        System.out.println("===============removeDuplicate Start==============");
        removeDuplicate(arra13);
        System.out.println(Arrays.toString((arra13)));
        System.out.println("===============removeDuplicate End==============" + "\n");

        int arra12[] = {2,5,6,6,9,3};
        System.out.println("===============removeDuplicate_Naive Start==============");
        removeDuplicate_Naive(arra12);

        System.out.println(Arrays.toString((arra12)));
        System.out.println("===============removeDuplicate_Naive End==============" + "\n");




        int arra1[] = {2,5,6,6,9,3};
        System.out.println("===============reverseArray Start==============");
        reverseArray(arra1);
        System.out.println(Arrays.toString((arra1)));
        System.out.println("===============reverseArray End==============" + "\n");

        int arra[] = {2,5,6,6,9,3};
        System.out.println("===============isArraySorted Start==============");
        System.out.println(isArraySorted(arra));
        System.out.println("===============isArraySorted End==============" + "\n");


        int[] arr = {10,5,15,18,-1,17};
        int x = largestElement(arr);
        int y = SecondLargestElement(arr);


        System.out.println("===============SecondLargestElement Start==============");
        System.out.println("second element in the array is :::"+arr[y]);
        System.out.println("===============SecondLargestElement End==============" + "\n");

        System.out.println("===============largestElement Start==============");
        System.out.println("Largest element in the array is :::"+arr[x]);
        System.out.println("===============largestElement End==============" + "\n");

    }
}
