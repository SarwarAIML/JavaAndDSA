package array.Articles;

import java.util.Arrays;

public class ArrayOperations {

    public static int insert(int[] arr,int position,int capacity,int n,int x){
            if (position == arr.length-1)
                return arr.length-1;
            int index = position-1;
        for (int i = n-1; i >= index ; i--) {
                arr[i+1] = arr[i];
        }
        arr[index] = x;
        return n+1;
    }

    public static int delete(int array[],int x){

        int i;
        for ( i = 0; i < array.length ; i++) {
            if (array[i] == x)
                break;
        }
        for (int j = i; j < array.length-1 ; j++) {
           array[j] = array[j+1];
        }
        return array.length;
    }

    public static void main(String[] args) {
        int[] array = new int[5];
        array[0] = 2;
        array[1] = 1;
        array[2] = 5;
        System.out.println("before insert");
        System.out.println(Arrays.toString(array));
        insert(array,2,5,3,7);
        System.out.println("After Insert");
        System.out.println(Arrays.toString(array));

        System.out.println("deletion operation in the array");
        delete(array,1);
        System.out.println(Arrays.toString(array));

    }
}
