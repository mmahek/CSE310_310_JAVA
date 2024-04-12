import java.util.Scanner;
public class NestedTryCatch {
    public static void main(String[] args) {
        int [] marks = new int[3];
        marks[0] = 7;
        marks[1] = 56;
        marks[2] = 6;
        
        Scanner s = new Scanner(System.in);
        boolean flag = true;
        while(flag){
        System.out.print("Enter ind:");
        int ind = s.nextInt();
        try{
            System.out.println("Welcome to video number 81");
            try{
                System.out.println("The value at ind = " + ind + " is " + marks[ind]);
                flag = false;
            }
            catch (ArrayIndexOutOfBoundsException e){
                System.out.println("Sorry this index does not exists");
                System.out.println("Exception in Level 2");
            }
        }
        catch(Exception e){
            System.out.println("Exception in Level 1");
        }
    }
    System.out.println("Thanks for Using!");
    }
}
