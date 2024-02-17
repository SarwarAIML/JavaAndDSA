package array;

import java.util.ArrayList;
import java.util.List;

public class Target {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(8);
        list.add(8);
        list.add(8);
        int target = 8;
        List<Integer> result = getTarget(list, target);
        System.out.println(result);
    }

    public static List<Integer> getTarget(List<Integer> integers, int target) {
        List<Integer> indices = new ArrayList<>();
        int left = binarySearch(integers, target, true);
        int right = binarySearch(integers, target, false);
        for (int i = left; i <= right; i++) {
            indices.add(i);
        }
        return indices;
    }

    public static int binarySearch(List<Integer> arr, int target, boolean isFirst) {
        int left = 0;
        int right = arr.size() - 1;
        int result = -1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr.get(mid) == target) {
                result = mid;
                if (isFirst)
                    right = mid - 1;
                else
                    left = mid + 1;
            } else if (arr.get(mid) < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return result;
    }

}