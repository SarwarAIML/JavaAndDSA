package Matrix;

public class MatrixBoundaryTraversal {



    public static void printBoundary(int[][] array){
          int R = 4;
          int C = 4;
          if (R == 1){
              for (int i = 0; i < C ; i++) {
                  System.out.print(array[0][i] +" ");
              }
          }else if (C==1){
              for (int i = 0; i < R; i++) {
                  System.out.print(array[i][0] +" ");
              }
          }else {
              for (int i = 0; i < C; i++) {
                  System.out.print(array[0][i]+" ");
              }

              for (int i = 1; i < R; i++) {
                  System.out.print(array[i][C-1]+" ");
              }
              for (int i =C-2 ; i >= 0 ; i--) {
                  System.out.print(array[R-1][i]+" ");
              }
              for (int i = R-2; i >=1 ; i--) {
                  System.out.print(array[i][0]+" ");
              }

          }
    }

    public static void main(String[] args) {
        int arr[][] = {{1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}};

        printBoundary(arr);
    }
}
