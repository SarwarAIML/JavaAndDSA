package array.qustions;

public class CheckForSortedArray {

    public static boolean isArraySorted(int[] array){

        for (int i = 1; i < array.length ; i++) {
            if (array[i] < array[i-1])
                return false;
        }
        return true;
    }

    public static boolean isArraySortedNaive(int array[]){

        for (int i = 0; i < array.length ; i++) {
            for (int j = i+1; j < array.length ; j++) {
                if(array[j] < array[i])
                    return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] array = {2,5,8,12,18};
        System.out.println(isArraySortedNaive(array));
        System.out.println(isArraySorted(array));
    }
}
