public class bubbleSort {
    public static int[] BubbleSort(int[] arr){
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
        int[] array1 = { 14, 38, 39, 46, 9};
        System.out.println("Sorted array :");
        for(int k : BubbleSort(array1)){
            System.out.println(k);
        }
        
    }
}
