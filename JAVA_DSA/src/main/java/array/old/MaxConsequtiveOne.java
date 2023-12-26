package array.old;

public class MaxConsequtiveOne {

    public static void main(String[] args) {
        int arr[] = {0, 1, 1, 0, 1, 1, 1}, n = 7;

        System.out.println(maxConsecutiveOnes(arr));
    }

    public static int maxConsecutiveOnes(int[] arr) {
        int result = 0;
        int currentCount = 0;
        for (int i = 0; i < arr.length ; i++) {
            if (arr[i] == 0){
                currentCount = 0;
            }else {
                currentCount++;
                result = Math.max(result,currentCount);
            }
        }
        return result;
    }
}
