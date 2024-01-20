import java.util.Scanner;
public class ElseIf {
    public static void main(String[] args) {
        /*int age;
        System.out.print("Enter your age: ");
        Scanner sc = new Scanner(System.in);
        age = sc.nextInt();
        if(age > 56){
            System.out.println("Your are experienced!");
        }
        else if(age > 46){
            System.out.println("You are semi-experienced!");
        }
        else if(age>36){
            System.out.println("You are semi-semi-experienced!");
        }
        else{
            System.out.println("You are not experienced!");
        }*/

        String month ;
        System.out.print("ENter the month :");
        Scanner s = new Scanner(System.in);
        month = s.nextLine();
        switch (month) {
            case "January":
                System.out.println("HAppy new Year!");
                break;
            case "April":
            System.out.println("This is my birthday month");
            break;

            case "July":
            System.out.println("This is start of second half of year");
            break;
            default:
            System.out.println("This is 2024");
                break;
        } 
    }
}
