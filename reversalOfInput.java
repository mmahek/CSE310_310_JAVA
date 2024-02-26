/*public class reversalOfInput {
    public static void main(String[] args) {
    //        int i=0;
    //    for(;;){
    //      if( i==5)
    //      break;
    //      System.out.print(i++);
    //    }
    int p = 1;
    int ans = 0;
    int n = 123;
    while(n>0){
        int rem = n%10;
        int sq = rem*rem;
        ans = sq*p+ans;
        p*=10;
        if(sq>10){
            p=p*10;
            n=n/10;
        }
    }
    System.out.print(ans);
    System.out.println("lodu");
    }
}*/

import java.util.*;

public class reversalOfInput {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        // n=3
        // *
        // *1*
        // *121*
        // *12321*
        // *121*
        // *1*
        // *
        // n=4
        // ****
        // -****
        // --****
        // ---****
        // a number will be given to you
        // u have to print its fibnoccii number
        // input 6
        // output 8
        // 0 + 1 + 1 +2 +3 +5+ 8

        // input =0 output 0
        // input 1 output 1

        long p = 1;
        long ans = 0;
        while (n > 0) {
            long rem = n % 10; //
            long square = rem * rem;
            ans = square * p + ans;
            p *= 10;
            if (square > 10)
                p *= 10;
            n = n / 10;
        }
        System.out.print(ans);

        // int ans=0;
        // while(n>0){
        // int rem=n%10;
        // ans=ans*10+rem;
        // n=n/10;
        // }
        // System.out.println(ans);

        // Scanner s = new Scanner(System.in);
        // int n = s.nextInt();
        // for (int i = 2; i <= n; i++) {
        // boolean isPrime = true;
        // for (int j = 2; j <= Math.sqrt(i); j++) {
        // if (i % j == 0 ) {
        // isPrime = false;
        // break;
        // }
        // }
        // if (isPrime) {
        // System.out.print(i + " ");
        // }
        // }
        // int num = s.nextInt();

        // while(num != 0){
        // int rev = 0;
        // int rem = num % 10;
        // rev = rev * 10 + rem;
        // System.out.print(rev * rev);
        // num = num / 10;
        // }

        // int i=0;
        // for(;;){
        // System.out.print(i++);
        // if(i==5)
        // break;

        // }
        // for(int i=0;i<2;i=i+1){
        // for(int j=0;j<2;j=j+1){
        // if(j==1)
        // break;
        // System.out.print(j + " ");
        // }
        // }

        // for(int i=1;i<=10;i++){
        // System.out.print(i);
        // }
        // System.out.println();
        // for(int i=1;i<=10;i++){
        // for( i=1;i<=10;i++){
        // System.out.print(i);

        // }
        // }

        // 1 3 5 7
        // 3 5 7 1
        // 5 7 1 3
        // 7 1 3 5
        // Scanner s=new Scanner(System.in);
        // int n=s.nextInt();
        // for(int i=0;i<n;i++){
        // int a=2*i+1;
        // for(int j=0;j<(n-i);j++){
        // System.out.print(a +" ");
        // a+=2;
        // }
        // int b=1;
        // for(int j=0;j<i;j++){
        // System.out.print(b+" ");
        // b+=2;
        // }
        // System.out.println();
        // }
        // //1 3 5 7
        // //3 5 7 1
        // //5 7 1 3
        // //7 1 3 5
        // int n=4;
        // for(int i=1;i<=n;i++){
        // int c=2*i-1;
        // for(int j=1;j<=n;j++){
        // if(c > 2*n-1){
        // c=1;
        // System.out.print(c);
        // c+=2;
        // }
        // else{
        // System.out.print(c);
        // c=c+2;
        // }
        // }
        // System.out.println();
        // }

    }
}