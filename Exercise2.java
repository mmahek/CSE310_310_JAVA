import java.util.*;
import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        String userInput;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter user's choice -> Rock/Paper/Scissors: ");
        userInput = sc.nextLine();

        Random ran = new Random();
        int nxt = ran.nextInt(3);
        String op = " ";

        if (nxt == 0) {
            op = "Rock";
        } else if (nxt == 1) {
            op = "Paper";
        } else if (nxt == 2) {
            op = "Scissors";
        }
        System.out.println("Computer's Choice -> " + op);
        // System.out.println(op);
        if (userInput.equals("Rock")) {
            if (op.equals("Rock")) {
                System.out.println("Game Tied");
            } else if (op.equals("Paper")) {
                System.out.println("Computer WINS!");
            } else if (op.equals("Scissors")) {
                System.out.println("User WINS!");
            }
        }

        if (userInput.equals("Paper")) {
            if (op.equals("Paper")) {
                System.out.println("Game Tied");
            } else if (op.equals("Scissors")) {
                System.out.println("Computer WINS!");
            } else if (op.equals("Rock")) {
                System.out.println("User WINS!");
            }
        }

        if (userInput.equals("Scissors")) {
            if (op.equals("Scissors")) {
                System.out.println("Game Tied");
            } else if (op.equals("Rock")) {
                System.out.println("Computer WINS!");
            } else if (op.equals("Paper")) {
                System.out.println("User WINS!");
            }
        }
    }
}
