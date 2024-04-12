import java.util.Scanner;
class MyException extends Exception{
    public String toString(){
        return " I am toString()";
    }
    public String getMessage(){
        return " I am getMessage()";
    }
}

public class ExceptionClass {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a:");
        int a = s.nextInt();

        if(a < 9){
            try{
                //throw new MyException();
                throw new ArithmeticException("This is a new Exception");
            }
            catch(Exception e){
                System.out.println(e.getMessage());
                System.out.println(e.toString());
                System.out.println(e);
                e.printStackTrace(); // helps in identifying which error occured in which line
                System.out.println("Finish");
            }
        }
    }
}
