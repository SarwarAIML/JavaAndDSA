package org.example.test1;
public class AddLargeNumbers {

    public static String add1(String a, String b) {
        StringBuilder result = new StringBuilder();

        int carry = 0;
        int i = a.length() - 1;
        int j = b.length() - 1;

        while (i >= 0 || j >= 0) {
            System.out.println("carry1111"+carry);
            int sum = carry;
            System.out.println("sum11"+sum);
            System.out.println("carry111"+carry);

            if (i >= 0) {
                System.out.println("sum11"+sum);
                sum += a.charAt(i--) - '0';
            }
            if (j >= 0) {
                sum += b.charAt(j--) - '0';
            }

            result.insert(0, sum % 10);
            carry = sum / 10;
        }

        if (carry > 0) {
            result.insert(0, carry);
        }

        return result.toString();
    }

    public static void assertAdd(String a, String b, String expected) {
        String result = add1(a, b);
        System.out.println("Adding " + a + " and " + b + ": " + result);
        System.out.println("Expected: " + expected);
        System.out.println("Result matches expected: " + result.equals(expected));
        System.out.println();
    }

    public static void main(String[] args) {
        // Test cases
        assertAdd("123456789012345678901234567890", "987654321098765432109876543210", "1111111110111111111011111111000");
        assertAdd("999999999999999999999999999999", "1", "1000000000000000000000000000000");
        assertAdd("111111111111111111111111111111", "222222222222222222222222222222", "333333333333333333333333333333");
    }
}
