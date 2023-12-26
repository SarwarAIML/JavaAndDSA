package Matrix;

public class DiagonalDiffOfMatrix {

    public static int diagonalDiff(int[][] mat,int size) {
        int d1 = 0 ;
        int d2 = 0 ;
        for (int i = 0; i <size ; i++) {
            d1 += mat[i][i];
            d2 = mat[i][size-1-i];

        }
        return Math.abs(d2-d1);
    }

    public static void main(String[] args) {
        int array[][] = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,15}};
        int diff = DiagonalDiffOfMatrix.diagonalDiff(array,4);
        System.out.println("diagonal diff of the matrix is : "+diff);

    }
}
