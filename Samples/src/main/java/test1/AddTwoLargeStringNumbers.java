package test1;


/**
 *
 *  Write a function, add, which adds two large numbers together and returns their sum:
 *
 * // Returns sum of two numbers
 * String add(String a, String b)
 *
 * 1. Inputs to the add function are two numbers, represented as strings
 * 2. Output of the add function is a single string representing the sum of the inputs
 * 3. Only positive integers need to be supported
 * 4. Input numbers can be very large, with 100 digits or more. This negates the ability
 * to convert the entirety of the strings to integers and simply add them together in a 32-bit system.
 * 5. Add AsertAdd() method which asserts the sum of 2 strings with expected result.
 *
 * Do’s and Don’ts
 * 1. Don’t make use of any existing BigInteger packages or other construct which allows you
 * to convert the entire input numbers to integers, natively add them, and convert back to strings.
 * The point of this problem is to implement addition on a digit-by-digit basis.
 * 2. Think out loud! Describe your approach and discuss changes as new information surfaces
 * 3. Test-Driven Development is preferred. It is highly recommended to create a test runner
 *  function, assertAdd, which takes 3 inputs and displays whether the add function returns the third
 *  parameter when invoked with the first two parameters.
 *
 *
 * Problem-Extension:
 * 1. Extend add function to support ",". eg: 12,34,567 + 76,54,321 = 88,88,888 & 999 + 1 = 1,000
 *      */



public class AddTwoLargeStringNumbers {


    public static String add2StringNumbers(String a,String b){

        StringBuilder result =  new StringBuilder();
        int carry = 0;
        int i = a.length()-1 ;
        int j = a.length()-1 ;

        int sum = 0 ;

        while (i >=0 || j >=0 ){

            int digitA =(i>=0) ?a.charAt(i--) -'0':0;
            int digitB =(j>=0) ?b.charAt(j--) -'0':0;

             sum = digitA + digitB ;
            if (sum >9 || carry > 0 ){
                sum = digitA + digitB +carry;
                carry = sum / 10;
                result.insert(0,sum % 10);
            }else {
                result.insert(0,sum % 10);
            }

        }
        if (carry > 0){
            result.insert(0,carry);
        }
        return result.toString();
    }

    public static void main(String[] args) {

        String a = "54";//111111111111111111111111111111
        String b = "48";//222222222222222222222222222222
        String c = add2StringNumbers(a,b);
        System.out.println(c);

        //123456789012345678901234567890
        //987654321098765432109876543210
    }
}
