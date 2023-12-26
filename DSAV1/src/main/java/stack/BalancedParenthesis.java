package stack;

import java.util.ArrayDeque;
import java.util.Deque;

public class BalancedParenthesis {

    public static boolean match(char a,char b){

        return (a == '(' && b == ')' || (a == '{' && b=='}') || (a == '[' && b==']'));
    }
    public static boolean isBalanced (String str){

        Deque<Character> stack = new ArrayDeque<Character>();
        for (int i = 0; i <str.length() ; i++) {
            if (str.charAt(i) == '(' || str.charAt(i) == '{' || str.charAt(i) == '[') {
                stack.push(str.charAt(i));
            }else {
                if (stack.isEmpty()){
                    return false;
                } else if (match(stack.peek(),str.charAt(i))==false) {
                    return false;
                }else {
                    stack.pop();
                }
            }
        }
        return (stack.isEmpty() == true);
    }

    public static void main(String[] args) {

        String str = "{()}[]}";

        if (isBalanced(str))
            System.out.print("Balanced");
        else
            System.out.print("Not Balanced");
    }
}
