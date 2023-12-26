package dsa1.string.pattern;

public class NaivePatternSearching {

    public static void main(String[] args) {

        String text = "ABCABCD";
        String pat = "ABCD";
        searchPattern(text,pat);
    }

    private static void searchPattern(String txt, String pat) {
        int n = txt.length();
        int m = pat.length();
        for (int i= 0; i<= (n-m); i++){
            int j ;
            for ( j = 0; j <m ; j++) {
                if (pat.charAt(j) != txt.charAt(i+j))
                    break;

            }
            if (j==m)
                System.out.println("index of pattern is::"+i);
        }
    }
}
