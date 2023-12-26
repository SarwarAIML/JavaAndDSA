package test;

public class UserMainCode1 {
    public static class Result {
        public final int output1;
        public final int output2;

        public Result(int out1, int out2) {
            output1 = out1;
            output2 = out2;
        }
    }

    public static Result profitDevelopment(int input1, int input2, int input3, int[] input4) {
        int countries = input1 / input2;
        int monthIndex = (input3 - 1) % countries;

        int minRating = Integer.MAX_VALUE;
        int selectedCountry = 0;
        int selectedState = 0;

        // Iterate through the countries to find the one with the minimum rating
        for (int i = 0; i < countries; i++) {
            int startIdx = i * input2;

            int currentMinRating = Integer.MAX_VALUE;
            int currentState = 0;

            // Iterate through the states in the current country to find the minimum rating
            for (int j = startIdx; j < startIdx + input2; j++) {
                if (input4[j] < currentMinRating) {
                    currentMinRating = input4[j];
                    currentState = j % input2 + 1;
                }
            }

            // Update the overall minimum rating and selected country
            if (currentMinRating < minRating) {
                minRating = currentMinRating;
                selectedCountry = i + 1; // Country index starts from 1
                selectedState = currentState;
            }
        }

        return new Result(selectedCountry, selectedState);
    }


    public static void main(String[] args) {
        // Example usage:
        Result result1 = profitDevelopment(12,3,7,new int[]{4, 4, 7, 9, 3, 2,5,1,3,2,4,1});

        System.out.println("Output1: " + result1.output1); // Output: 2
        System.out.println("Output2: " + result1.output2); // Output: 4

       Result result2 = profitDevelopment(6, 3, 6, new int[]{2,1,9,3,1,4});
        System.out.println("Output1: " + result2.output1); // Output: 2
        System.out.println("Output2: " + result2.output2); // Output: 2
    }
}
