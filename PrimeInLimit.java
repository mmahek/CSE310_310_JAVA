
// public class PrimeInLimit {
//     public static void main(String[] args) {
//         public static void method(int low, int high){
//             int flag = 0;
//             for(int num = low ; num <= high ; num++){
//                 for(int i = 2 ; i < num/2 ; i++){
//                     if(num%i==0){
//                         flag = flag+1;
//                     }
//                 }
//                 if(flag==0){
//                     System.out.println(num);
//                 }
//             }
//         }
//     }
// }
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
            for (int i = 2; i <= num / 2; i++) {
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
