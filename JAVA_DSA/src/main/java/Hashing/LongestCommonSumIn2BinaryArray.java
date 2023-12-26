package Hashing;

import java.util.LinkedHashMap;
import java.util.Map;

public class LongestCommonSumIn2BinaryArray {

    public static void main(String[] args) {
        int[] arr1 = {0, 1, 0, 1, 1, 1, 1};
        int[] arr2 = {1, 1, 1, 1, 1, 0, 1};
        int n = arr1.length;
        System.out.println(longestCommonSum(arr1, arr2));
    }

    private static int longestCommonSum(int[] arr1, int[] arr2) {
        int prefixSum = 0;
        int[] array = new int[arr1.length];
        int maxResult = 0;
        Map<Integer,Integer> map = new LinkedHashMap<Integer,Integer>();
        for (int i = 0; i <arr1.length ; i++) {
            array[i] = arr1[i]-arr2[i];
        }
        for (int i = 0; i < array.length ; i++) {
            prefixSum += array[i];
            if (prefixSum == 0)
                maxResult = i+1;

            if(map.containsKey(prefixSum)){
                maxResult = Math.max(maxResult,i-map.get(prefixSum));
            }else {
                map.put(prefixSum,i);
            }

        }
        return maxResult;
    }
}
