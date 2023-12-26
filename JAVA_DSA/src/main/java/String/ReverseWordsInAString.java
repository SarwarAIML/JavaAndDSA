package String;

public class ReverseWordsInAString {

    static void reverseWord( char[] ch){
        int start = 0;
        for (int end = 0; end < ch.length ; end++) {
            if (ch[end]==' '){
                reverse(ch,start,end-1);
                start = end+1;
            }
        }
        reverse(ch,start,ch.length-1);
        reverse(ch,0,ch.length-1);
    }

    public static void reverse(char[] ch, int low, int high) {
        while (low<=high){
            char tem = ch[low];
            ch[low] = ch[high];
           ch[high]=tem;
           high--;
           low++;
        }
    }

    public static void main(String[] args) {
        String str = "Welcome to the Paypal";
        // op = Paypal the to Welcome
        char ch[] = str.toCharArray();
        reverseWord(ch);
        System.out.println(ch);
    }
}
