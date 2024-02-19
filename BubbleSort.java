import java.util.Scanner;
public class bubbleSort {
    public static int[] bubbleSort(int[] arr){
        for(int i = 0 ; i < arr.length - 1 ; i++){
            for(int j = 0; j < arr.length - i - 1 ; j++){
                if(arr[j] > arr[j+1]){
                    arr[j]      = arr[j] ^ arr[j + 1];
                    arr[j+1]    = arr[j] ^ arr[j + 1];
                    arr[j]      = arr[j] ^ arr[j + 1];
                }
            }
        }
        return arr;
    }
    
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        //int[] array1 = { 14, 38, 39, 46, 9};
        int n = 5;
        int[] arr = new int[n];
        
        for(int i = 0 ; i < n ; i++ ){
            arr[i] = s.nextInt();
        }
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]) ;
        }
        System.out.println("Sorted array :");
        for(int k : bubbleSort(arr)){
            System.out.println(k);
        }
        
    }
}
