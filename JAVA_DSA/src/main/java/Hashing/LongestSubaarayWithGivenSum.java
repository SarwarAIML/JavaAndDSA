package Hashing;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class LongestSubaarayWithGivenSum {

    public static int maxLen(int[] array,int sum) {
        int presum = 0;
        int result = 0;
        HashMap<Integer,Integer> map = new LinkedHashMap<Integer,Integer>();
        for (int i = 0; i < array.length ; i++) {
            presum += array[i];
            if (presum == sum)
                result = i+1;
            if (!map.containsKey(presum)){
                map.put(presum,i);
             if (map.containsKey(presum-sum)){
                result = Math.max(result,i-map.get(presum-sum));
             }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int arra[] = {8,3,1,5,-6,6,2,2};
        int sum = 4 ;
        System.out.println(maxLen(arra,sum));
    }
}
