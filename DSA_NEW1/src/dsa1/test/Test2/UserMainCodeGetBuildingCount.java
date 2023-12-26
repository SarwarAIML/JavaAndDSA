package dsa1.test.Test2;
import java.util.HashSet;
import java.util.Set;

public class UserMainCodeGetBuildingCount {


    public static int GetBuildingCount(int input1, int[][] input2) {
        // Use a Set to efficiently track controlled buildings
        Set<String> controlledBuildings = new HashSet<>();

        // Iterate through each soldier's position
        for (int i = 0; i < input1; i++) {
            int x = input2[i][0] - 1; // Adjust for 0-based indexing
            int y = input2[i][1] - 1;

            // Mark the current building as controlled
            controlledBuildings.add(x + "," + y);

            // Mark all buildings in the same row
            for (int j = 0; j < 8; j++) {
                controlledBuildings.add(x + "," + j);
            }

            // Mark all buildings in the same column
            for (int j = 0; j < 8; j++) {
                controlledBuildings.add(j + "," + y);
            }
        }

        // Return the total number of controlled buildings
        return controlledBuildings.size();
    }

    public static void main(String[] args) {

        int input1 = 2;
        int[][]  input2 = {{5,5},{5,3}};

        int output = GetBuildingCount(input1,input2);
        System.out.println(output);
    }
}
