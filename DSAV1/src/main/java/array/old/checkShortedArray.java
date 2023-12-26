package array.old;

public class checkShortedArray {

    public static boolean isShorted(int[] array){
        for (int i = 1; i <array.length ; i++) {
            if (array[i]<array[i-1])
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        int[] array1 = {2,5,9,11,13};
        int[] array2 = {2,5,4,11,13};
        System.out.println(isShorted(array1));
        System.out.println(isShorted(array2));
    }
}
