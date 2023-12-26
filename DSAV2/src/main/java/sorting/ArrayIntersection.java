package sorting;

import java.util.Arrays;

public class ArrayIntersection {
    public static void main(String[] args) {

        int ar1[] = { 1, 5, 10, 20,20,20, 40, 80 };
        int ar2[] = { 5, 6, 7, 20, 30, 40, 50, 80 };
        int ar3[] = { 3, 4, 15, 20, 30, 40, 50, 60, 77, 80 };
        int ar4[] = { 3, 4, 15, 20, 30, 40, 50, 60, 77,78,79, 80 };
        int ar5[] = { 3, 4, 15, 20, 30, 40, 50, 60,64,65,69, 77,78,79, 80 };

        // Find the intersection
        int[] intersection = findIntersection(ar1, ar2, ar3, ar4, ar5);

        // Print the result
        System.out.println("Intersection: " + Arrays.toString(intersection));
    }

    public static int[] findIntersection(int[]... arrays) {
        if (arrays == null || arrays.length == 0) {
            return new int[0]; // No arrays, empty intersection
        }

        // Sort all arrays
        for (int[] array : arrays) {
            Arrays.sort(array);
        }

        // Find intersection iteratively
        int[] result = arrays[0];

        for (int i = 1; i < arrays.length; i++) {
            result = intersect(result, arrays[i]);
        }

        return result;
    }

    private static int[] intersect(int[] array1, int[] array2) {
        int i = 0, j = 0, k = 0;
        int[] result = new int[Math.min(array1.length, array2.length)];

        // Iterate through both arrays to find common elements
        while (i < array1.length && j < array2.length) {
            if (i > 0 && array1[i] == array1[i-1]) {
                i++;
                continue;
            }
            if (array1[i] < array2[j]) {
                i++;
            } else if (array1[i] > array2[j]) {
                j++;
            } else {
                // Found a common element
                result[k++] = array1[i];
                i++;
                j++;
            }
        }

        // Resize the result array to the actual number of common elements
        return Arrays.copyOf(result, k);
    }
}

