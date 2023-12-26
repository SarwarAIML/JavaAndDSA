package Matrix;


/**
 * topRow(row) => row  is used to print top row
 * rightCol(column) = right is the pointer to print column from right column downward
 * bottomRow(row reverse )  = is the pointer to print bottom row in reverse direction
 * leftCol (reverse ) = it is the pointer to print left column from reverse
 */
public class SpiralTraversalOfMatrix {

    public static void printSpiral(int mat[][],int R,int C){
        int topRow = 0;
        int bottomRow = R-1;
        int rightCol = C-1;
        int leftCol = 0;

        while (topRow <= bottomRow && leftCol <= rightCol) {

            for (int i = leftCol; i <=rightCol ; i++) {
                System.out.print(mat[topRow][i]+" ");
            }
            topRow ++;
            for (int i = topRow; i <=bottomRow ; i++) {
                System.out.print(mat[i][rightCol]+" ");
            }
            rightCol--;
            if (topRow<=bottomRow){
                for (int i = rightCol; i >= leftCol; i--) {
                    System.out.print(mat[bottomRow][i]+" ");
                }
                bottomRow--;
            }
            if (leftCol <=rightCol){
                for (int i = bottomRow; i>=topRow ; i--) {
                    System.out.print(mat[i][leftCol]+" ");
                }
                leftCol++;
            }
        }

    }

    public static void main(String[] args) {
        int arr[][] = {{1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}};

        printSpiral(arr, 4, 4);
    }

}
