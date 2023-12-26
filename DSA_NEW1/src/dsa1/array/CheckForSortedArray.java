package dsa1.array;

public class CheckForSortedArray {

    public static void main(String[] args) {
        
        int [] arr = {2,5,8,11,23};
        boolean isSortedArrayNaive = isSortedArrayNaive(arr);
        boolean isSortedArray = isSortedArray(arr);

        if (isSortedArrayNaive &&  isSortedArray )
            System.out.println("dsa1.array is sorted");
        else
            System.out.println("dsa1.array is not sorted");


    }

    private static boolean isSortedArray(int[] arr) {

        for (int i = 1; i < arr.length ; i++) {
            if (arr[i] < arr[i-1])
                return false ;
        }
        return true;
    }

    private static boolean isSortedArrayNaive(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length ; j++) {
                if (arr[j] < arr[i]) {
                    return false;
                }
            }
        }
        return true;
    }
}
