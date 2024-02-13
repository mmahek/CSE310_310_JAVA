public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = { 22, 13, 32, 8, 16 };
        int n = arr.length;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < n - 1; i++) {
            for (int j = i; j < n - 1; j++) {
                if (min > arr[j]) {
                    min = arr[j];
                }

                // System.out.println(min);
                arr[j] = arr[i];
                arr[i] = min;
                min = arr[j];
            }
        }
        for (int k : arr) {
            System.out.println(k);
        }
    }
}
