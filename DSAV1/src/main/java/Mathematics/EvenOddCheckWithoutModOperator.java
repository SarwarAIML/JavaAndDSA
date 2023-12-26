package Mathematics;

public class EvenOddCheckWithoutModOperator {

    public static int isOdd(int number)
    {
        // n&1 is 1, then
        // odd, else even
        return 1 & number;
    }

    public static void main(String[] args) {
        int isOdd = isOdd(101);
        if (isOdd == 0)
            System.out.println("even number");
        else
            System.out.println("Odd number");
    }
}
