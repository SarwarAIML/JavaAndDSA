package practice;

import java.util.*;

public class Singlton {

    private  static Employee employee = null ;

    public static  synchronized Employee getEmployee() {

        if (employee == null) {
            employee = new Employee();
        }
        return employee;
    }

    public static void main(String[] args) {

        Comparator<Employee> namecomparator = (o1, o2) -> o1.getName().compareTo(o2.getName());
        List<Employee> employees = new ArrayList<>();
        Collections.sort(employees,namecomparator);

        int[] arr= {1,2,1,4,6,7,8,8,9};
        printFrequencies(arr);
    }

    private static void printFrequencies(int[] arr) {

        Map<Integer,Integer> map = new HashMap<Integer,Integer>();
                for (int num : arr){
                    map.put(num,map.getOrDefault(num,0)+1);
                }
        System.out.println(map);
    }


}
