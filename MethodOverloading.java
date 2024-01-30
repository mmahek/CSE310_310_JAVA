public class MethodOverloading {
    static void foo(){
            System.out.println("Good Morning!");
        }
        static void foo(int a){ //Parameters passed into methods while declation and defination
            System.out.println("Good morning " + a + " !");
        }
    public static void main(String[] args){
        //Method overloading - arguments are actual (passed while calling of method)
        foo();
        foo(24);
        // For method overloading, change the parameters not the return type
    }

}
