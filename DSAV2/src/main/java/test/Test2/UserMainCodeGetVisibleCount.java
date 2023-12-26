package test.Test2;
import java.util.ArrayList;
import java.util.List;
public class UserMainCodeGetVisibleCount {

    public int GetVisibleCount(int input1, int input2, int[][] input3) {
        int[] clothesline = new int[input1 + 1]; // Array to represent the height of clothes at each section of the clothesline
        int visibleCount = 0;

        for (int i = 0; i < input2; i++) {
            int start = input3[i][0];
            int end = input3[i][1];

            // Iterate through the clothesline sections covered by the current cloth
            for (int j = start; j <= end; j++) {
                // If the current cloth is taller than the existing cloth at the section, update the height
                if (clothesline[j] < input3[i][2]) {
                    clothesline[j] = input3[i][2];
                    visibleCount++; // Increment visible count when a new cloth is added
                }
            }
        }

        return visibleCount;
    }

    public static void main(String[] args) {
        UserMainCodeGetVisibleCount solution = new UserMainCodeGetVisibleCount();
        int input1 = 10;
        int input2 = 4;
        int[][] input3 = {{1, 3, 5}, {2, 6, 3}, {4, 8, 2}, {7, 10, 4}};
        System.out.println(solution.GetVisibleCount(input1, input2, input3)); // Output: 10
    }
}
