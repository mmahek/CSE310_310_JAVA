import java.util.Scanner;

public class intro {
    public static void main(String[] args) {
        int[] marks = new int[3];
        marks[0] = 7;
        marks[1] = 56;
        marks[2] = 6;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the array index: ");
        int ind = s.nextInt();

        System.out.println("Enter the a number you want to divide the value with: ");
        int number = s.nextInt();
        try {
            System.out.println("The value at array index entered is : " + marks[ind]);
            System.out.println("The value of array value / number is : " + marks[ind] / number);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException occured!");
            System.out.println(e);
        } 
        catch (ArithmeticException e) {
            System.out.println("ArithmeticException occured!");
        } 
        catch(Exception e){
            System.out.println("Some exception occured!");
        }
    }
}
