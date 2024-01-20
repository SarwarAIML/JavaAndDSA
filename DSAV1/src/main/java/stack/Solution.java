package stack;

import java.util.Stack;

/**
 * Given a string s representing a valid expression,
 * implement a basic calculator to evaluate it, and return the result of the evaluation.
 *
 * Note: You are not allowed to use any built-in
 * function which evaluates strings as mathematical expressions, such as eval().
 *
 *
 *
 * Example 1:
 *
 * Input: s = "1 + 1"
 * Output: 2
 * Example 2:
 *
 * Input: s = " 2-1 + 2 "
 * Output: 3
 * Example 3:
 *
 * Input: s = "(1+(4+5+2)-3)+(6+8)"
 * Output: 23
 *
 *
 *
 *
 */
class Solution {
    public int calculate(String s) {
        Stack<Integer> stack = new Stack<>();
        int result = 0;
        int sign = 1; // 1 for positive, -1 for negative

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (Character.isDigit(c)) {
                int num = 0;
                while (i < s.length() && Character.isDigit(s.charAt(i))) {
                    num = num * 10 + (s.charAt(i) - '0');
                    i++;
                }
                i--; // Move back one step to account for the extra increment in the loop
                result += sign * num;
            } else if (c == '+') {
                sign = 1;
            } else if (c == '-') {
                sign = -1;
            } else if (c == '(') {
                stack.push(result);
                stack.push(sign);
                result = 0;
                sign = 1;
            } else if (c == ')') {
                result *= stack.pop(); // pop sign
                result += stack.pop(); // pop previous result
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        String s1 = "1 + 1";
        System.out.println(solution.calculate(s1)); // Output: 2

        String s2 = " 2-1 + 2 ";
        System.out.println(solution.calculate(s2)); // Output: 3

        String s3 = "(1+(4+5+2)-3)+(6+8)";
        System.out.println(solution.calculate(s3)); // Output: 23
    }
}