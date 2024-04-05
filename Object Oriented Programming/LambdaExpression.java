interface Demo{
    void meth1(String a);
}
// class MahekFunc implements Demo{
//     @Override
//     public void meth1() {
//         System.out.println("Inside meth1");
//     }
    
// }
public class LambdaExpression {
    public static void main(String[] args) {
        
        // Demo obj = new MahekFunc();
        // obj.meth1();

        // Lambda Expressions
        Demo obj = (a) -> {
            System.out.println("I am meth1 " + a);
        };
        obj.meth1("Mahek");
    }
}
