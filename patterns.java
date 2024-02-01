public class patterns {
    static void pattern1(int m){
        int n = 1;
        System.out.println("Pattern 1: ");
        while (n < 5) {// run the following 4 times
            for (int j = 1; j <= m; j++) {
                System.out.print(n + " ");// 4 4 4 4
            }
            System.out.println();// \n
            n++;
        }
        // 1 1 1 1
        // 2 2 2 2
        // 3 3 3 3
        // 4 4 4 4
        System.out.println();
    }

    static void pattern2(int m){
        int n = 1;
        System.out.println("Pattern 2: ");
        while (n < 5) {// run the following 4 times
            for (int j = 1; j <= m; j++) {
                System.out.print(j + " ");// 4 4 4 4
            }
            System.out.println();// \n
            n++;
        }
        // 1 2 3 4
        // 1 2 3 4 
        // 1 2 3 4
        // 1 2 3 4
        System.out.println();
    }

    static void pattern3(int m){
        System.out.println("Pattern 3: ");
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
        // 1
        // 22
        // 333
        // 4444
        System.out.println();
    }
    static void pattern4(int m){
        System.out.println("Pattern 4: ");
        for (int i = 1; i <= m; i++) {
            for (int l = 1; l <= i; l++) {
                System.out.print(l + " ");
            }
            System.out.println();
        }
        // 1
        // 12
        // 123
        // 1234
        System.out.println();
    }
    static void pattern5(int n){
        System.out.println("Pattern 5: ");
        for(int i = 0 ; i < 4 ; i++){
            for(int j = 0 ; j < n ; j++){
                System.out.print("4 ");
            }
            System.out.println();
        }
        // 4 4 4 4 
        // 4 4 4 4
        // 4 4 4 4
        // 4 4 4 4
        System.out.println();
    }

    static void pattern6(int n){
        System.out.println("Pattern 6: ");
        int m = 1;
        for(int i = 1 ; i <= 4 ; i++){ // Line Change
            for(int j = 1 ; j <= i ; j++){ // No of terms printed
                System.out.print(m + " ");
                m++; // increment 
            }
            System.out.println();
        }
        // 1
        // 2 3
        // 4 5 6
        // 7 8 9 10
        System.out.println();
    }
    public static void main(String[] args) {
        pattern1(4);
        pattern2(4);
        pattern3(4);
        pattern4(4);
        pattern5(4);
        pattern6(4);
    }
}

