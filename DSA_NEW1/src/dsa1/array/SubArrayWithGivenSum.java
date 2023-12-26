package dsa1.array;

public class SubArrayWithGivenSum {

    public static void main(String[] args) {

        int arr[] = {3,2,0,4,7};
        int sum = 6 ;
         boolean isSubArraySumNaive  = isSubArraySumNaive(arr,sum);
        System.out.println("isSubArraySumNaive::::::"+isSubArraySumNaive);

        boolean isSubArraySum  = isSubArraySum(arr,sum);
        System.out.println("isSubArraySum::::::"+isSubArraySum);


    }

    private static boolean isSubArraySum(int[] arr, int sum) {
        int start = 0 ;
        int end = 0;
        int currnetSum = 0;
        for ( end = 0; end <arr.length ; end++) {
            currnetSum = currnetSum + arr[end];
            while (sum < currnetSum){
                currnetSum -= arr[start];
                start ++;
            }
            if (currnetSum == sum)
                return true;
        }
        return false;
    }

    private static boolean isSubArraySumNaive(int[] arr, int sum) {
        boolean isSubArraySum = false ;

        for (int i = 0; i < arr.length; i++) {
            int currentSum= 0;
            for (int j = i; j < arr.length ; j++) {
                currentSum = currentSum + arr[j];
                if (currentSum == sum)
                   return true;
            }
        }
        return isSubArraySum;
    }
}
