import java.util.*;
import java.time.*;
import java.util.Date;

public class DateAndTime {
    public static void main(String[] args) {

        // Date obj = new Date();
        // System.out.println(obj); // 1970 00h 00m 00s
        // Date obj1 = new Date(1111111195991L);
        // System.out.println(obj1);
        // Date obj2 =new Date(103,3,24);
        // System.out.println(obj2);
        /*
         * Thu Mar 28 20:01:28 IST 2024
         * Fri Mar 18 07:29:55 IST 2005
         * Wed Nov 26 00:00:00 IST 2003
         */
        // Date date1 = new Date(1711648439801L);
        // Date date2 = new Date(1288914599899L);
        // Date date3 = new Date(); // date1 < date2 < date3
        // System.out.println(date1);
        // System.out.println(date2);
        // System.out.println(date3);

        /*
         * functions - 1. after,
         * 2. before,
         * 3. compareTo
         */

        // 1. after
        // System.out.println(date3.after(date1));
        // System.out.println(date1.after(date3));

        // // 2. before
        // System.out.println(date3.before(date2));
        // System.out.println(date2.before(date3));

        // // 3. compareTo
        // System.out.println(date3.compareTo(date1)); // if date3 > date1 == positive
        // value
        // System.out.println(date1.compareTo(date3)); // if date3 < date1 == negative
        // value
        // System.out.println(date3.compareTo(date3)); // if date3 == date3 == 0

        // Date d1 = new Date();
        // System.out.println(d1);

        // // Change time only- no date
        // System.out.print("After changing the hours, minutes & seconds : ");
        // d1.setHours(23);
        // d1.setMinutes(23);
        // d1.setSeconds(59);

        // System.out.println(d1);
        // System.out.println("Before setting the time: " + d1);
        // d1.setTime(17116439357L);
        // System.out.println("After setting the time: " + d1);
        // System.out.println(d1.getTime()); // gives the current milliseconds time

        // Date current = new Date();
        // System.out.println(current);
        // LocalDate local = current.toInstant()
        // .atZone(ZoneId.systemDefault())
        // .toLocalDate();
        // System.out.println(local); // -- outputs 2024-03-28
        
    }
}
