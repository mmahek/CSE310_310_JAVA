abstract class A{
    public abstract void show();
    public abstract void config();
}
class B extends A{ // Entire purpose of this class b is to Override and implment show method
    public void show(){
        System.out.println("In B show");
    }
    public void config() {
        System.out.println("In B config");
        
    }
}
public class AbstractAnonymous {
    public static void main(String[] args) {
        A obj1 = new B();
        // whenever implementation of abstract class or interface is for once, the concept of anonymous class is very helpful
        A obj2 = new A(){ // object is created for anonymous inner class below
            // implementation of abstract class
            public void show(){
                int b = 234;
                int a = String.valueOf(b).length();
                System.out.println(a);
            }
            public void config(){
                System.out.println("In new config");
            }
        };
        obj1.show(); // implementing show() method by inheriting class
        obj2.show(); // implementing show() method by abstract class anonymous inner class
        obj1.config(); // implementing show() method by inheriting class
        obj2.config();
    }
}
