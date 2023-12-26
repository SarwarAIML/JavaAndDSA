package Matrix;

public class Multidimensional1 {
    public static void main(String[] args) {

        int array [] [] ={{1,2,3},{4,5,6}};
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j <array[i].length ; j++) {
                System.out.print(array[i][j]+" ");
            }
        }
        System.out.println();
        System.out.println("======================");
        int array1 [][]= {{1,2,3,8,9},{4,5,6}};
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array1[i].length; j++) {
                System.out.print(array1[i][j]+" ");
            }
        }
        System.out.println(" ");
        System.out.println("=======================");
        int n = 2;
        int m = 3 ;
        int array2[][] = new int[n][m] ;
        for(int i = 0; i < array2.length; i++)
        {
            for(int j = 0; j < array2[i].length; j++)
            {
                System.out.print(array2[i][j] + " ");
            }
        }
        System.out.println();
        System.out.println("=========================");
        int m1 = 2, n1 = 3;

        int arr3[][] = new int[m1][n1];

        for(int i = 0; i < arr3.length; i++)
        {
            for(int j = 0; j < arr3[i].length; j++)
            {
                arr3[i][j] = 10;

                System.out.print(arr3[i][j] + " ");
            }
        }

        System.out.println();
        System.out.println("===============================");

        int m2 = 3;

        int arr4[][] = new int[m2][];

        for(int i = 0; i < arr4.length; i++)
        {
            arr4[i] = new int[i + 1];
            for(int j = 0; j < arr4[i].length; j++)
            {
                arr4[i][j] = i;
                System.out.print(arr4[i][j] + " ");
            }
            System.out.println();
        }
    }


}
