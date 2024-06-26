class Base{
    public void method(){
        System.out.println("Inside the method");
    }
}

// class Child extends Base{
//     public void method(){ // method overriding
//         System.out.println("Inside new method");
//     }
// }

public class AnonymousClass {
    public static void main(String[] args) {
        //Base obj = new Base();

        // Base obj = new Child(); -- Object is of Child class but reference is of Base class thus OVERRIDING the behaviour of method
        // Since this class's only motive is to override method, it is taking much space and to enhance it we can use ANONYMOUS class
        
        Base obj = new Base(){//method overriding using Anonymous class
            public void method(){
                
                System.out.println("Inside Anonymous class's Method");
            }
        };
        obj.method();
        // Till now we have learned to make class and then to make its object, here we make object and then define its behaviour
        // This class is made inside of the main class and does not have any name thus is called as anonymous class
        // Anonymous class is not reusable, it is for single use
        // Anonymous class makes the code consise - raita kam failta hai
        // enables declare and instatantiate at the same time
        // are like local class difference is that it does not have any name, use this only if need is of one time
    }
}
