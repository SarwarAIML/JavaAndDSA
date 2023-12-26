package array;

import java.util.Arrays;

public class Insert {

    public static void main(String[] args) {

        int arr[] =  new int[10];

        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        arr[3] = 5;
        arr[4] = 6;
        arr[5] = 7;

        int pos = 4 ;
        int x = 4 ;
        int cap = 10;
        int n = 6;

     //   insert(arr,cap,pos,x,n);

        int arr1[] = {3, 8, 12, 5, 6}, x1 = 12;
        deleteItem(arr1,10);
        System.out.println(Arrays.toString(arr1));

    }
    private static void insert(int[] arr,int cap ,int pos, int x,int n) {

        System.out.println(Arrays.toString(arr));
        int ind = pos-1;
        for (int i = n-1; i >= ind  ; i--) {
                arr[i+1] = arr[i];
        }
        System.out.println(Arrays.toString(arr));
        arr[ind] = x;
        System.out.println(Arrays.toString(arr));
    }

    public int search(int[] arr,int x ){
        for (int i = 0; i <arr.length ; i++) {
            if (x==arr[i])
                return i;
        }
        return -1;
    }

    public  static int deleteItem(int[] array,int x){
        int i ;
        for ( i = 0; i < array.length ; i++) {
            if (x == array[i])
                break;
        }

        System.out.println("i::::::::::::"+i);
        //element is not present
        if (i == array.length)
            return array.length-1;



        for (int j = i; j < array.length-1; j++) {
            array[j] = array[j+1] ;

         }
        array[array.length-1] = 0;
        return -1;
    }


}
