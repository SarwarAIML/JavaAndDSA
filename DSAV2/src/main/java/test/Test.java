package test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Test {

    public static void main(String[] args) throws Exception{
        dateFormat();
        System.out.println("====================================");

        int cont = countDigits(1267);
        System.out.println("number of digits :: "+cont);
    }

    private static void dateFormat() throws ParseException {
        String inputDateStr = "2023-09-04";
        String inputFormatStr = "yyyy-MM-dd";
        String outputFormatStr = "dd-MM-yyyy";

        SimpleDateFormat inpututFormate = new SimpleDateFormat(inputFormatStr);
        SimpleDateFormat outputFormate = new SimpleDateFormat(outputFormatStr);

        Date date = inpututFormate.parse(inputDateStr) ;
        String outputDateString = outputFormate.format(date);

        System.out.println("input Date String ::"+inputDateStr);
        System.out.println("output Date String ::"+outputDateString);
    }

    public static int countDigits(int num) {

        int count = 0 ;
        while (num != 0){
            num = num /10;
            count++;
        }
        return count;
    }
}
