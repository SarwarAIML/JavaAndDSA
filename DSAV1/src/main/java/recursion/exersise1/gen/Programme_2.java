package recursion.exersise1.gen;

public class Programme_2 {

    static void fun(int n)
    {
        if(n == 0)
            return;
        fun(n - 1);
        System.out.println(n);
        fun(n - 1);
    }
    public static void main(String [] args)
    {
        fun(3);
    }
}
