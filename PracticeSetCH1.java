/* Question 1 Sum three nums
 * import java.util.Scanner;
 * public class PracticeSetCH1 {
 * public static void main(String[] args) {
 * //
 * Scanner sc = new Scanner(System.in);
 * System.out.println("Enter three numbers: ");
 * byte n1 = sc.nextByte();
 * byte n2 = sc.nextByte();
 * byte n3 = sc.nextByte();
 * int sum = n1 + n2 + n3;
 * System.out.println("The sum is " +sum);
 * }
 * }
 */

/* Question 2 Calculate CGPA
import java.util.Scanner;
public class PracticeSetCH1 {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        float marksSub1 = a.nextFloat();
        float marksSub2 = a.nextFloat();
        float marksSub3 = a.nextFloat();
        float cgpa = ( marksSub1 + marksSub2 + marksSub3 ) / 30;
        System.out.println("CGPA = " + cgpa);
    }
}*/

//Question 3 Greetings
/*import java.util.Scanner;
public class PracticeSetCH1{
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.print("Enter your name : ");
        String s = a.next();
        System.out.println("Hello " + s + ", how are you? ");
    }
}*/

//Question 4 Convert KMS to Miles
/*import java.util.Scanner;
public class PracticeSetCH1{
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.print("Enter value in kms : ");
        float km = a.nextFloat();
        double miles = 0.6213;
        double m = km*miles;
        System.out.print(km + " = " + m);

    }
}*/

//Question 5 Check for integer
import java.util.Scanner;
public class PracticeSetCH1{
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.print("Enter the num : ");
        System.out.print(a.hasNextInt());
    }
}



