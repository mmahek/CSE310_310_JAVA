// import java.util.Scanner;
// public class BinarySearch {
//     public static boolean binarySearch(int[] arr, int high, int low, int key){
//         if(low>high){
//             return false;
//         }
//         int mid = low + (high - low)/2;
//         if(arr[mid] == key){
//             return true;
//         }
//         else if(arr[mid] > key){
//             return binarySearch(arr, mid - 1, low, key);
//         }
//         else{
//             return binarySearch(arr, high, mid+1, key);
//         }
//     }

//     public static void main(String[] args) {
//         Scanner s = new Scanner(System.in);
//         int[] array = { 23, 45, 67, 12, 1, 0, -1};
//         int n = array.length;
        
//         int high = n-1;
//         int low = 0;
//         //int mid = (low+high)/2;
//         System.out.println("Array is : ");
//         for(int i : array){
//             System.out.print(i + " ");
//         }

//         System.out.print("\nEnter key : ");
//         int key = s.nextInt();
//         boolean f = binarySearch(array, high, low, key);
//         System.out.println(f);
//     }
// }
// import java.util.Scanner;

// public class BinarySearch {
//     public static boolean binarySearch(int[] arr, int high, int low, int key) {
//         // Base case: If the low index becomes greater than the high index, the key is
//         // not found
//         if (low > high) {
//             return false;
//         }

//         int mid = low + (high - low) / 2;

//         if (arr[mid] == key) {
//             // Key is found at the middle index
//             return true;
//         } else if (arr[mid] > key) {
//             // Search in the left half
//             return binarySearch(arr, mid - 1, low, key);
//         } else {
//             // Search in the right half
//             return binarySearch(arr, high, mid + 1, key);
//         }
//     }

//     public static void main(String[] args) {
//         Scanner s = new Scanner(System.in);
//         int[] array = { 23, 45, 67, 12, 1, 0, -1 };
//         int n = array.length;

//         int high = n - 1; // Set high to the last index
//         int low = 0; // Set low to the first index
//         System.out.println("Array is : ");
//         for (int i : array) {
//             System.out.print(i + " ");
//         }

//         System.out.print("\nEnter key : ");
//         int key = s.nextInt();
//         boolean isFound = binarySearch(array, high, low, key);
//         System.out.println("Key found: " + isFound);
//     }
// }
 // Returns index of x if it is present in arr[l....r], else return -1
 public class BinarySearch{
    int binarySearch(int arr[], int l, int r, int x)
    {
        while (l <= r) {
            int mid = (l + r) / 2;
 
            // If the element is present at the
            // middle itself
            if (arr[mid] == x) {
                return mid;
 
            // If element is smaller than mid, then
            // it can only be present in left subarray
            // so we decrease our r pointer to mid - 1 
            } else if (arr[mid] > x) {
                r = mid - 1;
 
            // Else the element can only be present
            // in right subarray
            // so we increase our l pointer to mid + 1
            } else {
              l = mid + 1;
            }  
        }
 
        // We reach here when element is not present
        //  in array
        return -1;
    }
 
    // Driver method to test above
    public static void main(String args[])
    {
        BinarySearch ob = new BinarySearch();
 
        int arr[] = { 2, 3, 4, 10, 40 };
        int n = arr.length;
        int x = 10;
        int result = ob.binarySearch(arr, 0, n - 1, x);
 
        if (result == -1)
            System.out.println("Element not present");
        else
            System.out.println("Element found at index "
                               + result);
    }
}