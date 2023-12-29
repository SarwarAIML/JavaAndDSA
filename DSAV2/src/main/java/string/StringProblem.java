package string;

import java.util.*;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StringProblem {
    public static void printFrequencyOfCharsInString(String string){
        int[] count = new int[256];
          string = string.toLowerCase();
          string = string.replaceAll("[^a-zA-Z0-9]","");
        for (int i = 0; i <string.length() ; i++) {
            count[string.charAt(i)-'a']++;
        }
        for (int i = 0; i <256 ; i++) {
            if (count[i] > 0){
                System.out.println((char)(i+'a') +" : "+count[i]);
            }
        }
    }

    public static void  printFrequencyUsingMap(String string){
        Map<Character,Integer> map = new LinkedHashMap<Character,Integer>();
        string = string.replaceAll("[^a-zA-Z0-9]","");
        for (int i = 0; i <string.length() ; i++) {
                map.put(string.charAt(i),map.getOrDefault(i,0)+1);
        }
        System.out.println(map);
    }

    public static void  printFrequencyUsingJava8(String string) {

        string.chars().mapToObj(ch ->Character.valueOf((char) ch))
                .collect(Collectors.groupingBy(Function.identity(), TreeMap::new,Collectors.counting()))
                .entrySet()
                .stream()
                .filter(entry->entry.getValue() !=' ')
                .forEach(entry-> System.out.print(entry.getKey()+":"+entry.getValue()));
    }

    public static boolean isPalindrome(String string){

        int start = 0;
        int end = string.length()-1;
        while (start<= end){
            if (string.charAt(start) != string.charAt(end))
                return false;
            start++;
            end--;
        }
        return true;
    }

    public static boolean isPalindromeJava8(String string)
    {
        return IntStream.range(0,string.length()/2)
                .allMatch(index -> string.charAt(index) == string.charAt(string.length()-index-1));
    }

    public static String printPalindromeString(String string){
        int start = 0;
        int end = string.length()-1;
        while (start<=end){
            if (string.charAt(start) != string.charAt(end)){
                return null;
            }
            start++;
            end--;
        }
        return string;
    }

    public static void printAllPalindromeWordUsingJava8(String string) {

        Stream.of(string.split(" ")).filter(StringProblem::isPalindrome)
                .forEach(string1 -> System.out.println(string1));
    }

    public static boolean isSubsequence(String string1,String string2){

        int n = string1.length();
        int m = string2.length();
        if (n < m)
            return false;
        int j = 0;
        for (int i = 0; i < n && j< m; i++) {
            if (string1.charAt(i)==string2.charAt(j)){
                j++;
            }
        }
        return m==j;
    }

    public static boolean isSubSeqRec(String string1,String string2,int n,int m){

        if (m==0) return true;
        if (n==0) return false;
        if (string1.charAt(n-1)==string2.charAt(m-1)){
            return isSubSeqRec(string1,string2,n-1,m-1);
        }else {
            return isSubSeqRec(string1,string2,n-1,m);
        }

    }

    public static boolean isAnagram(String string1,String string2){
        if (string1.length() !=string2.length()) return false;
        int[] count = new int[256];
        for (int i = 0; i < string1.length(); i++) {
            count[string1.charAt(i)]++;
            count[string2.charAt(i)]--;
        }
        for (int i = 0; i < 256; i++) {
            if (count[i] > 0)
                return false;
        }
        return true;
    }

    public static int leftMostRepeatingChar(String string) {

        int[] count =new int[256];
        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) !=' ')
               count[string.charAt(i)]++;
        }
        for (int i = 0; i < 256; i++) {
            if (count[string.charAt(i)]>1){
                return i;
            }
        }
        return -1;
    }
    public static char leftMostRepeatingCharJava8(String string) {
        Character character = string.chars().mapToObj(ch -> Character.valueOf((char) ch))
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
                .entrySet()
                .stream()
                .filter(entry -> entry.getValue() > 1 && entry.getKey() !=' ')
                .map(map -> map.getKey())
                .findFirst()
                .get();
        System.out.println(character);
        return character;
    }

    public static void leftMostNonRepeatingJava8(String string){
        Character character = string.chars().mapToObj(ch -> Character.valueOf((char) ch))
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
                .entrySet()
                .stream()
                .filter(entry -> entry.getValue() == 1)
                .map(Map.Entry::getKey)
                .findFirst()
                .get();
        System.out.println(character);
    }

    public static void printNonPalindromeWords(String string){
        List<String> words = Arrays.stream(string.split(" ")).
                filter(word -> !isPalindrome(word)).collect(Collectors.toList());
   //     Arrays.stream(string.split(" ")).filter(Predicate.not(StringProblem::isPalindromeJava8));
        System.out.println(words);
    }

    public static void printPalindromeWords(String string) {
        List<String> stringList = Arrays.stream(string.split(" ")).
                filter((StringProblem::isPalindromeJava8)).collect(Collectors.toList());
        System.out.println(stringList);

    }


    public static void main(String[] args) {

        String str =  "This is Gulam Sarwar Here ";

        System.out.println("========================printFrequencyOfCharsInString=========start");
            printFrequencyOfCharsInString(str);
        System.out.println("========================printFrequencyOfCharsInString=========end");
        System.out.println();
        System.out.println("========================printFrequencyUsingMap=========start");
        printFrequencyUsingMap("Welcome to India");
        System.out.println("========================printFrequencyUsingMap=========end");
        System.out.println();

        System.out.println("========================printFrequencyUsingJava8=========start");
        printFrequencyUsingJava8("Welcome to India");
        System.out.println("========================printFrequencyUsingJava8=========end");
        System.out.println();


        System.out.println("========================isPalindrome=========start");
        System.out.println(isPalindrome("madam"));
        System.out.println("========================isPalindrome=========end");
        System.out.println();

        System.out.println("========================printNonPalindromeWords=========start");
        String palindrome = "malayalam";
        System.out.println(isPalindromeJava8(palindrome));
        System.out.println("========================printNonPalindromeWords=========end");
        System.out.println();

        System.out.println("========================isPalindrome=========start");
        System.out.println(printPalindromeString("madam"));
        System.out.println("========================isPalindrome=========end");
        System.out.println();

        System.out.println("========================printAllPalindromeWordUsingJava8=========start");
        printAllPalindromeWordUsingJava8("I am super madam");
        System.out.println("========================printAllPalindromeWordUsingJava8=========end");
        System.out.println();

        System.out.println("========================isSubsequence=========start");
        String s1="ABCDEF";
        String s2 ="ABD";
        System.out.println(isSubsequence(s1,s2));
        System.out.println("========================isSubsequence=========end");
        System.out.println();

        System.out.println("========================isSubSeqRec=========start");
        System.out.println(isSubSeqRec(s1,s2,s1.length(),s2.length()));
        System.out.println("========================isSubSeqRec=========end");
        System.out.println();

        System.out.println("========================isAnagram=========start");
        System.out.println(isAnagram("SARWAR","WARSAR"));
        System.out.println("========================isSubSeqRec=========end");
        System.out.println();

        System.out.println("========================leftMostRepeatingChar=========start");
        String chars = "Tu maan meri Jaan";
        int aChar = leftMostRepeatingChar(chars);
        System.out.println(chars.charAt(aChar));
        System.out.println("========================leftMostRepeatingChar=========end");
        System.out.println();

        System.out.println("========================leftMostRepeatingCharJava8=========start");
        String string = "Tu maan meri Jaan";
        char ch = leftMostRepeatingCharJava8(string);
        System.out.println(ch);
        System.out.println("========================leftMostRepeatingCharJava8=========end");
        System.out.println();

        System.out.println("========================leftMostNonRepeatingJava8=========start");
        String s = "Tu maan meri Jaan";
        leftMostNonRepeatingJava8(s);
        System.out.println("========================leftMostNonRepeatingJava8=========end");
        System.out.println();

        System.out.println("========================printNonPalindromeWords=========start");
        String str1 = "i know malayalam well";
        printNonPalindromeWords(str1);
        System.out.println("========================printNonPalindromeWords=========end");
        System.out.println();

        System.out.println("========================printPalindromeWords=========start");
        printPalindromeWords(str1);
        System.out.println("========================printPalindromeWords=========end");
        System.out.println();



    }
}