class Phone {
    public void showTime() {
        System.out.println("Time is 8 PM");
    }

    public void on() {
        System.out.println("Turningon Phone");
    }
}

class SmartPhone extends Phone {
    public void music() {
        System.out.println("playing music");
    }

    public void on() {
        System.out.println("Turning on Smartphone");
    }
}

public class DynamicMethodDispatch {
    public static void main(String[] args) {
        // Phone obj = new Phone(); // object is created on runtime
        // SmartPhone smobj = new SmartPhone();
        // obj.name();

        Phone obj = new SmartPhone(); // Smartphone ko phone keh ke pukar rahe hain
        // Dynamic Method Dispatch - Runtime Polymorphism because it is decided that
        // which method will run at runtime as object is created at runtime.
        // Reference of super class = Object of Subclass

        // SmartPhone obj2 = new Phone(); // Not allowed
        obj.showTime(); // SmartPhone's method
        obj.on();
        // obj.music();
    }
}
// Why not allowed?
// - In Java, inheritance follows an "is-a" relationship. This means that a subclass object can be assigned to a superclass reference variable because a subclass "is-a" superclass. This allows for polymorphic behavior, where the superclass reference variable can refer to different subclass objects.
// However, the reverse is not true. A superclass object cannot be assigned to a subclass reference variable. This is because a superclass may not have all the properties and behaviors of its subclass. If you try to assign a superclass object to a subclass reference variable, you risk losing access to methods or properties specific to the subclass.
// In the statement SmartPhone obj2 = new Phone();, you're attempting to assign a Phone object to a SmartPhone reference variable. However, a Phone object doesn't necessarily have all the methods or properties defined in the
// SmartPhone class. Therefore, this assignment is not allowed by the Java compiler to prevent potential runtime errors where methods or properties specific to SmartPhone might be invoked on a Phone object that doesn't support them.


