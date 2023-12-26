package array.old;

public class SecondLargestElemement {

    static int secondLargest(int[] array){
       int secondLargest = -1;
       int largest = 0;
        for (int i = 1; i <array.length ; i++) {
            if (array[i] > array[largest]){
                secondLargest = largest ;
                largest = i;
            }else if (array[i] != array[largest]){
                if (secondLargest == -1 || array[i] > array[secondLargest] ){
                    secondLargest = i ;
                }
            }
        }
       return secondLargest;
    }
    public static int secondLargestElement(int[] array){

        int secondLargest = -1;
        int largest = 0;
        for (int i = 1; i <array.length ; i++) {

            if (array[i]>array[largest]){
                secondLargest = largest;
                largest = i;
            } else if (array[i] != array[largest]) {
                if (secondLargest == -1 || array[i] > array[secondLargest])
                    secondLargest = i;
            }
        }

    return secondLargest;
    }

    public static void main(String[] args) {
        int[] array = {5,20,12,20,8};
        System.out.println(secondLargestElement(array));
    }
}
