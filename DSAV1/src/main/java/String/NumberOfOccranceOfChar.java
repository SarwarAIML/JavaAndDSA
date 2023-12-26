package String;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class NumberOfOccranceOfChar {
        public static void printOccurnaceOfChar(String str){
            str = str.toLowerCase();
            str = str.replaceAll("[^a-zA-Z0-9]", "");
            int count[] = new int[256];
            for (int i = 0; i <str.length() ; i++) {
                count[str.charAt(i)-'a']++;
            }
            for (int i = 0; i <256 ; i++) {
                if (count[i]>0)
                    System.out.println((char)(i+'a')+ "->"+count[i]);
            }
        }


  public static void numberOfFreqOfChar(String string){
      HashMap<Character,Integer> map = new LinkedHashMap<Character,Integer>();

      for (int i = 0; i < string.length(); i++) {
          map.put(string.charAt(i),map.getOrDefault(i,0));
      }
      System.out.println(map);
  }





    public static void main(String[] args) {
        String str="This is Gulam Sarwar Here";
        printOccurnaceOfChar(str);
        
    }
}
