package array.old;

public class LeadersInArray {

    public static void printLeaders(int[] array){

        int current_leader = array[array.length-1];
        System.out.println(current_leader);
        for (int i = array.length-2; i >=0 ; i--) {
            if (current_leader < array[i]){
                current_leader = array[i];
                System.out.println(current_leader);
            }
        }
    }

    public static void main(String[] args) {
        int[] array = {7,10,4,10,6,5,2};
        printLeaders(array);
    }
}
