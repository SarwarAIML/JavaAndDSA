package Hashing;

import java.util.LinkedHashMap;
import java.util.Map;

public class FrequenciesOfArrayAlements {

    public static void freqCount(int[] array){

        Map<Integer,Integer> map = new LinkedHashMap<Integer,Integer>();
        for (Integer x : array){
            map.put(x, map.getOrDefault(x,0)+1);
        }
        System.out.println(map);
        for (Map.Entry e : map.entrySet())
            System.out.println(e.getKey()+"->"+ e.getValue());
    }

    public static void main(String[] args) {
        int arr[] = new int[]{15, 16, 27, 27, 28, 15};
        freqCount(arr);
    }
}
