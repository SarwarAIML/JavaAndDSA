package String;

public class AnagramSearch {
    static final int CHAR=256;

    /**
     *
     * @param pat
     * @param txt
     * @param i
     * @return
     * Naive Code
     */
    static boolean areAnagram1(String pat, String txt,int i)
    {
        int[] count=new int[CHAR];
        for(int j=0;j<pat.length();j++){
            count[pat.charAt(j)]++;
            count[txt.charAt(i+j)]--;
        }
        for(int j=0;j<CHAR;j++){
            if(count[j]!=0)return false;
        }
        return true;
    }

    /**
     *
     * @param txt
     * @param pat
     * @return
     * Naive Code
     */
    static boolean isPresent1(String txt,String pat){
        int n=txt.length();
        int m=pat.length();
        for(int i=0;i<=n-m;i++){
            if(areAnagram1(pat,txt,i))return true;
        }
        return false;
    }

    static boolean areSame(int CT[],int CP[]){
        for(int i=0;i<CHAR;i++){
            if(CT[i]!=CP[i])return false;
        }
        return true;
    }

    static boolean isPresent2(String txt,String pat){
        int[] CT=new int[CHAR];int[] CP=new int[CHAR];
        for(int i=0;i<pat.length();i++){
            CT[txt.charAt(i)]++;
            CP[pat.charAt(i)]++;
        }
        for(int i=pat.length();i<txt.length();i++){
            if(areSame(CT,CP))return true;
            CT[txt.charAt(i)]++;
            CT[txt.charAt(i-pat.length())]--;
        }
        return false;
    }

    public static void main(String args[])
    {
        String txt1 = "geeksforgeeks";
        String pat1 = "frog";
        if (isPresent1(txt1, pat1))
            System.out.println("Anagram search found");
        else
            System.out.println("Anagram search not found");

        System.out.println("===================================================");

        String txt2 = "geeksforgeeks";
        String pat2 = "frog";
        if (isPresent2(txt2, pat2))
            System.out.println("Anagram search found");
        else
            System.out.println("Anagram search not found");
    }
}
