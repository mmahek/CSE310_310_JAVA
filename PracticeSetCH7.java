import java.util.Scanner;
public class PracticeSetCH7 {

    static void table(int n){
        int product = 1;
        for(int i = 1 ; i < 11 ; i++){
            product = n * i ;
            System.out.println(n + " * " + i + " = " + product);
        }
    } 

    static void starPattern(int n){
        for(int i = 1 ; i <= n ; i++){
            for(int j = 1 ; j <= i ; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    
    
    static int sumOfNaturalNumbers(int n){
        // for(int i = 0 ; i <= n ; i++){
        //     sum = sum + i;
        // }
        // System.out.println("The sum of " + n + " natural numbers is " + sum);
        if(n==1){
            return 1;
        }
        else if(n==0){
            return 0;
        }
        else{
            return n + sumOfNaturalNumbers(n - 1);
        }
    }

    static void invertedStar(int n){
        for(int i = n ; i > 0 ; i--){
            for(int j = i ; j > 0 ; j--){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
   
    static int nthTermOfFebonacci(int n){
        if(n==1 || n==2){
            return n-1;
        }
        else{
            return nthTermOfFebonacci(n-2) + nthTermOfFebonacci(n-1);
        }
    }

    static int averageOf(int ...arr){
        int average = 0;
        for(int a : arr){
            average += a; 
        }
        int l = arr.length;
        average = average/l;
        return average;        
    }


    static void StarRecursion(int n){
        if(n>0){
            StarRecursion(n-1);
            for(int i = 0 ; i < n ; i++){
                System.out.print(" *");
            }
            System.out.println();
        }
    }

    // pattern(n) + n+1times stars and newline
    // -> pattern(3) + 3 times star and new line
    // -> pattern(2) + 2 times star and new line + 3 times star and new line
    // -> pattern(1) + 1 times star and new line + 2 times star and new line + 3
    // times star and new line
    // -> pattern(0) + 0 times star and new line + 1 times star and new line + 2
    // times star and new line + 3 times star and new line

    static void invertedStarRecursion(int n){
        if(n>0){
            for(int i = n ; i > 0 ; i--){
                System.out.print(" *");
            }
            System.out.println();
            invertedStarRecursion(n-1);
        }
    }

    static void tempratureConverter(float c){
        float f = (1.8f * c) + 32;
        System.out.print("The temprature in fahrenheit is " + f);
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter value of n: ");
        // int n = s.nextInt();
        float f = s.nextFloat();

        // Question 1:
        //table(4);

        // Question 2:
        //starPattern(n);

        // Question 3:
        //int sum = sumOfNaturalNumbers(n);
        //System.out.println("The sum of " + n + " natural numbers is " + sum);

        // Question 4:
        //invertedStar(n);

        //Question 5:
        // int t = nthTermOfFebonacci(n);
        // System.out.println("The " + n + "th term of Fibonacci series is " + t);

        // Question 6:
        //System.out.println("The average of given inputs is " + averageOf(1,2,3,4,1000,6,7,8,9,10));

        // Question 7:
        //StarRecursion(6);

        // Question 8:
        // invertedStarRecursion(4);

        // Question 9:
        //tempratureConverter(f);
    }
}
