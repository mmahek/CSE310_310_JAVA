import java.util.Scanner;

public class CustomExceptions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter age: ");
        int age = scanner.nextInt();
        try {
            checkAge(age);
        } catch (AgeException e) {
            System.out.println("A problem occurred: " + e);
        }
    }

    static void checkAge(int age) throws AgeException {
        if (age < 18) {
            throw new AgeException("\nYou must be 18+ to sign up");
        } else {
            System.out.println("You are now signed up!");
        }
    }
}

class AgeException extends Exception {
    public AgeException(String message) {
        super(message);
    }
}

// Exceptions - an event after execution that disrupts the flow of program
// eg. ArithmeticException, ArrayIndexOutOfBoundException, InputMistmatch,
// FileNotFoundException

// Custom Exceptions - user defined exceptions
// eg. DuplicateEmailException, AgeException