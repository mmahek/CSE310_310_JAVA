import java.util.Scanner;
public class BoardExamResult {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the marks for Maths : ");
        byte m1 = sc.nextByte();

        System.out.println("Enter the marks for English : ");
        byte m2 = sc.nextByte();

        System.out.println("Enter the marks for Hindi : ");
        byte m3 = sc.nextByte();

        System.out.println("Enter the marks for Social Science : ");
        byte m4 = sc.nextByte();

        System.out.println("Enter the marks for Science : ");
        byte m5 = sc.nextByte();

        int sum = m1 + m2 + m3 + m4 + m5;
        System.out.print("The Total marks are ");
        System.out.print(sum);
        float percenTage = (sum / 5);
        System.out.println(" ");

        System.out.print("Result is ");
        System.out.print(percenTage+"%");
    }
}
