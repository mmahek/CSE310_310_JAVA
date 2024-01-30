public class VarArgs {
    // static int sum(int a, int b) {
    //     return a + b;
    // }
    
    // static int sum(int a, int b, int c) {
    //     return a + b + c;
    // }
    
    //This makes compulsory argument for the method
    // static int sum(int x, int... arr) {
    //     // Availaible as int []arr;
    //     result = 0;
    //     for (int a : arr) {
    //         result += a;
    //     }
    //     return result;
    // }
    static int sum(int... arr) {
        // Availaible as int []arr;
        int result = 0;
        for (int a : arr) {
            result += a;
        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println("The sum of 4, 5 is " + sum(4, 5));
        System.out.println("The sum of 4, 5, 6 is " + sum(4, 5, 6));
        System.out.println("The sum is " + sum(4,0,10,11,1));
        System.out.println("The sum of Nothing is " + sum());
    }
}
