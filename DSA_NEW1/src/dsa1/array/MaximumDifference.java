package dsa1.array;

public class MaximumDifference {

    public static void main(String[] args) {

        int arr[] = {2,3,10,6,4,8,1};
        int maxDiffNaive = maxDiffNaive(arr);
        System.out.println("maxDiffNaive:: "+maxDiffNaive);
        int maxDiff = maxDiff(arr);
        System.out.println("maxDiff:: "+maxDiff);

    }

    private static int maxDiff(int[] arr) {

        int maxDiff =  arr[1]-arr[0];
        int minValue = arr[0];
        for (int i = 1; i < arr.length; i++) {
            maxDiff = Math.max(maxDiff,arr[i]-minValue);
            minValue = Math.min(minValue,arr[i]);
        }
        return maxDiff;
    }

    private static int maxDiffNaive(int[] arr) {
        int res = arr[1]-arr[0];
        for (int i = 0; i < arr.length; i++) {

            for (int j =i+1; j < arr.length; j++) {
                res = Math.max(res,arr[j]-arr[i]);
            }
        }
        return res;
    }
}
