package Hashing;

import java.util.HashMap;
import java.util.LinkedHashMap;

public interface LongestSubarrayWithEqualNumberOf0sand1s {

    public static int LongestSubArrayWithEqZeroAndOne(int[] array,int len){
        int sum = 0 ;
        int maxLan = 0 ;
        HashMap<Integer,Integer> map = new LinkedHashMap<Integer,Integer>();
        for (int i = 0; i <len ; i++) {
            array[i] = (array[i] == 0 ) ? -1 : 1;
        }
        for (int i = 0; i <len ; i++) {
            sum += array[i];
            if (sum == 0)
                maxLan = i+1;
            if (map.containsKey(sum)){
                maxLan = Math.max(maxLan,i-map.get(sum));
            //    printArray(array,)
            }else {
                map.put(sum,i);
            }
        }
        return maxLan;
    }


    public static void main (String[] args) {
        int arr[] = new int[]{1, 0, 1, 1, 1, 0,0};
        int len = arr.length;
        System.out.println(LongestSubArrayWithEqZeroAndOne(arr, len));
    }
}
