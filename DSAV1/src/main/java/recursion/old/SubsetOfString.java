package recursion.old;

public class SubsetOfString {

    public static void subsets(String str , String current,int index){
        int n = str.length();
        if (index == n){
            System.out.println(current);
            return;
        }
        subsets(str,current,index+1);
        subsets(str,current+str.charAt(index),index+1);
    }

    public static void main(String[] args) {
       SubsetOfString.subsets("ABC","",0);
    }
}
