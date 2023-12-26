package Test;

import java.util.Arrays;

public class Test {

    public static void main(String[] args) {
        int arr[] = { 1,4,4,1,0,1 };
        int[] count=new int[5];


        for(int i=0;i<5;i++)
            count[i]=0;
        System.out.println(Arrays.toString(count));
        for(int i=0;i< arr.length;i++){
            System.out.println("count array is ::"+ Arrays.toString(count));
            System.out.println("Array of arr[ "+i+" ]:::"+arr[i]);
            count[arr[i]] =  count[arr[i]]+1;
            System.out.println("count array is ::"+ Arrays.toString(count));
        }
    }
}
