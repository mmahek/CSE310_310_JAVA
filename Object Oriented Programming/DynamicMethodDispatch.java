class Phone{
    public void showTime(){
        System.out.println("Time is 8 PM");
    }
    public void on(){
        System.out.println("Turningon Phone");
    }
}

class SmartPhone extends Phone{
    public void music(){
        System.out.println("playing music");
    }
    public void on(){
        System.out.println("Turning on Smartphone");
    }
}

public class DynamicMethodDispatch{
    public static void main(String[] args){
        // Phone obj = new Phone(); // object is created on runtime
        // SmartPhone smobj = new SmartPhone();
        // obj.name();

        Phone obj = new SmartPhone(); //Smartphone ko phone keh ke pukar rahe hain
        // Dynamic Method Dispatch - Runtime Polymorphism because it is decided that which method will run at runtime as object is created at runtime.
        // Reference of super class = Object of Subclass

        // SmartPhone obj2 = new Phone(); // Not allowed
        obj.showTime(); // SmartPhone's method
        obj.on();
        // obj.music();
    }
}