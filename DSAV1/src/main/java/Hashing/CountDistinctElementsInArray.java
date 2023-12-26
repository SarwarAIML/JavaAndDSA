package Hashing;

import java.util.HashSet;
import java.util.Set;

public class CountDistinctElementsInArray {

    public static void main (String[] args) {
        int arr[] = new int[]{15, 16, 27, 27, 28, 15};
        int n = arr.length;

        System.out.println(countDistinct(arr));
    }

    static int countDistinct(int arr[])
    {
        Set<Integer> hs = new HashSet<Integer>();
        for(int i = 0; i < arr.length; i++)
            hs.add(arr[i]);
        return hs.size();
    }
}
