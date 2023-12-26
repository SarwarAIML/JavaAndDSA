package String;

import java.util.Arrays;

public class LeftmostRepeatingCharacter {
    /**
     *
     * @param str
     * @return
     * Naive Code
     */
    static int leftMost1(String str)
    {
        for(int i=0;i<str.length();i++){
            for(int j=i+1;j<str.length();j++){
                if(str.charAt(i)==str.charAt(j))return i;
            }
        }
        return -1;
    }

    static final int CHAR=256;

    /**
     *
     * @param str
     * @return
     * Better Approach
     */
    static int leftMost2(String str)
    {
        int[] count=new int[CHAR];
        for(int i=0;i<str.length();i++){
            count[str.charAt(i)]++;
        }
        for(int i=0;i<str.length();i++){
            if(count[str.charAt(i)]>1)return i;
        }
        return -1;
    }

    /**
     *
     * @param str
     * @return
     * Efficient Approach-1
     *
     */
    static int leftMost3(String str)
    {
        int[] fIndex=new int[CHAR];
        Arrays.fill(fIndex,-1);
        int res=Integer.MAX_VALUE;
        for(int i=0;i<str.length();i++){
            int fi=fIndex[str.charAt(i)];
            if(fi==-1)
                fIndex[str.charAt(i)]=i;
            else
                res=Math.min(res,fi);
        }

        return (res==Integer.MAX_VALUE)?-1:res;
    }

    /**
     *
     * @param str
     * @return
     * Efficient Approach-2
     */
    static int leftMost4(String str)
    {
        boolean[] visited=new boolean[CHAR];
        int res=-1;
        for(int i=str.length()-1;i>=0;i--){
            if(visited[str.charAt(i)])
                res=i;
            else
                visited[str.charAt(i)]=true;
        }

        return res;

    }


    public static void main(String args[])
    {   String str1 = "geeksforgeeks";
        System.out.println("Index of leftmost repeating character:");
        System.out.println(leftMost1(str1));

        String str2 = "geeksforgeeks";
        System.out.println("Index of leftmost repeating character:");
        System.out.println(leftMost2(str2));

        String str3 = "geeksforgeeks";
        System.out.println("Index of leftmost repeating character:");
        System.out.println(leftMost3(str3));


    }
}
