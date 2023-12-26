package array;

public class SecondLargest {

    public static void main(String[] args) {
        int[] arr = {10,5,15,18,-1,17};
        int x = secondLargestElement(arr);
        System.out.println("Largest element in the dsa1.array is :::"+arr[x]);
    }

    private static int secondLargestElement(int[] arr) {
        int largest = 0;
        int secondLargest = -1;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > arr[largest]){
                secondLargest = largest;
                largest = i;
            } else if (arr[i] != arr[largest] ) {

                if (secondLargest == -1 || arr[i] > arr[secondLargest])
                    secondLargest = i;
            }
        }
        return secondLargest;
    }
}
