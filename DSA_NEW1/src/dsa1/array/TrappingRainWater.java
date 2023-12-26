package dsa1.array;

public class TrappingRainWater {

    public static void main(String[] args) {
        int arr[] = {2,0,2} ;
        int arr1[] = {3, 0, 1, 2, 5};
        int waterNaive = getWaterNaive(arr1);
        System.out.println("waterNaive:::"+waterNaive);
        int water = getWater(arr);
        System.out.println("water:::"+water);
    }

    private static int getWater(int[] arr)
    {
        int res = 0;
            int lmax[] = new int[arr.length];
            int rmax[] = new int[arr.length];

            lmax[0] = arr[0];
        for (int i = 1; i < arr.length; i++) {
            lmax[i] = Math.max(lmax[i], lmax[i - 1]);
        }

          rmax[arr.length-1] = arr[arr.length-1];

            for (int j = arr.length-2; j >=0 ; j--) {
                rmax[j] = Math.max(rmax[j],rmax[j+1]);
            }
            for (int i = 1; i < arr.length-1 ; i++) {
                res = res+ (Math.min(lmax[i],rmax[i])-arr[i]);
            }
            return res;
        }

    private static int getWaterNaive(int[] arr) {
        int res = 0 ;
        for (int i = 1; i < arr.length-1 ; i++) {
            int lmax = arr[i];
            for (int j = 0; j < i; j++) {
                lmax = Math.max(lmax,arr[j]);
            }
            int rmax = arr[i];
            for (int j = 0; j < arr.length ; j++) {
                rmax = Math.max(rmax,arr[j]);
            }
            res = res + (Math.min(rmax,lmax) -arr[i]);
        }
        return res;
    }
}
