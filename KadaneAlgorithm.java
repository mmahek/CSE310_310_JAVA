public class KadaneAlgorithm {
    public static void main(String[] arg){
            int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
            int sum = 0; 
            int maxi = arr[0];

            for(int i = 0 ; i < arr.length ; i++){

                sum = sum + arr[i];

                maxi = Math.max(maxi, sum);

                if(sum < 0){
                    sum = 0;
                }
            }
            System.out.println("Maxi = " + maxi);
    }
}
