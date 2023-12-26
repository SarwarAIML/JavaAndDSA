package array.qustions;

public class LargestElementInArray {

    /**
     * this is the efficient approach
     * time : O(n)
     * @param array
     * @return
     */
    public static int getLargestElementIndex(int[] array){
        int largestIndex = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i]>array[largestIndex]){
                largestIndex = i;
            }
        }
        return largestIndex;
    }

    public static void main(String[] args) {

        int[] array = {10,12,18,29,37,19,25};
        int index = getLargestElement(array);
        System.out.println("largest index by Naive method is ::"+index);
        System.out.println("largest index by efficient approach is ::"+getLargestElementIndex(array));
    }
    /**
     *
     * @param array
     * @return
     * this is the naive solution
     * time : O(n^2)
     */

    public static int getLargestElement(int[] array)
    {
        for (int i = 0; i < array.length; i++) {
            boolean greaterFlag = true;
            for (int j = 0; j < array.length; j++) {
                if (array[j] > array[i]){
                    greaterFlag = false;
                    break;
                }
            }
            if (greaterFlag == true)
                return i;
        }
        return -1;
    }


}
