public class CharaterPatterns {
    static void pattern1(int n){

        for(int i = 1 ; i <= n ; i++){
            char ch = 'A';
            for(int j = 1 ; j <= i ; j++) {
                System.out.print(ch++);
            }
            System.out.println();
        }
        // A
        // AB
        // ABC
        // ABCD
    }
    static void pattern2(int n){
        for(int i = 0 ; i  <= n ; i++){
            char ch = (char)('A'+i-1);
            for(int  j = 1 ; j <= i ; j++){
                System.out.print(ch++);
            }
            System.out.println();
        }
    }
    static void pattern3(int n){
        int i = 0;
        while(i <n){
            int j = 0;
            char ch = (char)('A'+ i);
            while(j <= i ){
                System.out.print(ch++);
                j++;
            }
            System.out.println();
            i++;
        }
    }
    static void pattern4(int n){
        for (int i = 1; i <= n; i++) {
            int sum = 0;
            for (int j = 1; j <= i; j++) {
                sum += j;
                System.out.print(j);
                if (j < i) {
                    System.out.print("+");
                }
            }
            System.out.println("=" + sum);
        }
    }

    public static void main(String[] args) {
        pattern1(4);
        pattern2(4);
        pattern3(4);
        pattern4(10);

    }
}
