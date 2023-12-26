package practice;

import java.util.ArrayList;
import java.util.List;

public class Test3d {
    public static void main(String[] args) {

        List<Employee> list = new ArrayList<Employee>();

        list.add(new Employee(1,"A",1000));
        list.add(new Employee(2,"B",1001));
        list.add(new Employee(3,"C",1002));
        list.add(new Employee(4,"D",1003));
        list.add(new Employee(5,"E",1004));

        double secondHighest = list.stream().map(Employee::getSalray).distinct().sorted((s1, s2) -> Double.compare(s1, s2))
                .skip(1)
                .findFirst()
                .orElseThrow(() -> new RuntimeException("NO enough Employee"));

        System.out.println(secondHighest);

    }
}
