package string;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StringProblemsV2 {

    public static void printFreq(String string){
        int[] count =  new int[256];
        string=string.replaceAll("[^a-zA-Z0-9]","");
        for (int i = 0; i <string.length() ; i++) {
            count[string.charAt(i) - 'a']++;
        }
        for (int i = 0; i <string.length() ; i++) {
            if (count[i]> 0){
                System.out.print((char)(i+'a') +" :" + count[i]+"\t");
            }
        }
    }

    public static void printFreqUsingJava8(String string){
       string = string.replaceAll("[^a-zA-Z0-9]","");
       string.chars().mapToObj(ch->Character.valueOf((char)ch))
               .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new,Collectors.counting()))
               .entrySet()
               .stream()
               .filter(key -> key.getValue() > 0)
               .forEach(key -> System.out.print(key.getKey() +":"+ key.getValue()+"\t"));

    }

    public static void printFreqUsingMap(String string){

        string = string.replaceAll("[^a-zA-Z0-9]","");
        Map<Character,Integer> integerMap = new LinkedHashMap<Character,Integer>();
        for (int i = 0; i <string.length() ; i++) {
            integerMap.put(string.charAt(i),integerMap.getOrDefault(string.charAt(i),0)+1);
        }
        System.out.println(integerMap);
    }

    public static boolean isPalindrome(String string){
      int start = 0;
      int end = string.length()-1;
      while (start<= end){
          if (string.charAt(start) != string.charAt(end)){
              return false;
          }
          start++;
          end--;
      }
        return true;
    }
    public  static  boolean isPalindromeJava8(String string){
        return IntStream.range(0,string.length()/2)
                .allMatch(index->string.charAt(index) == string.charAt(string.length()-index-1));
    }
    public static void  printPalindromeWords(String string){
        Arrays.stream(string.split(" ")).filter(StringProblemsV2::isPalindromeJava8)
                .forEach(string1 -> System.out.println(string1));
    }

    public static  boolean isSubsequence(String string1,String string2){

        if (string2.length() >string1.length())
            return false;

        int j= 0;
        for (int i = 0; i < string1.length() && j< string2.length(); i++) {
            if (string1.charAt(i) == string2.charAt(j))
                j++;
        }
        return string2.length() == j;
    }


    public static boolean isAnagram(String string1,String string2){

        if (string1.length() != string2.length())
            return false;

        string1 = string1.replaceAll("[^A-Za-z0-9]","");
        string2 = string2.replaceAll("[^A-Za-z0-9]","");
        int[] count = new int[256];
        for (int i = 0; i <string1.length() ; i++) {
            count[string1.charAt(i)]++;
            count[string2.charAt(i)]--;
        }

        for (int i = 0; i < 256; i++) {
            if(count[i] > 0)
                return false;
        }
        return true;
    }

    public static  int leftMostRepeatingChar(String string){
        string.replaceAll("[^A-Za-z0-9]","");
        int count[] = new int[256];
        for (int i = 0; i <string.length() ; i++) {
            count[string.charAt(i)]++;
        }
        for (int i = 0; i <string.length() ; i++) {
            if(count[string.charAt(i)] > 1){
                return i;
            }
        }
        return -1;
    }
    public static void leftMostRepeatingCharJava8(String string){
        string = string.replaceAll("[^A-Za-z0-9]","");

        Character leftMostRepeating = string.chars().mapToObj(ch -> Character.valueOf((char) ch))
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
                .entrySet()
                .stream()
                .filter(enty -> enty.getValue() > 1)
                .map(entry -> entry.getKey())
                .findFirst()
                .get();
        System.out.println("left most repeating chars::: "+leftMostRepeating);
    }

    public static void leftMostNonRepeatingChar8(String string){
        string = string.replaceAll("[^A-Za-z0-9]","");
        Character character = string.chars().mapToObj(ch -> Character.valueOf((char) ch))
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
                .entrySet()
                .stream()
                .filter(keyset -> keyset.getValue() == 1)
                .map(key -> key.getKey())
                .findFirst().get();
        System.out.println("left most non repeating char:: "+character);
    }

    public static int leftMostNonRepeatingChar(String string){
        string = string.replaceAll("[^A-Za-z0-9]","");
        int[] count =  new int[256];
        for (int i = 0; i < string.length(); i++) {
            count[string.charAt(i)]++;
        }

        for (int i = 0; i <string.length() ; i++) {
            if(count[string.charAt(i)] ==1){
                return i;
            }
        }

        return -1;
    }

    public static void reverseWordsInString(char[] word){
        int start = 0;

        for (int end = 0; end < word.length ; end++) {
            if (word[end] ==' '){
                reverserwords(word,start,end-1);
                start = end+1;
            }
        }
        reverserwords(word,start,word.length-1);
        reverserwords(word,0,word.length-1);
    }


    private static void reverserwords(char[] word, int start, int end) {
        while (start< end){
            char temp = word[start];
            word[start] = word[end];
            word[end] = temp;
            start++;
            end--;
        }

    }
    public static String reverseWords8(String input) {
        // Split the input string into words
        String[] words = input.split("\\s+");

        // Reverse the order of words using Java 8 Streams
        String reversedString = Arrays.stream(words)
                .reduce((first, second) -> second + " " + first)
                .orElse("");

        return reversedString.trim();
    }


