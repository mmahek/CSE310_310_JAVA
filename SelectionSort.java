public class SelectionSort {
    /*public static int[] selectionSort(int[] arr){
        int n = arr.length;

        for(int i = 0 ; i < n - 1 ; i++){
            int minIndex = i;

            for(int j = i + 1 ; j < n ; j++){
                if( arr[j] < arr[minIndex] ){
                    minIndex = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
        return arr;
    }
    public static void main(String[] args) {
        /*int[] arr = { 22, 31, 0, 8, 16 };
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;

            // Find index of the minimum element in the unsorted part of the array
            for (int j = i + 1; j < n; j++) {
                if (arr[minIndex] > arr[j]) {
                    minIndex = j;
                }
            }

            // Swap the found minimum element with the forst element of the unsorted part
            int t = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = t;

        }
        System.out.println("Sorted Array:");
        for (int k : arr) {
            System.out.println(k);
        }

        int[] array1 = { 2,4,3,1,0 };

        System.out.println(c);
        System.out.println("Sorted Array is: ");
        for(int i : selectionSort(array1)){
            System.out.println(i);
        }        
    }*/

    public static int[] selectionSort(int[] arr){
        for(int i = 0; i < arr.length ; i++){
            int minIndex = i;
            for(int j = i + 1 ; j < arr.length ; j++){
                if(arr[j] < arr[minIndex]){
                    arr[j]        = arr[j] ^ arr[minIndex];
                    arr[minIndex] = arr[j] ^ arr[minIndex];
                    arr[j]        = arr[j] ^ arr[minIndex];

                }
            }
        }
        return arr;
    }
    public static void main(String[] args){
        int[] array = { 12, 43, 2, 8, 16 };
        System.out.println("Sorted Array:");
        for(int k : selectionSort(array)){
            System.out.println(k);
        }
    }
}
