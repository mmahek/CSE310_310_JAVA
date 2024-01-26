import java.util.Scanner;

public class PracticeSetCH6 {
    public static void main(String[] args) {
        /*
         * Question 1:
         * float [] mahek;
         * mahek = new float[5];
         * float sum = 0.0f;
         * Scanner s = new Scanner(System.in);
         * for(int i = 0 ; i < 5 ; i++ ){
         * System.out.print("mahek["+ i +"] = ");
         * mahek[i] = s.nextFloat();
         * sum = sum+mahek[i];
         * }
         * System.out.println("Values input are: ");
         * for(int j = 0 ; j < 5 ; j++){
         * System.out.println("mahek[" + j + "] = " + mahek[j]);
         * }
         * System.out.println("Sum = " + sum);
         */

        /*
         * Question 2:
         * // Scanner s = new Scanner(System.in);
         * // System.out.print("Enter the name to search: ");
         * // String nameToSearch = s.nextLine();
         * String nameToSearch = "ahem";
         * String [] sectionGM = {"mahek", "arjun", "aaradhya", "bhim", "suraj",
         * "mishka"};
         * //sectionGM = new String[11];
         * 
         * // for(int i = 0 ; i < 11 ; i++){
         * // System.out.print("Enter name["+ i + "] = ");
         * // sectionGM[i] = s.nextLine();
         * // }
         * // for(int j = 0 ; j < 11 ; j++){
         * // System.out.println("sectionGM["+j+"]="+sectionGM[j]);
         * // }
         * int flag = 0;
         * for (int j = 0; j < 6; j++) {
         * if(sectionGM[j] == nameToSearch){
         * System.out.println("sectionGM[" + j + "] = " + sectionGM[j]);
         * 
         * flag = 1;
         * break;
         * }
         * }
         * if (flag == 0) {
         * System.err.println("Sorry, no match found!");
         * }else{
         * System.out.println("yes! match found");
         * }
         * /* Question 2:
         * String nameToSearch = "ahem";
         * String[] sectionGM = { "mahek", "arjun", "aaradhya", "bhim", "suraj",
         * "mishka" };
         * boolean isInArray = false;
         * for (String element : sectionGM) {
         * if (nameToSearch == element) {
         * isInArray = true;
         * break;
         * }
         * }
         * if (isInArray) {
         * System.err.println("Sorry, no match found!");
         * } else {
         * System.out.println("yes! match found");
         * }
         */
        /*
         * Question 3:
         * Scanner m = new Scanner(System.in);
         * System.err.print("Enter the strength of students: ");
         * int strengthOfStudents = m.nextInt();
         * int [] physicsMarks ;
         * int sum = 0;
         * physicsMarks = new int[strengthOfStudents];
         * System.err.println("Enter the marks: ");
         * for(int i = 0 ; i < strengthOfStudents ; i++){
         * System.out.print("physicsMarks[" + i + "] =");
         * physicsMarks[i] = m.nextInt();
         * sum = sum + physicsMarks[i];
         * }
         * System.out.println("Sum of marks : " + sum);
         * System.out.println("Average marks :  " + sum/strengthOfStudents);
         */

        /*
         * Question 4:
         * Scanner s = new Scanner(System.in);
         * int[][] arr1 = new int[2][3];
         * int[][] arr2 = new int[2][3];
         * // 1st array
         * System.out.println("Enter the values for array 1: ");
         * for (int i = 0; i < 2; i++) {
         * for (int j = 0; j < 3; j++) {
         * System.out.print("arr1[" + i + "][" + j + "] = ");
         * arr1[i][j] = s.nextInt();
         * }
         * }
         * System.out.println("Array is :");
         * for (int i = 0; i < 2; i++) {
         * for (int j = 0; j < 3; j++) {
         * System.out.print(arr1[i][j] + " ");
         * }
         * System.err.println("");
         * }
         * // 2nd Array
         * System.out.println("Enter the values for array 2: ");
         * for (int i = 0; i < arr1.length; i++) {
         * for (int j = 0; j < arr2.length; j++) {
         * System.out.print("arr2[" + i + "][" + j + "] = ");
         * arr2[i][j] = s.nextInt();
         * }
         * }
         * System.out.println("Array is :");
         * for (int i = 0; i < arr1.length; i++) {
         * for (int j = 0; j < arr2.length; j++) {
         * System.out.print(arr2[i][j] + " ");
         * }
         * System.err.println("");
         * }
         * // 3rd Array
         * 
         * int arr3[][] = new int[2][3];
         * 
         * System.out.println("Array is :");
         * for (int i = 0; i < arr3.length; i++) {
         * for (int j = 0; j < arr3.length; j++) {
         * System.out.print((arr1[i][j] + arr2[i][j]) + " ");
         * }
         * System.out.println("");
         * }
         */
        /* Question 5: 
        int[] arrRev = { 1, 3, 5, 7, 9, 85, 1 };
        int l = arrRev.length;
        int mid = Math.floorDiv(l, 2);
        
        for (int i = 0; i < mid; i++) {
           // Swapping values using temporary variable
            int temp = arrRev[i] ;
            arrRev[i] = arrRev[l-i-1];
            arrRev[l-i-1] = temp;
        }
        for (int element : arrRev) {
            System.out.print(element + " ");
        }*/
        // Swap the values using XOR
        /*
         * arrRev[i] = arrRev[i] ^ arrRev[l - i - 1];
         * arrRev[l-i-1] = arrRev[i] ^ arrRev[l - i - 1];
         * arrRev[i]= arrRev[i] ^ arrRev[l - i - 1];
         */
        /*Question 6: 
        int[] arr = { 2, 11, 4, 5, 6};
        int maxValue = Integer.MIN_VALUE;
        for(int element: arr){
            if( maxValue < element ){
                maxValue = element;
            }
        }
        System.out.println("Maximum Value is " + maxValue);*/

        /*Question7: 
        int[] arr = { 3, 4, 5, 6, 75, -11, -9};
        int minValue = Integer.MAX_VALUE;
        for(int element: arr){
            if(minValue > element){
                minValue = element;
            }
        }
        System.out.println("Minimum Value is " + minValue);*/
        /*Question 8: */
        int[] arr = { 1, 3, 5, 7, 9}; // { 3, 4, 5, 6, 75, -11, -9};
        boolean isSorted = true;
        for(int i = 0; i < arr.length-1 ; i++){
            if(arr[i] > arr[i+1]){
                isSorted = false;
            }
        }
        if(isSorted){
            System.out.println("The given Array is sorted.");
        }
        else{
            System.out.println("The given Array is unsorted.");
        }
    }
}
