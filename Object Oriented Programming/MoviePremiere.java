import java.util.Scanner;
public class MoviePremiere {
    public static void main(String[] args) {
        // Scanner s = new Scanner(System.in);
        // System.out.print("Enter date 1:");
        // String s1 = s.nextLine();
        // System.out.print("Enter date 2:");
        // String s2 = s.nextLine();
        String s1 = "1978-06-06";
        String s2 = "2024-03-30";

        String d1 = s1.substring(8, 10);
        String d2 = s2.substring(8, 10);
        int date1 = Integer.parseInt(d1);
        int date2 = Integer.parseInt(d2);

        String m1 = s1.substring(5, 7);
        String m2 = s2.substring(5, 7);
        int month1 = Integer.parseInt(m1);
        int month2 = Integer.parseInt(m2);

        String y1 = s1.substring(0, 4);
        String y2 = s2.substring(0, 4);
        int year1 = Integer.parseInt(y1);
        int year2 = Integer.parseInt(y2);

        if(date1 == date2 & month1==month2 & year1 == year2 ){
            System.out.println("Movie already premiered");
        } else{
            int dayDifference = date2 - date1;
            int monthDifference = month2 - month1;
            int yearDifference = year2 - year1;

            int totalDifference = dayDifference + monthDifference * 30 + yearDifference * 365;
            System.out.println("Difference in days: " + totalDifference);
        }
    }
}
