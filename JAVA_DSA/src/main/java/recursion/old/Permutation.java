package recursion.old;

public class Permutation {

    public static void main(String[] args) {
        String str = "ABC";
      permutation(str,0);
    }
    public static void permutation(String str,int i){
        if (i == str.length()-1){
            System.out.println(str);
        }else {
            for (int j = i; j <=str.length()-1 ; j++) {
                str=swap(str,i,j);
                permutation(str,i+1);
                str=swap(str,j,i);
            }
        }
    }

    private static String swap(String str, int i, int j) {
        char temp ;
        char[] ch=str.toCharArray();
        temp = ch[i];
        ch[i] = ch[j];
        ch[j] = temp;
        return String.valueOf(ch);
    }
}
