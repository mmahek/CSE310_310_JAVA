import java.util.Scanner;

public class TakingInput {
    public static void main(String[] args) {
        
        //Scanner is a class and sc is made as a new object for takng inputs
        //example: in an exam when invigilator distributes question papers and blank anwer sheets, it is same for everyone and at the end everyone fills it as per their need and knowledge similarly, every new object s used by variables as per need
        Scanner sc = new Scanner(System.in);
        /*System.out.println("Enter num1 : ");
        //int a = sc.nextInt();
        
        float a = sc.nextFloat();
        System.out.println("Enter num2: ");
        //int b = sc.nextInt();
        float b = sc.nextFloat();
        //int sum = a + b ;
        float sum = a+b;
        System.out.println("The sum of these numbers is :  ");
        System.out.println(sum);*/

        // boolean b1 = sc.hasNextInt();
        // System.out.println(b1);
        // String str = sc.next(); // reeads single word only , when encountered with space it stops reading
        String str = sc.nextLine();//reads whole line, with spaces
        System.out.println(str);

    }
}
