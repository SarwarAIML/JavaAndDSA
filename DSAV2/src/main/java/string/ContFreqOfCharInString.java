package string;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ContFreqOfCharInString {

    public static void printFrequencyOfCharInString(String str){

        int[] count = new int[26];
        for (int i = 0; i <str.length() ; i++) {
            count[str.charAt(i) -'a']++;
        }
        System.out.println(Arrays.toString(count));
        for (int i = 0; i < 26; i++) {
           if (count[i]>0)
               System.out.println((char) (i+'a') +" ::"+count[i]);
        }

    }

    private static void printFreq(String string){
        int[] count= new int[256];
        for (int i = 0; i <string.length() ; i++) {
            count[string.charAt(i)-'a']++;
        }
        for (int i = 0; i <string.length(); i++) {
            if (count[i]>0){
                System.out.println((char)(i+'a') +":"+count[i]);
            }
        }
    }

    private static void printFreq8(String string){
        string.chars().mapToObj(ch->(char)ch)
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new,Collectors.counting()))
                .entrySet()
                .stream()
                .forEach((entry) -> System.out.println("key::"+entry.getKey()+" value::"+entry.getValue()));

    }

    public static void main(String[] args) {
          String str = "geekforgeeks";
          printFrequencyOfCharInString(str);
        printFreq(str);
        printFreq8(str);

    }
}