package array.qustions;

public class SecondLargest {

    /**
     * this is efficient approach to solve this problem
     * time : O(n)
     * @param array
     * @return
     */
    public static int  getSecondLargest(int[] array){
        int largest = 0;
        int secondLargest = -1;
        for (int i = 1; i < array.length ; i++) {
            if (array[i] > array[largest]){
                secondLargest = largest;
                largest = i;
            } else if (array[i] != array[largest]) {
                if (secondLargest == -1 || array[i] > array[secondLargest]){
                    secondLargest = i;
                }
            }
        }
        return secondLargest;
    }
    /**
     * naive approach
     * @param array
     * @return
     */
    public static int secondLargest(int array[]){
        //largest index
        int largestIndex = getLargestIndex(array);
        int secondLargest = -1;
        for (int i = 0; i <array.length ; i++) {
            if (array[i] != array[largestIndex]){
                if (secondLargest == -1){
                    secondLargest = i;
                }else if (array[i] > array[secondLargest]){
                    secondLargest = i;
                }
            }
        }
        return secondLargest;
    }

    private static int getLargestIndex(int[] array) {
        int largest = 0 ;
        for (int i = 1; i < array.length; i++) {
            if (array[i] > array[largest])
                largest = i;
        }
        return largest;
    }

    public static void main(String[] args) {
            int[] array = {10,5,8,20};
        System.out.println("Naive solution :: "+secondLargest(array));
        System.out.println("Efficient solution :: "+getSecondLargest(array));

    }
}
