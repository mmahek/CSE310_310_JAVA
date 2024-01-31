public class patterns {
    public static void main(String[] args) {
        // int i = 1;
        // while (i <= 5) {
        //     if (i == 3)
        //         continue;
        //     System.out.print(i);
        //     i++;
        // }
        
        int n = 1;
        while(n<5){// run the following 4 times
            for(int j = 1 ; j < 5 ; j++){
                System.out.print(n);// 4 4 4 4
            }
            System.out.println();// \n
            n++;
        }
        // 1111
        // 2222
        // 3333
        // 4444
        n = 1;

        while (n < 5) {// run the following 4 times
            for (int j = 1; j < 5; j++) {
                System.out.print(j);// 4 4 4 4
            }
            System.out.println();// \n
            n++;
        }
        // 1234
        // 1234
        // 1234
        // 1234
        for(int i = 0 ; i < 5 ; i++ ){
            for(int j = 0 ; j < i ; j++){
                System.out.print(i);
            }
            System.out.println();
        }
        // 1
        // 22
        // 333
        // 4444
        for(int m = 1 ; m < 4 ; m++){
            for(int l = 1 ; l < m ; l++){
                System.out.print(l);
            }
            System.out.println();
        }
    }
}

// // //patern 1
// // //4 4 4 4
// // //4 4 4 4
// // //4 4 4 4
// // //4 4 4 4
// // // int n=4;
// // // for(int i=1;i<=n;i++){
// // // for(int j=1;j<=n;j++){
// // // System.out.print(n);
// // // }
// // // System.out.println();
// // // }

// // //pattern 2
// // //1 2 3 4
// // //1 2 3 4
// // //1 2 3 4
// // //1 2 3 4
// // // int n=4;
// // // int i=1;
// // // while(i<=n){
// // // int j=1;
// // // while(j<=n){
// // // System.out.print(j);
// // // j++;
// // // }
// // // System.out.println();
// // // i++;
// // // }

// // //pattern 3
// // //1 1 1 1
// // //2 2 2 2
// // //3 3 3 3
// // //4 4 4 4
// // int n=4;
// // int i=1;
// // while(i<=n){
// // int j=1;
// // while(j<=n){
// // System.out.print(i);
// // j++;
// // }
// // System.out.println();
// // i++;
// // }
// // //pattern 4
// //1
// //2 2
// //3 3 3
// //4 4 4 4
// // int n=4;
// // for(int i=1;i<=n;i++){
// // for(int j=1;j<=i;j++){
// // System.out.print(i);
// // }
// // System.out.println();
// // }

// //pattern 5
// //1
// //1 2
// //1 2 3
// //1 2 3 4
// // int n=4;
// // for(int i=1;i<=n;i++){
// // for(int j=1;j<=i;j++){
// // System.out.print(j);
// // }
// // System.out.println();
// // }

// //pattern 6
// // 1
// // 2 3
// // 4 5 6
// // 7 8 9 10
// int n=4;
// int a=1;
// for(int i=1;i<=n;i++){
// for(int j=1;j<=i;j++){
// System.out.print(a);
// a++;
// }
// System.out.println();
// }

// int i=1; //1 2 4 5
// while(i<=5){
// if((i)==3) {
// i++;
// continue; }
// System.out.print(i);
// i++;
// }

// int i=1;
// while(i<=5){
// System.out.print(i);
// if(i==3) break;
// i++;
// }

// for(int i=1;i<=5; i++;){
// if(i==3) continue;
// System.out.print(i);

// }

