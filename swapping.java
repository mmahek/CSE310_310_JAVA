public class swapping {
    public static void main(String[] args) {
        int a = 2;
        int b = 5;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        a = a^b;
        b = a^b;
        a = a^b;
        System.out.println( "a = " + a);
        System.out.println("b = " + b);
    }
}
