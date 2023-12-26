package employee;

public class SuperClass1 {

    void method()
    {
        System.out.println("SuperClass");
    }
}

class SubClass1 extends SuperClass1{

    void method() throws ArithmeticException
    {
        System.out.println("SubClass1");
    }


    public static void main(String args[])
    {
        SuperClass1 s = new SubClass1();
        s.method();
    }
}