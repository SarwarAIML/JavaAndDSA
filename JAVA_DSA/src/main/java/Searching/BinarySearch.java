package Searching;

public class BinarySearch {

    public static int bSearch(int[] array,int x ){
        int low = 0 ;
        int high = array.length-1;
        while (low <= high){
            int mid = (low+high)/2;
            if (array[mid]==x){
                return mid;
            } else if (array[mid] > x) {
                high = mid-1;
            }else {
                low = mid+1;
            }
        }
        return -1;
    }

    static int bSearch(int arr[], int low, int high, int x)
    {
        if(low > high)
            return -1;

        int mid = (low + high) / 2;

        if(arr[mid] == x)
            return mid;

        else if(arr[mid] > x)
            return bSearch(arr, low, mid - 1, x);

        else
            return bSearch(arr, mid + 1, high, x);
    }

    public static void main(String[] args) {
            int arr[] = {10, 20, 30, 40, 50, 60}, n = 6;
            int x = 40;
            System.out.println(bSearch(arr, x));

        int arr1[] = {10, 20, 30, 40, 50, 60, 70}, n1 = 7;
        int x1 = 20;
        System.out.println(bSearch(arr1, 0, n1 - 1, x1));
        }
    }

