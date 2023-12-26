package array;

public class LargestElementInArray {

    public static void main(String[] args) {
        int[] arr = {10,5,15,18,-1,17};
        int x = largestElement(arr);
        System.out.println("Largest element in the dsa1.array is :::"+arr[x]);
    }

    private static int largestElement(int[] arr) {

        int largestIndex = 0;
        for (int i = 1; i < arr.length ; i++) {
            if (arr[i] > arr[largestIndex])
                largestIndex = i;
        }
        return largestIndex;
    }
}
