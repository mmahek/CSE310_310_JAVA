public class MultiDimensionalArrays {
    public static void main(String[] args) {
       /* int [][] flats; // 2-D array
       flats = new int[2][3];

       flats[0][0] = 101;
       flats[0][1] = 102;
       flats[0][2] = 103;
       flats[1][0] = 201;
       flats[1][1] = 202;
       flats[1][2] = 203;
       
       //Diplaying array (for loop)
       System.out.println("Printing using for loop: ");
       for(int i = 0; i < flats.length ; i++){
            for(int j = 0 ; j < flats[i].length ; j++){
                    System.out.print(flats[i][j] + "  ");
            }
            System.out.println(" ");
        }*/

        int [][][] arr;
        arr = new int[2][3][4];

        arr[0][0][0] = 1;
        arr[0][0][1] = 2;

        arr[0][0][0] = 1;
        arr[0][1][1] = 2;

        arr[0][0][0] = 1;
        arr[21][0][1] = 2;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                for(int k = 0; k < arr[i][j].length ; k++){
                    System.out.print(arr[i][j][k] + "  ");
                }
            }
            System.out.println(" ");
        }
    }
}
