package String;

public class StringSubsequenceOfOther {
    static boolean isSubsequence(String s1,String s2,int n,int m){
        if (n<m) return false;
        int j = 0;
        for (int i = 0; i <n && j<m ; i++) {
            if (s1.charAt(i)==s2.charAt(j)) {
                j++;
            }
        }
        return j==m;
    }
    public static boolean issebseqRec(String s1,String s2,int n,int m){

        if (m==0) return true;
        if (n==0) return false;
        if (s1.charAt(n-1)==s2.charAt(m-1)){
            return issebseqRec(s1,s2,n-1,m-1);
        }else {
            return issebseqRec(s1,s2,n-1,m);
        }
    }

    public static void main(String[] args) {
        String s1="ABCDEF";
        String s2 ="ABD";
        String s3 ="BDD";
        System.out.println(isSubsequence(s1,s2, s1.length(),s2.length()));
        System.out.println(issebseqRec(s1,s2, s1.length(),s2.length()));
    }
}
