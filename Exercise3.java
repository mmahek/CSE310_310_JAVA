// Create a class game, Which allows a user to play "Guess the Number" game once. Game should have the following methods.
// 1. Constructor to generate the random number,
// 2. takeUserInput() to take a user input of number,
// 3. isCorrectNumber to detect whether the number entered by the user is true,
// 4. getter and setter for number of guesses,
// use properties such as noOfGuesses, etc to get this task done!
import java.util.Random;
import java.util.Scanner;
import java.util.random.*;
class game{
    public int num;
    public int inputNum;

    public int noOfGuessess;

    public int getNoOfGuesses(){
        return noOfGuessess;
    }

    public void setNoOfGuesses(int noOfGuessess) {
        this.noOfGuessess = noOfGuessess;
    }
    
    
    game(){
        Random rand = new Random();
        this.num = rand.nextInt(100);
    }
   

    void takeUserInput(){
        System.out.print("Guess the number:");
        Scanner sc = new Scanner(System.in);
        inputNum = sc.nextInt();
    }
    boolean isCorrectNum(){
        noOfGuessess++;
        if(num == inputNum){
            System.out.format("Yes you guessed it right, number was %d\nYou guessed it in %d attempts ", num, noOfGuessess);
            return true;
        }
        else if(num > inputNum){
            System.out.println("Too less...");
        }
        else if(num < inputNum){
            System.out.println("Too high..");
        }
        return false; 
        
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public int getInputNum() {
        return inputNum;
    }

    public void setInputNum(int inputNum) {
        this.inputNum = inputNum;
    }

    public int getNoOfGuessess() {
        return noOfGuessess;
    }

    public void setNoOfGuessess(int noOfGuessess) {
        this.noOfGuessess = noOfGuessess;
    }
}
public class Exercise3 {
    public static void main(String[] args) {
        game g = new game();
        boolean b = false;
        while(!b){
            g.takeUserInput();
            b = g.isCorrectNum();
            System.out.println(b);
        }
    }
}
