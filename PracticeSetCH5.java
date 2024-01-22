import java.util.Scanner;
public class PracticeSetCH5 {
    public static void main(String[] args) {
        /*Question 1:
        byte a = 4;
        for(int i = a ; i > 0 ; i--){
            for(int j = 0 ; j < i ; j++){
                System.out.print("* ");
            }
            System.out.println(" ");
        }*/

        /*Question 2: 
        int num ;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the limit: ");
        num = sc.nextInt();
        int sum = 0;
        //System.out.println(num);
        for(int i  = 0 ; i <= num ; i++){
            if(i%2==0){
                sum+=i;
            }
        }
        System.out.println("Sum of even numbers till " + num + " = " + sum);
    }*/

    /*Question 3: 
    int num;
    Scanner sc = new Scanner(System.in);
    int product = 1;
    System.out.print("Enter the num: ");
    num = sc.nextInt();
    for(int i  = 1 ; i < 11 ; i++){
        product = num*i;
        System.out.println(num + " * " + i + " = " +  product);
    }*/

    /*Question 4: 
    int fact = 1;
    int num;
    Scanner ss= new Scanner(System.in);
    System.out.print("Enter the num: ");
    num = ss.nextInt();

    for(int i = 1 ; i <= num  ; i++){
        fact = fact*i;
    }
    System.out.println("Factorial of " + num + " = " + fact);*/

    /*Question 6: */
    int fact = 1;
    int num;
    Scanner ss = new Scanner(System.in);
    System.out.print("Enter the num: ");
    num = ss.nextInt();

    while(num!=0){
        fact = fact*num;
        num= num-1;
    }
    System.out.println("Factorial of " + num + " = " + fact);
}
}
