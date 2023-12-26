package array.old;

public class TrappingRainWater {

    static int getWater(int array[]){
        int result = 0;
        int n = array.length;
        int[] lmax = new int[n];
        int[] rmax = new int[n];

        lmax[0] = array[0];
        for (int i = 1; i < n-1 ; i++)
            lmax[i]= Math.max(array[i],array[i-1] );

        rmax[n-1] = array[n-1];
        for (int i = n-2; i >=0 ; i--)
            rmax[i]=Math.max(array[i],array[i+1]);

        for (int i = 1; i <n-1 ; i++) {
            result = result+(Math.max(lmax[i],rmax[i])-array[i]);
        }
        return result;
    }
}
