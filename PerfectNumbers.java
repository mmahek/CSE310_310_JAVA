import java.util.Scanner;
public class PerfectNumbers { // 2^(p-1)*(2^p-1)
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.print(" low = ");
        int low = s.nextInt();
        System.out.print(" high = ");
        int high = s.nextInt();
        int sum = 0;
        System.out.print("Perfect Numbers in given limit are ");
        for (int j = low; j < high; j++) {
            for(int i = 1 ; i < j ; i++){
            if(j%i==0){
                sum = sum + i ;
            }
        }
        if(sum == j){
            System.out.print(" " + j);
        }
        sum = 0;
        }
        // int p = s.nextInt();
        // double p1 = Math.pow(2, (p-1));
        // double p2 = Math.pow(2, p);
        // int pn = (int) (p1*(p2-1));
        
        // System.out.print(pn);

    }
}
