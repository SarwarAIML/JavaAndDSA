package string;

public class ReverseString {

    public static void reverse(char[] ch){
        int low = 0;
        int high = ch.length-1;
        while (low < high){
            char temp  = ch[low];
            ch[low] = ch[high];
            ch[high] = temp;
            low ++;
            high --;
        }
    }
    public static void main(String[] args) {
        String str = "HellO";
        char[] string = str.toCharArray();
        reverse(string);
        System.out.println(string);
    }
}