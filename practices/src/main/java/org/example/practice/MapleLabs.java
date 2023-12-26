package org.example.practice;

public class MapleLabs {

    public static void main(String[] args) {
        //
        //remove palindrome words in a sentence?
        //	input = i know malayalam well
        //	output = know well
        String str = "i know malayalam well";

        appendWords(  str );

    }

    private static void appendWords(String str) {
        char[] chars = str.toCharArray();

        StringBuilder newStringBuilder2 = new StringBuilder();
        StringBuilder newStringBuilder = new StringBuilder();
        for (char c : chars){
            if (!Character.toString(c).equalsIgnoreCase(" ")) {
                newStringBuilder.append(c);
            }
                else
                if (!isPalindrum(newStringBuilder.toString())){

                    newStringBuilder2.append(newStringBuilder.toString());
                    System.out.println(newStringBuilder2.toString().trim());
                    newStringBuilder = new StringBuilder();
                }else {
                    newStringBuilder2.append(" ");
                    newStringBuilder = new StringBuilder();
                    System.out.println(newStringBuilder2.toString().trim());

                }
            }
        System.out.println(newStringBuilder2.toString().trim());
    }

    private static boolean isPalindrum(String str1) {
      int low = 0 ;
      int high = str1.length()-1;
      while (low<= high) {
          if (str1.charAt(low) != str1.charAt(high))
              return false;
          low++;
          high--;
      }
      return true;

    }


}
