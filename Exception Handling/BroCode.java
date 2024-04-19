import java.util.InputMismatchException;
import java.util.Scanner;
public class BroCode {
    public static void main(String[] args) {
        // If you feel like there can be esception, put the defauliter code inside try block.
         Scanner scanner = new Scanner(System.in);
        try{

        System.out.print("Enter a whole number x - ");
        int x = scanner.nextInt();

        System.out.print("Enter a whole number y - ");
        int y = scanner.nextInt();

        int z = x / y;
        System.out.println("x / y = " + x/y);
        
       }
       // In case there comes any error inside try block control goes to catch block and code inside catch block gets executed.
       // The main idea behind using try-catch block is to not let exception inturrupt the flow of program.
       catch(ArithmeticException e){
            System.out.println("You can't divide by 0. Idiot!");
       }
       catch(InputMismatchException e){
        System.out.println("Please enter a number only. OMFG!");
       }
       catch(Exception e){
        System.out.println("Exception occured");
       }
       // finally block is something which always gets executed no matter the fact of program. It is generally used for closing any scanners or files.
       finally{
        scanner.close();
        System.out.println("this will always print");
       }
    }
}
