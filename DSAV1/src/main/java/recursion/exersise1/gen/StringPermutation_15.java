package recursion.exersise1.gen;

public class StringPermutation_15 {

    public static void permute(String str,int index){
        if (str.length()-1 == index){
            System.out.println(str);
            return;
        }else {
            for (int j = index; j <= str.length()-1 ; j++) {
                str = swap(str,index,j);
                permute(str,index+1);
                str = swap(str,index,j);
            }

        }
    }

    private static String swap(String str, int index, int j) {
        char ch ;
        char[] chars = str.toCharArray();
        ch = chars[index];
        chars[index] = chars[j];
        chars[j] = ch;
        return String.valueOf(chars);
    }

    public static void main(String[] args) {
        String str = "ABC";
        permute(str,0);
    }
}
