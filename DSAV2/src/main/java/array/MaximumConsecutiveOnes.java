package array;

public class MaximumConsecutiveOnes {

    public static void main(String[] args) {

        int arr[] = {0, 1, 1, 1, 0, 1, 1};
        int maxConsecutiveOnesNaive = maxConsecutiveOnesNaive(arr);

        System.out.println("maxConsecutiveOnesNaive::::::::"+ maxConsecutiveOnesNaive);
        int maxConsecutiveOnes = maxConsecutiveOnes(arr);
        System.out.println("maxConsecutiveOnes::::::::"+ maxConsecutiveOnes);

    }

    private static int maxConsecutiveOnes(int[] arr) {
        int res = 0;
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1){
                count ++;
            }else {
                count = 0;
            }
            res = Math.max(count,res);
        }
        return res;
    }

    private static int maxConsecutiveOnesNaive(int[] arr) {
        int res = 0 ;
        for (int i = 0; i < arr.length ; i++) {
            int current = 0;
            for (int j = i; j < arr.length ; j++) {
                if (arr[j] == 1){
                    current++;
                }else {
                    break;
                }
            }
            res =  Math.max(current,res);
        }
      return res;  
    }
}
