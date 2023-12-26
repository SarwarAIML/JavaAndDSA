package recursion.exersise1.gen;

public class StringSubsetsProblems_11 {

    public static void printSubsets(String str,String current,int index){

        if (str.length() == index){
            System.out.print(current + " ");
            return;
        }
        printSubsets(str,current,index+1);
        printSubsets(str,current+str.charAt(index),index+1);
    }

    public static void main(String[] args) {
            String str = "ABC";
            String current = " ";
            int index = 0 ;
            printSubsets(str,current,index);
    }
}
