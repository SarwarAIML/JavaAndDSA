package array.old;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class KeepTwoDuplicates {
    public static void main(String[] args) {
        int[] arr = {1, 1, 1, 2, 2, 2, 3, 4, 4, 4, 5, 5, 5}; // Example input array

        int[] result = keepTwoDuplicates(arr);

        int[] result1 = keepTwoDuplicates(arr);
        System.out.println("new Array is : "+Arrays.toString(result1));

        // Print the result
        System.out.print("Output array: ");
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }

    public static int[] keepTwoDuplicates(int[] arr) {
        HashMap<Integer, Integer> countMap = new HashMap<>();
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            int num = arr[i];
            int count = countMap.getOrDefault(num, 0);
            if (count < 2) {
                list.add(num);
                countMap.put(num, count + 1);
            }
        }
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
    public static int[] keepTwoDuplicateElement(int[] arr){
        int[] array = Arrays.stream(arr).boxed().collect(Collectors.groupingBy(Function.identity(),
                        LinkedHashMap::new, Collectors.counting())).entrySet()
                .stream().filter(entry -> entry.getValue() <= 2)
                .map(Map.Entry::getKey)
                .mapToInt(Integer::intValue).toArray();
        return array;
    }
}