package array.exer1.operations;

import java.util.Arrays;

public class Insert {

    public static void main(String[] args) {

        int[] array = new int[5];
        array[0] = 5;
        array[1] = 10;
        array[2] = 20;
        int cap = 5;
        int n = 3;
        int x = 7;
        int pos = 2;
        System.out.println( Arrays.toString(array));
        n = insert(array,n,x,pos,cap);
        System.out.println( Arrays.toString(array) );
        System.out.println("new size is "+ n);
    }

    private static int insert(int[] array, int n, int x, int pos, int cap) {
        if(n == cap)
            return n;
        int index = pos-1;
        for (int i = n-1; i >= index ; i--) {
            array[i+1] = array[i];
        }
        array[index] = x;
        return n+1;
    }
}
