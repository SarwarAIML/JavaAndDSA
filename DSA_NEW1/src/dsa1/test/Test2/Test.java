package dsa1.test.Test2;

class Test{
    public static void main(String[] args) {
        Test t = new Test();
        int i = t.check();
        System.out.println(i);
    }
    int check(){
        try{
            System.out.println("try block");
            System.exit(0);
            return 1;
        }catch(Exception e){
            System.out.println("catch block");
            return 2;
        }finally{
            System.out.println("finally returning");
            return 3;
        }
    }
}