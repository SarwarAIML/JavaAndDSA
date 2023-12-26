package Hashing;

import java.util.HashSet;

public class PairWithGiveSumInUnsortedArray {

    public static void main (String[] args) {
        int arr[] = new int[]{3, 8, 4, 7, 6, 1};

        int sum = 14;
        System.out.println(pairWithSumX(arr,sum));
    }

    static boolean pairWithSumX(int arr[], int sum)
    {
        HashSet<Integer> us = new HashSet<>();
        for(int i = 0; i < arr.length; i++)
        {
            if(us.contains(sum - arr[i]))
                return true;
            us.add(arr[i]);
        }
        return false;

    }
}
