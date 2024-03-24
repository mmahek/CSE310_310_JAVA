import java.util.*;
abstract class Parent {
    public Parent() {
        System.out.println("main base class ki constructor hoon");
    }

    public void sayHello() {
        System.out.println("Hello");
    }

    abstract public void greet(); // Override this method as classes's wish
  }
class Child1 extends Parent{
    @Override
    public void greet(){
        System.out.println("SuPrabhat");
    }
}

public class AbstractClasses {
    public static void main(String args[]) {
        Child1 c1 = new Child1();
        // Parent p = new Parent(); --- error // cannot be instantiated
    }
    // Abstract - khayali pulao
    // Abstarct method - no implementation - no defination i.e did not tell what it does - only signature, no body
    // Abstarct methods are intended to be implemented by subclasses.
    // Abstract class - A class having abstract method, A standard for other classes to work , form on - these don't have objects. Ek Jariya hai, bas sahayta karti hai
    // Even 1 abstract method will make the whole class, just like 1 Dirty fish makes the whole pond dirty
    // Either you can make a concrete class using abstract class only thing to keep in mind is implement all the (abstract)methods of the class OR make another abstract class
    // Till all methods are applied, concrete class cannot be made, thus object cannot be made
}
