package recursion.exersise1.gen;

public class TowerOfHanoi_12 {
    public static void ToH(int n,char A,char B,char C)
    {
        if (n == 1){
            System.out.println("Move Disk 1 from "+ A + " TO "+ C);
            return;
        }
        ToH(n-1,A,C,B);
        System.out.println("move disk "+n +" from "+ A + " TO "+ C);
        ToH(n-1,B,A,C);
    }
    public static void main(String[] args) {
        int n = 3;
        ToH(n,'A','B','C');
    }
}
