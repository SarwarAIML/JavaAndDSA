package recursion.old;

public class StringPalindrum {
    public static boolean isPalindrum(String str,int start,int end){
        if (start >=end)
            return true;
        return (str.charAt(start)==str.charAt(end)) && (isPalindrum(str,start+1,end-1)) ;
    }

    public static boolean isPalindrum(String str){
        int start = 0;
        int end = str.length()-1;
        while (start <= end){
            if( str.charAt(start) != str.charAt(end))
            return false;
            start++;
            end--;
        }
        return true;
    }

    public static void main(String[] args) {
        String str = "abcba";
        int start = 0;
        int end = str.length()-1;
        System.out.println(StringPalindrum.isPalindrum(str,start,end));
        System.out.println(StringPalindrum.isPalindrum(str));
    }
}
