package BitMagic;

public class BitwiseOperationsPart2 {

    public static void main(String[] args) {

       //Left Shift with Negative Number
        System.out.println("Left Shift with Negative Number");
        int a = -3;
        System.out.println(a << 2);
        //Left Shift
        System.out.println("Left Shift");
        int x = 3;
        System.out.println(x << 1);
        System.out.println(x << 2);
        int y = 4;
        int z = (x << y);
        System.out.println(z);
        System.out.println("-----------------");
        System.out.println(1<<2);

    }
}
