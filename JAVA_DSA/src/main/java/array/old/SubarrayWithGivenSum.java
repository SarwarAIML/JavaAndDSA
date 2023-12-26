package array.old;

public class SubarrayWithGivenSum {

    public static boolean isSubArraySum(int array[],int size,int subArraySum){
        int start = 0;
        int current_sum = 0;
        for (int end = 0 ; end < size;end++){
            current_sum = current_sum + array[end];
            while (subArraySum < current_sum){
                current_sum = current_sum -array[start];
                start ++;
            }
            if (current_sum == subArraySum)
                return true;
        }
        return false;
    }

    public static void main(String[] args) {
        int array[] = {4,8,12,5};
        int subarraySum = 17;
        System.out.println(isSubArraySum(array,array.length,subarraySum));
    }
}
