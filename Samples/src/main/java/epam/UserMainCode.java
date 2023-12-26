package epam;

import java.io.*;
import java.util.*;

class UserMainCode {
    public int GetBuildingCount(int input1, int[][] input2) {
        int totalBuildings = 0;

        // Arrays to store the count of buildings in each row and column
        int[] rowCount = new int[8];
        int[] colCount = new int[8];

        // Populate the counts based on the soldier positions
        for (int i = 0; i < input1; i++) {
            int x = input2[i][0];
            int y = input2[i][1];

            rowCount[x - 1]++;
            colCount[y - 1]++;
        }

        // Calculate the total number of buildings controlled by the soldiers
        for (int i = 0; i < 8; i++) {
            totalBuildings += rowCount[i] + colCount[i];
        }

        // Subtract the common buildings (double-counted)
        for (int i = 0; i < input1; i++) {
            int x = input2[i][0];
            int y = input2[i][1];
            totalBuildings -= 1; // Subtract one for each soldier's position (common building)
        }

        return totalBuildings;
    }

    public static void main(String[] args) {
        UserMainCode userMainCode = new UserMainCode();

        // Example 1
        int[][] input1 = {{5, 5}, {5, 3}};
        int output1 = userMainCode.GetBuildingCount(2, input1);
        System.out.println("Example 1: " + (output1 == 22 ? "Passed" : "Failed"));

        // Example 2
        int[][] input2 = {{4, 4}};
        int output2 = userMainCode.GetBuildingCount(1, input2);
        System.out.println("Example 2: " + (output2 == 15 ? "Passed" : "Failed"));
    }
}
