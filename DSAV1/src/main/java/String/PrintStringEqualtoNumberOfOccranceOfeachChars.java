package String;

import java.util.LinkedHashMap;
import java.util.Map;

public class PrintStringEqualtoNumberOfOccranceOfeachChars {

    public static void main(String[] args) {

        ////Input :  str = "occurrence"  utput : "occcurreen"
        getUpdatedString("occurrence");
    }

    public static String getUpdatedString(String string){
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
        System.out.println( stringBuilder.toString());
        return  stringBuilder.toString();
    }

}