public class Question28March {
    public static void main(String[] args) {
        //Example 1
        // Interface1 ref = (int a, int b) -> System.out.println("Addition of a and b = " + (a + b));
        // ref.add(10, 20);

        // Interface1 ref2 = (a, b) -> (a*b); -- another way of doing below topic
        Interface1 ref2 = (a, b) -> {
            return (a * b);
        };
        int result = ref2.product(2, 4);
        System.out.println("Result = " + result);
       }
}

interface Interface1 {
    // Example 1
    //void add(int a, int b);

    int product(int a, int b);
}