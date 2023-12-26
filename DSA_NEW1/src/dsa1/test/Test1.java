package dsa1.test;

class UserMainCode {
    public static class Result {
        public final int output1;
        public final int output2;

        public Result(int out1, int out2) {
            output1 = out1;
            output2 = out2;
        }
    }

    public static Result profitDevelopment(int input1, int input2, int input3, int[] input4) {
        int countries = input1 / input2; // Calculate the number of countries
        int monthIndex = (input3 - 1) % countries; // Calculate the index of the country for the given month

        int startIdx = monthIndex * input2; // Calculate the starting index of the country in the rating list

        int minRating = Integer.MAX_VALUE;
        int selectedCountry = 0;
        int selectedState = 0;

        // Iterate through the states in the selected country to find the minimum rating
        for (int i = startIdx; i < startIdx + input2; i++) {
            if (input4[i] < minRating) {
                minRating = input4[i];
                selectedCountry = monthIndex ; // Country index starts from 1
                selectedState = i % input2 + 1; // State index starts from 1
            }
        }

        return new Result(selectedCountry, selectedState);
    }

    public static void main(String[] args) {
        // Example usage:
        Result result1 = profitDevelopment(12,3,7, new int[]{4, 4, 7, 9, 3, 2,5,1,3,2,4,1});
        System.out.println("Output1: " + result1.output1); // Output: 2
        System.out.println("Output2: " + result1.output2); // Output: 2

        Result result2 = profitDevelopment(12, 3, 7, new int[]{4, 5, 7, 9, 3, 2, 5, 1, 3, 2, 4, 1});
        System.out.println("Output1: " + result2.output1); // Output: 2
        System.out.println("Output2: " + result2.output2); // Output: 2
    }
}
