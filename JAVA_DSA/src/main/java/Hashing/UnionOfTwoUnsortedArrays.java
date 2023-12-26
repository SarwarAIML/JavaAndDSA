package Hashing;

import java.util.HashSet;
import java.util.Set;

public class UnionOfTwoUnsortedArrays {


    public static void main (String[] args) {
        int arr1[] = new int[]{2, 8, 3, 5, 6};
        int arr2[] = new int[]{4, 8, 3, 6, 1};


        System.out.println(unionSize(arr1,arr2));
    }

    /**
     *
     * @param arr1
     * @param arr2
     * @return
     * union element of array mens only distinct elements of an array
     * we have to ignore the dublicate and consider only one in case any common is there
     */
    static int unionSize(int arr1[], int arr2[])
    {
        Set<Integer> hs = new HashSet<Integer>();
        for(int i = 0; i < arr1.length; i++)
            hs.add(arr1[i]);
        for(int i = 0; i < arr2.length; i++)
            hs.add(arr2[i]);
        System.out.println(hs);
        return hs.size();
    }
}
