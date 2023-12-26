package practice;

import java.util.ArrayList;
import java.util.List;

public class Singlaton {


    private static Singlaton singlaton;

    private Singlaton() {
    }

    public static synchronized Singlaton getSinglaton() {
        if (singlaton == null)
            singlaton = new Singlaton();

        return singlaton;
    }


    public enum Test{
        INSTANCE;
    }










    public static void main(String[] args) {
        Singlaton singlaton1 = Singlaton.getSinglaton();


        /**
         *
         *     you have list of random numbers
         *     you have to find the index of number
         *     you have to find the index of given number multiple times
         *
         */
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(10);  list.add(20);  list.add(30);  list.add(40);

        int integer = list.indexOf(40);

        //emp , id emp_name
        // dept , id dpt_name
        //em_dpt relation table  emp_id and dept_id


                // find emp whose dept ?

    }

}
