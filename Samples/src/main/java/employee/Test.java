package employee;

import java.util.ArrayList;
import java.util.List;

public class Test {

    public static void main(String[] args) {

        List<Employee> ls1=new ArrayList<Employee>();

        ls1.add(new Employee(1,10000));

        ls1.add(new Employee(2,20000));

        ls1.add(new Employee(3,30000));

        ls1.add(new Employee(4,40000));

        ls1.add(new Employee(5,50000));

        ls1.add(new Employee(6,60000));

        ls1.add(new Employee(7,40000));

        List<Employee> ls2=new ArrayList<>();

        ls2.add(new Employee(1,60000));

        ls2.add(new Employee(2,70000));

        List<Employee> ls3=new ArrayList<>();

        ls3.add(new Employee(1,80000));

        ls3.add(new Employee(2,90000));

        ls3.add(new Employee(3,100000));

        List<List<Employee>> allList=new ArrayList<>();

        allList.add(ls1);

        allList.add(ls2);

        allList.add(ls3);

        // display employee who having more thatn 30000 sla
        //remove dublicate

    allList.stream().flatMap(List::stream)
                .filter(employee -> employee.getSalary() > 30000)
                .map(employee -> employee.getSalary()).distinct()
                        .forEach(salary -> System.out.println(salary));


    }
}
