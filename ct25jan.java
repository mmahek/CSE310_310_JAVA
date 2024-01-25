import java.util.Scanner;
public class ct25jan {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String coffeeType = "";
        int size;
        String orderedSize;
        String customerOrder ;
            
        System.out.println("Enter coffee type: ");
        customerOrder = s.nextLine();
        switch (customerOrder) {
            case "latte":
                coffeeType = "Latte";
                break;
            case "espresso":
                coffeeType = "Espresso";
                break;
            case "cappuccino":
                coffeeType = "Cappuccino";
                break;
            default:
                coffeeType = "Please see the menu for the coffee type";
                break;
        }
        System.out.println("Enter size: ");
        size = s.nextInt();
        switch (size) {
            case 1:
                orderedSize = "Small";
                break;
            case 2:
                orderedSize = "Medium";
                break;
            case 3:
                orderedSize = "Large";
                break;
            case 4:
                orderedSize = "Extra Large";
                break;
            default:
                orderedSize = "Please check the menu for sizes";
        }
        System.out.println(orderedSize + " " + coffeeType + " is being prepared");
    }
}
