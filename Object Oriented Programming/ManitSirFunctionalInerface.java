interface I1{ // SAM ( Single abstarct method)
    int i = 20; // every field inside interface is by default public static and final
    static void print1(){
        System.out.println("non - abstarct function is called");
    }
    void print(); // abstract method
}
// class Example implements I1{
//     // Override abstarct method of interface
//     public void print(){
//         System.out.println("Inside overriden print method");
//     }
// }
class I2{
    static int i = 20;
}
public class ManitSirFunctionalInerface {
    public static void main(String[] args) {
        //System.out.println(I1.i); -- correc
        System.out.println(I2.i);

        //Example e1 = new Example(); //  creating object of example class to call overriden function
        //I1 obj = new I1(); -- cannot create object of interface as it is abstarct
        I1 ref = ()-> System.out.println(I1.i); // assigning the reference to Interface
        //ref.print1(); -- error: illegal static interface method call
        I1.print1();
        
        //I1.print1();
        // I1.print(); //-- incomplete property is not accessible

        //e1.print();
    }
}
