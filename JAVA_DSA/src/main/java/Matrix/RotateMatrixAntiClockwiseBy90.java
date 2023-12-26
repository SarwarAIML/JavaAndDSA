package Matrix;

//+++++++++naive solutions +++++++++++++++++++
//idea is last column become first row
//second last column become second row

//+++++++++naive solutions +++++++++++++++++++

public class RotateMatrixAntiClockwiseBy90 {

    /**
     * this is nave solutions
     * @param arr
     */

    public static void rotate90(int arr[][]){
        int tem[][] = new int[arr.length][arr.length];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length ; j++) {
                tem [arr.length-j-1][i] = arr[i][j];
            }
        }
    }
}