//Group all occurrences of characters according to first appearance


    public static String groupOccuranceOfChars1(String string){
        //Input :  str = "occurrence"  utput : "occcurreen"
        StringBuilder stringBuilder = new StringBuilder();
        Map<Character,Integer> map = new LinkedHashMap<>();
        char[] chars = string.toCharArray();
        for (char ch : chars){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        for (Map.Entry<Character,Integer> entry: map.entrySet()){
            Character key = entry.getKey();
            Integer value = entry.getValue();
            for (int i = 0; i <value ; i++) {
                stringBuilder.append(key);
            }
        }
        map.entrySet().stream()
                .flatMapToInt(entry -> IntStream.generate(() -> entry.getKey()).limit(entry.getValue()))
                .forEach(key -> {
                    // Process the key
                    System.out.println(key);
                });

        System.out.println( stringBuilder.toString());
        return  stringBuilder.toString();
    }

    public static void groupOccuranceOfChars2(String string){
        //Input :  str = "occurrence"  utput : "occcurreen"
        int[] count = new int[256];

        for (int i = 0; i <string.length() ; i++) {
            count[string.charAt(i)]++;
        }
        for (int i = 0; i <string.length() ; i++) {
            while (count[string.charAt(i)]--   >0){
                System.out.print(string.charAt(i));
            }
        }
        System.out.println();

    }





    public static void main(String[] args) {
        String string = "this is frequency test";
        printFreq(string);
        System.out.println();
        System.out.println("=================");
        printFreqUsingJava8(string);
        System.out.println();
        printFreqUsingMap(string);

        String palindrome = "know";
        System.out.println(isPalindrome(palindrome));
        System.out.println(isPalindromeJava8(palindrome));
        System.out.println();
        System.out.println("=================");

        System.out.println("========================printPalindromeWords=========start");
        String str1 = "i know malayalam well";
        printPalindromeWords(str1);
        System.out.println("========================printPalindromeWords=========end");
        System.out.println();

        System.out.println("========================isSubsequence=========start");
        String s1="ABCDEF";
        String s2 ="ABD";
        System.out.println(isSubsequence(s1,s2));
        System.out.println("========================isSubsequence=========end");
        System.out.println();

        System.out.println("========================isAnagram=========start");
        System.out.println(isAnagram("SARWAR","WARSAR"));
        System.out.println("========================isSubSeqRec=========end");
        System.out.println();


        System.out.println("========================leftMostRepeatingChar=========start");
        String leftMost = "SARWAR";
        int leftMostRepeatingChar = leftMostRepeatingChar(leftMost);
        System.out.println(leftMost.charAt(leftMostRepeatingChar));
        System.out.println("========================leftMostRepeatingChar=========end");
        System.out.println();

        System.out.println("========================leftMostRepeatingCharJava8=========start");
       leftMostRepeatingCharJava8(leftMost);
        System.out.println();
        System.out.println("========================leftMostRepeatingCharJava8=========end");
        System.out.println();

        System.out.println("========================leftMostNonRepeatingChar8=========start");
        leftMostNonRepeatingChar8(leftMost);
        System.out.println("========================leftMostNonRepeatingChar8=========end");
        System.out.println();

        System.out.println("========================leftMostNonRepeatingChar=========start");
        int aChar = leftMostNonRepeatingChar(leftMost);
        System.out.println(leftMost.charAt(aChar));
        System.out.println("========================leftMostNonRepeatingChar=========end");
        System.out.println();
        System.out.println("========================reverseWordsInString=========start");
        String str = "Welcome To Altimetrik";
        char[] chars = str.toCharArray();
        reverseWordsInString(chars);
        System.out.println(chars);
        System.out.println("========================reverseWordsInString=========end");

        System.out.println("========================reverseWords8=========start");
        String words = "Welcome To Altimetrik";
        String reverseWords8 = reverseWords8(words);
        System.out.println(reverseWords8);
        System.out.println("========================reverseWords8=========end");
        System.out.println();

        System.out.println("========================groupOccuranceOfChars2=========start");
        //Input :  str = "occurrence"  utput : "occcurreen"
        String grpstr = "occurrence";
        System.out.println();
        groupOccuranceOfChars2(grpstr);
        System.out.println("========================groupOccuranceOfChars2=========end");
        System.out.println();
    }


}