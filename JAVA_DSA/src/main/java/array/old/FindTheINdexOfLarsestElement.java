package array.old;

public class FindTheINdexOfLarsestElement {

    static int  getLargestIndex(int arr[]){
        int largetIndex = 0;

        for (int i = 1; i <arr.length ; i++) {
            if (arr[i]>arr[largetIndex]){
                largetIndex = i;
            }
        }
        return largetIndex;
    }
    public static void main(String[] args) {
        int[] array ={20,6,8,38,9,6};
        int indext = getLargestIndex(array);
        System.out.println(array[indext]);
    }
}
