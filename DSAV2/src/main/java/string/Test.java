package string;

class Test {
    public static void main(String[] args) {
        Test t = new Test();
        int i = t.check();
        System.out.println(i);
    }

    int check() {
        try {
            System.out.println("try block");
            return 1;
        } catch (Exception e) {
            System.out.println("catch block");
            return 2;
        } finally {
            System.exit(0);
            System.out.println("finally returning");
            return 3;
        }
    }
}