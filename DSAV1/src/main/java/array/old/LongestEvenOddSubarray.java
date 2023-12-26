package array.old;

public class LongestEvenOddSubarray {

    /**
     *
     * @param array
     * @return
     * Efficient Method
     */
    static int maxEvenOdd(int array[]){
        int res = 1;
        int currentCount = 1;
        for (int i = 1; i < array.length ; i++) {
            if ((array[i]%2 == 0 &&  array[i-1]%2 != 0) || (array[i]%2 != 0 &&  array[i-1]%2 == 0)){
                currentCount++;
                res = Math.max(res,currentCount);
            }else {
                currentCount = 1;
            }
        }
        return res;
    }
    static int maxEvenOdd(int arr[], int n)
    {
        int res = 1;

        for(int i = 0; i < n; i++)
        {
            int curr = 1;

            for(int j = i + 1; j < n; j++)
            {
                if((arr[j] % 2 == 0 && arr[j - 1] % 2 != 0)
                        ||(arr[j] % 2 != 0 && arr[j - 1] % 2 == 0))
                    curr++;
                else
                    break;
            }

            res = Math.max(res, curr);
        }

        return res;
    }


    public static void main(String args[])
    {
        int arr1[] = {5, 10, 20, 6, 3, 8}, n = 6;

        System.out.println(maxEvenOdd(arr1));

        int arr[] = {5, 10, 20, 6, 3, 8}, n1 = 6;

        System.out.println(maxEvenOdd(arr, n1));
    }
}
