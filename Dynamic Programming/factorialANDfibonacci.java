// kmp, z algo,Manachers
public class factorialANDfibonacci {
    public static int Factorial(int num){
        if(num==0 || num ==1){
            return 1;
        } else {
        return num*Factorial(num-1);}
    }

    public static int fibonacci(int term){
        if(term <= 1){
            return term;
        } else{
            return fibonacci(term -1 ) + fibonacci(term -2);
        }
    }
    
    public static void main(String[] args) {
        // Factorial 
        int f = Factorial(4);
        System.out.println("Factorial of 4 is " + f);
        //Fibonacci Series
        int fib = fibonacci(7);
        System.out.println(fib);
    }
}
