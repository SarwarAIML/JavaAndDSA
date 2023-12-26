package array.old;



public class MoveZerosToEnd {

    static void moveZeros(int[] array){
        
        int countNonZeroElement = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] != 0){
                swap(array,array[i],array[countNonZeroElement]);
                countNonZeroElement++;
            }
        }
    }
    private static int[] swap(int[] array,int i, int j) {
        int temp= array[i];
        array[i] = array[j];
        array[j] = temp;
        return array;
    }
}
