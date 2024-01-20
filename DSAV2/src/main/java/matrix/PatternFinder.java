package matrix;


/**
 *
 *   int[][] value = {
 *                 {0, 1, 1, 1, 0},
 *                 {0, 1, 1, 1, 0},
 *                 {0, 1, 1, 1, 0},
 *                 {0, 1, 1, 1, 0}
 *         };
 *
 *         int[][] value1 = {
 *                 {0, 0, 1, 0, 0},
 *                 {0, 1, 1, 1, 0},
 *                 {0, 0, 0, 0, 0},
 *                 {0, 0, 0, 0, 0}
 *         };
 *
 *         int[][] value2 = {
 *                 {0, 0, 1, 0, 0, 1, 1, 1, 1},
 *                 {0, 1, 1, 1, 0, 1, 1, 1},
 *                 {0, 0, 0, 0, 0, 1, 1},
 *                 {0, 0, 0, 0, 0, 1}
 *         };
 *
 *         int[][] value3 = {
 *                 {0, 0, 0, 0, 0, 1},
 *                 {0, 0, 0, 0, 0, 1, 1},
 *                 {0, 1, 1, 1, 0, 1, 1, 1},
 *                 {0, 1, 1, 1, 0, 1, 1, 1, 1}
 *         };
 *
 *
 *         int patterns = findPatterns(value3);
 *         System.out.println(patterns);
 *
 *
 * /*find out how many occurrences of this pattern
 *         1
 *       1 1 1
 *         1
 *
 *
 */

public class PatternFinder {

    public static void main(String[] args) {
        int[][] value3 = {
                {0, 0, 0, 0, 0, 1},
                {0, 0, 0, 0, 0, 1, 1},
                {0, 1, 1, 1, 0, 1, 1, 1},
                {0, 1, 1, 1, 0, 1, 1, 1, 1}
        };

        int patterns = findPatterns(value3);
        System.out.println(patterns);
    }

    private static int findPatterns(int[][] matrix) {
        int count = 0;
        for (int i = 1; i < matrix.length - 1; i++) {
            for (int j = 1; j < matrix[i].length - 1; j++) {
                if (isPattern(matrix, i, j)) {
                    count++;
                }
            }
        }
        return count;
    }

    private static boolean isPattern(int[][] matrix, int i, int j)
    {
        return matrix[i][j] == 1 && matrix[i - 1][j] == 1 && matrix[i + 1][j] == 1
                && matrix[i][j - 1] == 1 && matrix[i][j + 1] == 1;

    }
}