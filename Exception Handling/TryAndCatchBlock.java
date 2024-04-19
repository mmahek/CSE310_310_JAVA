public class TryAndCatchBlock {
    public static void main(String[] args) {
        /* 
         An exception is an event that occurs when a program is executed disrupting the normal flow of instructions. There are mainly two types of exceptions in java.
         1. Checked Exception - Compile time exceptions(Handled by compiler)
         2. Unchecked Exception - Runtime exceptions

         Commonly occuring Exception - 
         a. NullPointer 
         b. Arithmetic
         c. ArrayIndexOutOfBound
         d. IlleagalArgument
         e. NumberFormat
         */
        try{
            int a = 6000; 
        int b = 0;
        int c = a/b;
        System.out.println("The result is " + c);
        }
        catch(Exception e){
            System.out.println("We failed to divide because of " + e);
        }
        System.out.println("End of the program");

        //Try and catch block saves program from unexpected interuptions
    }
}
