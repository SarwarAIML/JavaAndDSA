package Hashing;

import java.util.HashSet;

public class SubarraywithZeroSum {

    public boolean isZeroSumSubArray(int[] array){
        int pre_sum = 0;
        HashSet set = new HashSet();
        for (int i = 0; i < array.length ; i++) {
            pre_sum += array[i];
            if (set.contains(pre_sum) ){
                return true;
            }
            if (pre_sum == 0 )
                return true;
            set.add(pre_sum);
        }
        return false;
    }
}
