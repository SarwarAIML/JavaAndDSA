package riyadhTest;

public class TestTaker1 {

/*

Given two integers, determine if you can construct the lucky number 88. If so,
return the boolean true, else return false

    You can construct the lucky number 88 if:
            1. One of the two numbers is the number 88 itself
            2. The addition of the two numbers is 88
            3. The subtraction of the two numbers is 88

    Examples:
    Input: a=99, b=11
    Output: true
    Input: a=88, b=100
    Output: true

    Input: a=11, b=77
    Output: true

    */
    public static Boolean luck_88(Integer a,Integer b){

        return (a.equals(88))|| (b.equals(88)) ||(a+b ==88) || (a-b == 88) || (b-a ==88);
    }

    public static void main(String[] args) {
        Integer a = 11;
        Integer b = 77;
        System.out.println("==========================result=============");
        Boolean result = luck_88(a,b);
        System.out.println(result);
    }
}
