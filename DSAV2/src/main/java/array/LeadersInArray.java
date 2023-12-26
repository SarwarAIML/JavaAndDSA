package array;

public class LeadersInArray {

    public static void main(String[] args) {
        int[] array = {7,10,4,10,6,5,2};
        printLeadersNaive(array);
        System.out.println();
        System.out.println("=========================");
        printLeaders(array);
    }
    private static void printLeaders(int[] array) {

        int current_leader = array[array.length-1];
        System.out.print(current_leader+" ");
        for (int i = array.length-2; i >0 ; i--) {
            if (array[i] > current_leader)
            {
                current_leader = array[i];
                System.out.print(current_leader +" ");
            }

        }
    }
    private static void printLeadersNaive(int[] array) {

        for (int i = 0; i < array.length ; i++) {
            boolean isLeader = false;
            for (int j = 1+i; j < array.length; j++) {
                if (array[i] <= array[j]){
                    isLeader = true;
                    break;
                }
            }
            if (!isLeader)
                System.out.print(array[i]+ " ");
        }
    }
}
