public class Recurssion {
    static int factorialRecursive(int n){
        //factorial(n) = n * (n-1) * (n-2)....
        //factorial(n) = n * factorial(n-1);
        if(n==0 || n==1){
            return 1;
        }
        else{
            return n * factorialRecursive(n-1);
        }
    }
    static int factorialItrative(int n){
        int product = 1;
        for(int i = 1 ; i <= n ; i++){
            product = product * i;
        }
        return product;
    }
    public static void main(String[] args) {
        int n = 0;
        System.out.println("The value of factorial of " + n + " is " + factorialRecursive(n));
        System.out.println("The value of factorial of " + n + " is " + factorialItrative(n));
    }
}
