import java.util.*;

@FunctionalInterface // Interface which has only 1 method - specification of fi
interface A{ //Single abstract 
    void show(int i);
    //void show2();
}

// class B implements A{ // implementing functional interface using a class as object of functional interface doesnot exists
//     public void show(){
//         System.out.println("inside show");
//     }
// }

public class intro {
    public static void main(String args[]){

        // A obj = new B();
        // obj.show();

        // A obj = new A(){ // Instantiating functional interface by Anonymous in class
        //     public void show(int i){
        //         System.out.println("in show " + i);
        //     }
        // };
        // obj.show(5);

        
        // Lambda Exprssion
        // A obj = () -> System.out.println("in show");
        // obj.show();

        A obj = i -> System.out.println("in show " + i);
            
        
        obj.show(5);
    }
}
