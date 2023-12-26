package array.old;

public class MaxDiffbwElements {

    public static int maxDiff(int[] array){
        int max_diff = array[1] - array[0];
        for (int i = 0; i <array.length-1 ; i++) {
            for (int j = i; j <array.length; j++) {
                    max_diff = Math.max(max_diff,array[j]-array[i]);

            }
        }
        return max_diff;
    }
    public static int maxDiffrence(int[] arry){
        int max_diff = arry[1]-arry[0];
        int minVal = arry[0];
        for (int i = 1; i <arry.length-1 ; i++) {
            max_diff = Math.max(max_diff,arry[i]-minVal );
            minVal = Math.min(minVal,arry[i]);
        }
        return max_diff;
    }

    public static void main(String[] args) {
        int[] arry1 = {2,3,10,6,4,8,1};
        int[] arry2 = {2,3,10,6,4,8,1};
        System.out.println(maxDiff(arry1));
        System.out.println(maxDiff(arry2));
    }
}
