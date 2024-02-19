import java.util.Scanner;
// public class triangle {
//     public static void main(String[] args) {
//         // Scanner s = new Scanner(System.in);
//         // System.out.print("Enter the num: ");
//         // int n = s.nextInt();
//         int n = 3;

//         for(int i =  1 ; i <= n ; i++){
//             for(int j = 1 ; j <= n ; j++){
//                 System.out.print(" ");
//             }
//             for(int j = 1 ; j <=i ; j++){
//                 System.out.println(j);
//             }
//             for(int j = i ; j >= n ; j--){
//                 System.out.println(j);
//             }
//         }
//     }
// }
public class triangle {
    public static void main(String[] args) {
        int i = 0, j = 0, k = 0;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the num: ");
        int n = s.nextInt();

        for (i = 0; i < n; i++) { // number of rows
            k = 1; // rese123
            //tating k for each new row
            for (j = 0; j < (n + i ); j++) { // number of columns in each row
                if (j < n - i - 1) // what will be printed in the each column
                    System.out.print("  ");
                else {
                    System.out.print(" " + k);
                    if (j < (n - 1))
                        k++;

                    else
                        k--;
                }
            }
            System.out.println(" ");
        }
    }

}