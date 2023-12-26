package recursion.exersise1.gen;

public class RopeCuttingProblem_10 {

    public static int maxPieces(int n ,int a,int b,int c){
        if (n == 0 )
            return 0;
        if (n <= -1)
         return -1;
        int maxPieces =  Math.max( maxPieces(n-a,a,b,c),Math.max(maxPieces(n-b,a,b,c),
        maxPieces(n-c,a,b,c)));

        if (maxPieces == -1)
            return -1 ;

        return maxPieces+1;
    }

    public static void main(String[] args) {

        int n = 5, a = 2, b = 1, c = 5;
        System.out.println(maxPieces(n, a, b, c));
    }
}
