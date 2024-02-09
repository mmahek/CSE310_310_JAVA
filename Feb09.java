import java.util.Scanner;

public class Feb09 {
    public class SearchMatrix {

        public static boolean searchMatrix(int[][] matrix, int target) {
            int rows = matrix.length;
            int cols = matrix[0].length;
            int left = 0;
            int right = rows * cols - 1;

            while (left <= right) {
                int mid = (left + right) / 2;
                int row = mid / cols;
                int col = mid % cols;

                if (matrix[row][col] == target) {
                    return true;
                } else if (matrix[row][col] < target) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }

            return false;
        }

        public static void main(String[] args) {
            int[][] matrix = { { 1, 3, 5, 7 }, { 10, 11, 16, 19 }, { 23, 24, 27, 31 } };
            int target = 16;

            boolean found = searchMatrix(matrix, target);
            System.out.println("Target " + target + " found in matrix: " + found);
        }
    }

    /*public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int n = s.nextInt();

        int[][] arr = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("Enter element at [" + i + ", " + j + "]: ");
                arr[i][j] = s.nextInt();
            }
        }

        System.out.println("\nThe array:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Enter the element to search:");
        int a = s.nextInt();
        int a1 =0;
        int a2 = 0;
        boolean isPresent = false;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(arr[i][j] == a){
                    isPresent = true;
                    
                    //System.out.println("Element found at i = " + i + " and j = " + j);
                    a1=i;
                    a2 = j;
                    break;
                }
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("isPresent : " + isPresent + " at i = " + a1 + " and j = " + a2);
    
    }*/
}
