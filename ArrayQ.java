// import java.util.Scanner;

// public class ArrayQ{
//     public static void main(String[] args) {
//         Scanner s = new Scanner(System.in);
//         System.out.println("Enter the size of array:");
//         int n = s.nextInt();
//         int[] arr = new int[n];
//         System.out.print("ENter the taget: ");
//         int target = s.nextInt();
//         System.out.println("enter the elements of array");
//         for(int i = 0 ; i < n ; i++){
//             System.out.println("Enter the arr[" + i + "] : " );
//             arr[i] = s.nextInt();
//         }
//         boolean isPresent = true;
//         int index = -1;
//         for(int i= 0; i< arr.length; i++){
//             if(arr[i]==target){
//                 isPresent = true;
//                 index = i;
//                 break;
//             }
//             else{
//                 isPresent = false;
                
//             }
//         }
//         if(isPresent==false){
//             System.out.println("Targe not present in array");
//         }
//         else{
//             System.out.println("The target is found at " + index);
//         }
//     }
// }
// import java.util.Scanner;

// public class ArrayQ {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);

//         System.out.print("Enter the size of the array: ");
//         int size = getInput(scanner);

//         int[] arr = new int[size];

//         System.out.print("Enter the target value: ");
//         int target = getInput(scanner);

//         System.out.println("Enter the elements of the array:");
//         for (int i = 0; i < size; i++) {
//             System.out.print("Enter arr[" + i + "]: ");
//             arr[i] = getInput(scanner);
//         }

//         int index = findTargetIndex(arr, target);

//         if (index == -1) {
//             System.out.println("Target not present in the array.");
//         } else {
//             System.out.println("The target is found at index " + index);
//         }
//     }

//     private static int getInput(Scanner scanner) {
//         while (!scanner.hasNextInt()) {
//             System.out.println("Invalid input. Please enter a valid integer.");
//             scanner.next(); // consume invalid input
//         }
//         return scanner.nextInt();
//     }

//     private static int findTargetIndex(int[] arr, int target) {
//         for (int i = 0; i < arr.length; i++) {
//             if (arr[i] == target) {
//                 return i;
//             }
//         }
//         return -1;
//     }
//}
import java.util.Scanner;

public class ArrayQ {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = getInput(scanner);

        int[] arr = new int[size];

        System.out.print("Enter the target value: ");
        int target = getInput(scanner);

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            System.out.print("Enter arr[" + i + "]: ");
            arr[i] = getInput(scanner);
        }

        int index = findTargetIndex(arr, target);

        if (index == -1) {
            System.out.println("Target not present in the array.");
        } else {
            System.out.println("The Target is found at index " + index);
        }
    }

    private static int getInput(Scanner scanner) {
        while (!scanner.hasNextInt()) {
            System.out.println("Invalid input. Please enter a valid integer.");
            scanner.next(); // consume invalid input
        }
        return scanner.nextInt();
    }

    private static int findTargetIndex(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }
}
/*int x=arr[0]
for(int i=0;i<arr.length-1;i++){
arr[i]=arr[i+1]
}
arr[arr.length-1]=x
x=arr[0];
for(int i=1;i<arr.length;i++){
arr[i-1]=arr[i]
}
arr[arr.length-1]*/