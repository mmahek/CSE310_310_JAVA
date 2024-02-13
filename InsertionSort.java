public class InsertionSort {
   public static int[] insertionSort(int[] arr){
        int n = arr.length;
        for(int i = 1 ; i < n ; i++){
            int key = arr[i];
            int j = i - 1;
            while(j >= 0 && key < arr[j]){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = key;
        }
   return arr;
   }

   public static void main(String[] args){
    int[] array = { 23, 43, 1, 12, 9};

    System.out.println("Sorted Array :");
    for(int i : insertionSort(array)){
        System.out.println(i);
    }
   }
}

/*
 * public static int[] insertionSort(int[] arr){
 * int n = arr.length;
 * for (int i = 1; i < n; i++) {
 * int j = i - 1;
 * int key = arr[i];
 * 
 * while (j >= 0 && key < arr[j]) {
 * arr[j + 1] = arr[j];
 * j--;
 * }
 * arr[j+1] = key;
 * }
 * return arr;
 * }
 * public static void main(String[] args) {
 * int[] arr = { 16, 23, 8, 0, 11};
 * System.out.println("Sorted array:");
 * for(int i : insertionSort(arr)){
 * System.out.println(i);
 * }
 * 
 * }
 */
/*
 * public static int[] insertionSort(int[] arr) {
 * int n = arr.length;
 * 
 * for (int i = 1; i < n; i++) {
 * int key = arr[i];
 * int j = i - 1;
 * 
 * // Move elements of arr[0..i-1] that are greater than key
 * // to one position ahead of their current position
 * while (j >= 0 && key < arr[j]) {
 * arr[j + 1] = arr[j];
 * j--;
 * }
 * 
 * arr[j + 1] = key;
 * }
 * return arr;
 * }
 * 
 * public static void main(String[] args) {
 * int[] myArray = { 16, 23, 8, 0, 21 };
 * 
 * System.out.println("Sorted array:");
 * for(int i : insertionSort(myArray)){
 * System.out.println(i);
 * }
 * }
 */