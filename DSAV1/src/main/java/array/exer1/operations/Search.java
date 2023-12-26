package array.exer1.operations;



public class Search {

    public static void main(String[] args) {
        int array[] = {10,20,8,15,5,18,25};
        int x = 5;
        System.out.println(search(array,x));
    }

    private static int search(int[] array, int x) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == x)
                return i;
        }
        return -1;
    }
}
