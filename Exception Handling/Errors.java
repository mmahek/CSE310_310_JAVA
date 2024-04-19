import java.util.Scanner;
public class Errors {
    public static void main(String[] args) {
        // Errors are our constant companions. With practice, we can only better at catching and correcting them.

        //Types of Errors:- 
        // - 1.Sysntax Error - Compiler finds something wrong with program, it throws Syntax errors
        int a = 5;
        /* b = 9; // If b is not defined and intialized or datatype is not mentioned then it becomes syntax error
        System.out.println(a+b);

        IDE can identify the Syntax Errors and can also suggest corrections.
        */

        /*- 2.Logical Errors - A logical error also known as bug, occurs when a program compiles and runs but does the wrong thing eg.-
        -   message delivered wrongly
        -   Wrong time of chats being displayed
        -   incorrect redirects
        
        IDE cannot differenitiate logical errors thus nor it can suggest corrections.
        */
        for(int i = 1 ; i < 5 ; i++){
            System.out.println(2*i+1);
        }

        // NOTE - Syntax and Logical errors are encountered by programmers whereas Runtime errors are encountered by Users.

        /*- 3.Runtime Errors:- Java may sometimes encounter errors while the program is running. These are also called exceptions(only this case). These are encountered due to circumstances like bad input or resource constraints. It occurs due to error at third party or something other than programming issue
        */
        int k;
        System.out.print("Enter k : ");
        Scanner sc = new Scanner(System.in);
        k = sc.nextInt();
        System.out.println("Integer part of 1000 divided by k = " + 1000/k);
         
    }
}
