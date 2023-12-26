package array.old;

public class Segregate0and1 {

    public static void segregate0and1(int[] arry){
        int type0 = 0 ;
        int type1 = arry.length-1;
        while (type0 < type1){

            if (arry[type0] == 1){

                if (arry[type1] ==0){
                        int temp = arry[type0];
                        arry[type0] = arry[type1];
                        arry[type1] = temp;
                }
                type1 --;
            }else {
                type0 ++;
            }
        }
    }

    public static void main(String[] args) {
        int[] array = { 0, 1, 0, 1, 1, 1 };
        segregate0and1(array);
        for (int a : array) {
            System.out.print(a + " ");
        }
    }

}
