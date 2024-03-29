interface sampleInterface{
    void method1();
    void method2();
}
interface childInterface extends sampleInterface{
    void method3();
    void method4();
}
class MySampleClass implements childInterface{
    public void method1(){
        System.out.println("Method 1");
    }
    
    public void method2() {
        System.out.println("Method 2");
    }
    
    public void method3() {
        System.out.println("Method 3");
    }

    public void method4() {
        System.out.println("Method 4");
    }
}
public class InheritanceInterface {
    public static void main(String[] args) {
        MySampleClass s1 = new MySampleClass();
        s1.method1();
        s1.method2();
        s1.method3();
        s1.method4();
    }
}
