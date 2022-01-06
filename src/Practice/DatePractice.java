package Practice;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DatePractice {

    public static void main(String[] args) {

        Date now = new Date();
        System.out.println(now);

        SimpleDateFormat date = new SimpleDateFormat("dd");
        int datenow = Integer.valueOf(date.format(now));

        if ( datenow < 15)
        System.out.println("we are in half of the month");
        else System.out.println( "we are in second half of the month");












    }
}
