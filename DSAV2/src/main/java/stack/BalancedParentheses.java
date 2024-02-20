package stack;

import java.util.ArrayDeque;
import java.util.Stack;

//idea is keep pushing the opening brackets
//if found closing one peak() from the stack and match with closing bracket if dont match return false
//else pop


public class BalancedParentheses {

    public static boolean isMatching(char a,char b){
        return (
                (a == '(' && b == ')') ||
                        (a == '{' && b == '}') ||
                        (a == '[' && b == ']')
        );
    }

    public static boolean isBalanced(String string){
        ArrayDeque<Character> stack = new ArrayDeque<>();
        char[] charArray = string.toCharArray();
       for (char c : charArray){
           if(c =='{' || c =='('|| c =='['){ //keep pushing opening braces
               stack.push(c);
           }else{

               if (stack.isEmpty()){   //if no opening braces is present return false immidiatly
                   return false;
               }else if(!isMatching(stack.peek(),c)){  //if closing braces is found then match with pick if don't match return false
                    return false;
               }else {
                   //this is for true case when Parentheses is matching then pop the element
                   stack.pop();//
               }
           }


       }
        return (stack.isEmpty());
    }


    public static void main(String[] args) {
        String expr = "{()}[]";

        // Function call
        if (isBalanced(expr))
            System.out.println("Balanced");
        else
            System.out.println("Not Balanced");
    }
}