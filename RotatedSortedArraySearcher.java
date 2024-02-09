// #include<vector>

// class Solution {
// public:
//     int search(std::vector<int>& nums, int target) {
//         int left = 0;
//         int right = nums.size() - 1;

//         while (left <= right) {
//             int mid = left + (right - left) / 2;

//             if (nums[mid] == target) {
//                 return mid;  // Target found, return its index
//             }

//             if (nums[left] <= nums[mid]) {
//                 // Left half is sorted
//                 if (nums[left] <= target && target < nums[mid]) {
//                     right = mid - 1;  // Target is in the left half
//                 } else {
//                     left = mid + 1;  // Target is in the right half
//                 }
//             } else {
//                 // Right half is sorted
//                 if (nums[mid] < target && target <= nums[right]) {
//                     left = mid + 1;  // Target is in the right half
//                 } else {
//                     right = mid - 1;  // Target is in the left half
//                 }
//             }
//         }

//         return -1;  // Target not found
//     }
// }
// ;
/*
public class RotatedSortedArraySearcher {

    public int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] == target) {
                return mid; // Target found, return its index
            }

            if (nums[left] <= nums[mid]) {
                // Left half is sorted
                if (nums[left] <= target && target < nums[mid]) {
                    right = mid - 1; // Target is in the left half
                } else {
                    left = mid + 1; // Target is in the right half
                }
            } else {
                // Right half is sorted
                if (nums[mid] < target && target <= nums[right]) {
                    left = mid + 1; // Target is in the right half
                } else {
                    right = mid - 1; // Target is in the left half
                }
            }
        }

        return -1; // Target not found
    }

    public static void main(String[] args) {
        RotatedSortedArraySearcher searcher = new RotatedSortedArraySearcher();
        int[] nums = { 4, 5, 6, 7, 0, 1, 2 };
        int target = 0;
        int result = searcher.search(nums, target);
        System.out.println("Index of " + target + ": " + result);
    }
}

 class Solution {
 public int search(int[] nums, int target) {
 int low = 0, high = nums.length - 1;
 while (low <= high) {
 int mid = low + (high - low) / 2;
 if (nums[mid] == target) {
 return mid;
 }
 if (nums[low] <= nums[mid]) {
 if (target >= nums[low] && target < nums[mid]) {
 high = mid - 1;
 } else {
 low = mid + 1;
 }
 } else {
 if (target > nums[mid] && target <= nums[high]) {
 low = mid + 1;
 } else {
 high = mid - 1;
 }
 }
 }
 return -1;
 }
}

class Solution {
    public int search(int[] nums, int target) {
        int low = 0, high = nums.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (nums[mid] == target) {
                return mid;
            }
            if (nums[low] <= nums[mid]) {
                if (target >= nums[low] && target < nums[mid]) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            } else {
                if (target > nums[mid] && target <= nums[high]) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }
        }
        return -1;
    }
}
*/
import java.util.*;

public class Main {
    public static void righttrotation(int arr[]) {

        int x = arr[arr.length - 1];
        for (int i = arr.length - 1; i > 0; i--) {
            arr[i] = arr[i - 1];
        }
        arr[0] = x;

    }

    public static void leftrotation(int arr[]) {
        int z = 3;
        while (z > 0) {
            int x = arr[0];
            for (int i = 0; i < arr.length - 1; i++) {
                arr[i] = arr[i + 1];
            }
            arr[arr.length - 1] = x;
            z--;
        }
        // x=arr[0];
        // for(int i=1;i<arr.length;i++){
        // arr[i-1]=arr[i];
        // }
        // arr[arr.length-1]=x;
    }

    public static int binarysearch(int arr[], int target) {
        int n = arr.length;
        int s = 0;
        int e = n - 1;
        while (s <= e) {
            int mid = (s + e) / 2;
            if (arr[mid] == target)
                return mid;
            else if (target < arr[mid])
                e = mid - 1;
            else
                s = mid + 1;
        }
        return -1;
    }

    public static int linearsearch(int arr[], int target) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            if (arr[i] == target)
                return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        // int target=sc.nextInt();

        // System.out.println( linearsearch(arr,target) );

        // leftrotation(arr);
        righttrotation(arr);
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}*/