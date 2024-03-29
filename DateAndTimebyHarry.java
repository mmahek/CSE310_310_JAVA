import java.util.Date;
public class DateAndTimebyHarry{
    public static void main(String[] args) {
        // Time elapsed since 1970 1 January:
        // System.out.print(System.currentTimeMillis() / 1000 / 3600 / 24 / 365);
        // System.out.println(" years have passed since 1970 1 January.");
        // System.out.print(System.currentTimeMillis() / 1000 / 3600 / 24);
        // System.out.println(" Days have passed since 1970 1 January.");
        // System.out.print(System.currentTimeMillis() / 1000 / 3600);
        // System.out.println(" Hours have passed since 1970 1 January.");
        // System.out.print(System.currentTimeMillis() / 1000);
        // System.out.println(" Minutes have passed since 1970 1 January.");
        // System.out.print(System.currentTimeMillis() / 10);
        // System.out.println(" Seconds have passed since 1970 1 January.");
        System.out.println(Long.MAX_VALUE);
        System.out.println(System.currentTimeMillis());

        Date d = new Date();
        System.out.println(d.getTime());
    }
}