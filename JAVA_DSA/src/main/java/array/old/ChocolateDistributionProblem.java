package array.old;

import java.util.Arrays;

public class ChocolateDistributionProblem {

    public static int findMinDiff(int arr[], int size, int man)
    {
        if (man == 0 || size == 0)
            return 0;
        Arrays.sort(arr);
        if (size < man)
            return -1;
        int min_diff = Integer.MAX_VALUE;
        for (int i = 0; i + man - 1 < size; i++) {
            int diff = arr[i + man - 1] - arr[i];
            min_diff = Math.min(min_diff,diff);
        }
        return min_diff;
    }

    public static void main(String[] args) {
        int array[] = {5,10,15,20,1,18,21,2};
        Arrays.sort(array);
        System.out.println( Arrays.toString(array));
        int man = 2; // Number of man
        int size = array.length;
        System.out.println("Minimum difference is " + findMinDiff(array, size, man));
    }
    //each will get one packet
    //difference between 1st and difference second by 2nd engineer should be lowest
}
