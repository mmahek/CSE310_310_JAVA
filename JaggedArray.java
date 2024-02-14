/*public class JaggedArray {
    public static void main(String[] args) {
        // int arr[][] = new int[n][n];
        // int arr[][] = new int[n][m];
        int arr[][] = new int[3][];
        arr[0]=new int[1];
        arr[1] = new int[2];
        arr[2]=new int[3];
        for(int i = 0 ; i < arr.length ; i++){
            for(int j = 0 ; j < arr[i].length ; j++){
                arr[i][j] = c++;
            }
        }
        for(int i = 0 ;i < arr.length ; i++){
            for(int j = 0 ; j  <arr[i].length ; j++){
                System.out.println(arr[i][j] + " ");
            }
            System.out.println();
        }

        // int arr[3][3] = {{ 1, 2, 3},{ 4, 5, 6},{ 7, 8, 9}};
        // int sum = 0;
        // for(int i = 0 ; i < 3 ; i++){
        //     for(int j = 0; j < 3 ; j++){
        //         sum = sum + arr[i][j];
        //     }
        //     sum =0;
        // }
        // System.out.println(sum);
       

    }
}*/
import java.util.Scanner;
public class JaggedArray {
// code for column sum
    public static void main(String[] args) {

        int[][] arr = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } }; // Create a 3x3 array with values
        int sum = 0;
        int k = 1;

        for (int rowIndex = 0; rowIndex < arr.length; rowIndex++) {
            for (int columnIndex = 0; columnIndex < arr[rowIndex].length; columnIndex++) {
                sum += arr[columnIndex][rowIndex]; // Add element to sum
            }
        System.out.println("The sum of all elements in column " + k + " is: " + sum);
        k++;
        sum = 0;
        }
        Scanner s = new Scanner(System.in);
        String ss = s.next();// takes input till a space arrives
        System.out.println(ss);

    }
}
