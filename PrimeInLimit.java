
import java.util.Scanner;

public class PrimeInLimit {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the lower limit: ");
        int low = s.nextInt();
        System.out.print("Enter the uperṇ limit: ");
        int high = s.nextInt();
        method(low, high); // Example range: 10 to 50
    }

    public static void method(int low, int high) {
        for (int num = low; num <= high; num++) {
            int flag = 0; // Reset flag for each number
            for (int i = 2; i <= Math.sqrt(num); i++) { //Optimization - Math.sqrt(num)
                if (num % i == 0) {
                    flag = flag + 1;
                    break; // No need to continue checking if a factor is found
                }
            }
            if (flag == 0 && num > 1) {
                System.out.println(num);
            }
        }
    }
}

// import java.util.Scanner;
// public class PrimeInLimit{
//     public static void main(String[] args) {
//         Scanner s = new Scanner(System.in);
//         System.out.print("Enter upper limit:");
//         int upperLimit = s.nextInt();
//         System.out.println("Prime Numbers in given Limit are: ");

//         for(int i = 2 ; i < upperLimit ;i++){
//             int flag = 0;
//             for(int j = 2 ; j < i/2 ; j++){
//                 if(i%j==0){
//                     flag = flag + 1;
//                     break;
//                 }
//             }
//             if(flag == 0 & i > i ){
//                 System.out.println(i);
//             }
//         }
//     //     for(int i=0;i<2;i=i+1){
//     //      for(int j=0;j<2;j=j+1){
//     //        if(j==1) 
//     //        break;
//     //        System.out.println(j + " ");
//     //      }
//     //    } 
//     }
// }