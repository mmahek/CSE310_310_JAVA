public class MultiplicationOfArray {
    public class ArrayProduct {

        public static int[][] multiplyArrays(int[][] array1, int[][] array2) {
            int rows1 = array1.length;
            int cols1 = array1[0].length;
            int rows2 = array2.length;
            int cols2 = array2[0].length;

            if (cols1 != rows2) {
                throw new IllegalArgumentException(
                        "Number of columns in the first array must be equal to the number of rows in the second array.");
            }

            int[][] result = new int[rows1][cols2];

            for (int i = 0; i < rows1; i++) {
                for (int j = 0; j < cols2; j++) {
                    for (int k = 0; k < cols1; k++) {
                        result[i][j] += array1[i][k] * array2[k][j];
                    }
                }
            }

            return result;
        }

        public static void printArray(int[][] array) {
            for (int[] row : array) {
                for (int element : row) {
                    System.out.print(element + " ");
                }
                System.out.println();
            }
        }

        public static void main(String[] args) {
            int[][] array1 = {
                    { 1, 2, 3 },
                    { 4, 5, 6 }
            };

            int[][] array2 = {
                    { 7, 8 },
                    { 9, 10 },
                    { 11, 12 }
            };

            try {
                int[][] result = multiplyArrays(array1, array2);

                System.out.println("Product of the two arrays:");
                printArray(result);
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    /*public static int[][] multiplyArrays(int[][] arr1, int[][] arr2) {
        int rows1 = arr1.length;
        int cols1 = arr1[0].length;
        int rows2 = arr2.length;
        int cols2 = arr2[0].length;

        // Check if dimensions are compatible for multiplication
        if (cols1 != rows2) {
            return null; // Arrays not compatible for multiplication
        }

        int[][] product = new int[rows1][cols2];

        // Nested loop for element-wise multiplication
        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < cols2; j++) {
                for (int k = 0; k < cols1; k++) {
                    product[i][j] += arr1[i][k] * arr2[k][j];
                }
            }
        }

        return product;
    }

    public static void main(String[] args) {
        int[][] arr1 = { { 1, 2, 3 }, { 4, 5, 6 } };
        int[][] arr2 = { { 7, 8 }, { 9, 10 }, { 11, 12 } }; // Compatible dimensions

        int[][] product = multiplyArrays(arr1, arr2);

        if (product != null) {
            for (int[] row : product) {
                for (int element : row) {
                    System.out.print(element + " ");
                }
                System.out.println();
            }
        } else {
            System.out.println("Arrays cannot be multiplied. Incompatible dimensions.");
        }
    }

    public static int[][] Multiplication(int[][] arr1, int[][] arr2){
        if(arr1.length == arr2.length  &&  arr1[0].length == arr2[0].length){
            int row = arr1.length ;
            int col = arr1[0].length;

            int[][] m = new int[row][col];

            for(int i = 0 ; i < row ; i++){
                for(int j= 0 ; j < col ; j++){
                    m[i][j] = arr1[i][j] * arr2[i][j];
                }
            }
            return m;
        }
        else{
            return null;
        }
    }

    public static void main(String[] args) {
        int[][] arr1 = { {1, 2, 3}, {4, 5, 6}};
        int[][] arr2 = { {1, 2}, {4, 5}};

        //System.out.println(Multiplication(arr1, arr2));
        int[][] product = Multiplication(arr1, arr2); 
        for(int[] row : product){
            for(int num : row){
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
    
}

public class MultiplicationOfArray {

    public static int[][] multiplyArrays(int[][] arr1, int[][] arr2) throws IllegalArgumentException {
        if (arr1.length != arr2.length || arr1[0].length != arr2[0].length) {
            throw new IllegalArgumentException("Arrays must have the same dimensions!");
        }

        int rows = arr1.length;
        int cols = arr1[0].length;
        int[][] result = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = arr1[i][j] * arr2[i][j];
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[][] arr1 = { { 1, 2, 3 }, { 4, 5, 6 } };
        int[][] arr2 = { { 11, 22, 33 }, { 44, 55, 66 } };

        try {
            int[][] product = multiplyArrays(arr1, arr2);
            for (int[] row : product) {
                for (int num : row) {
                    System.out.print(num + " ");
                }
                System.out.println();
            }
        } catch (IllegalArgumentException e) {
            System.err.println(e.getMessage());
        }
    }
}
*/
}