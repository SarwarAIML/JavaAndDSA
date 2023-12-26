package Matrix;

/**
 * naive solutions
 * converting rows of a matrix into a column is called transpose of a matrix
 */
public class TransposeMatrix {

    public static void transposeNaive(int array[][]){

        int temp[][]  = new int [array.length][array.length];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                temp[j][i] = array[i][j];
            }
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                array[i][j] = temp[i][j];
            }
        }
    }

    /**
     *
     * swap the elements across diagonals then we will get the transpose of matrix
     * @param array
     */
    public static void transpose(int array[][]){

        for (int i = 0; i < array.length ; i++) {
            for (int j = i+1; j < array.length ; j++) {
                swap(array,i,j);
            }
        }
    }

    private static void swap(int[][] array, int i, int j) {

        int temp = array[i][j];
        array[i][j] = array[j][i];
        array[j][i] = temp;
    }


    public static void main(String[] args) {
        int arr[][] = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}};

   //     transposeNaive(arr);
        transpose(arr);
        for (int i = 0; i < arr.length ; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

    }
}
