package array.old;

public class SubArrayWIthGivenSumWithsizeK {

    public static void main(String[] args) {
        int[] arr=  {9,4,5,7,5,8, 0 ,6, 0,1 ,5 ,1};
        int k = 4 ;
        int sumArraySum = 7;

        boolean givenEqual = isEqualtoGivenSumofWindowK(arr, 4, 7);
        if (givenEqual)
            System.out.println("yes");
        else
            System.out.println("no");
    }

    public static boolean isEqualtoGivenSumofWindowK(int[] arr,int k,int subArraySum){

        int start = 0;
        int current_sum = 0;

        for (int i = 0; i <k ; i++) {
            current_sum += arr[i];
        }
        if (current_sum == subArraySum)
            return true;
        for (int end = k; end <arr.length ; end++) {
            current_sum = current_sum + arr[end];
            while (subArraySum < current_sum){
                current_sum = current_sum - arr[start];
                start++;
            }
            if (current_sum == subArraySum)
                return true;
        }
        return false;
    }
}