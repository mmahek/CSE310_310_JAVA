//package Object Oriented Programming;

class Base{
    int x;

    public int getX() {
        return x;
    }
    public void setX(int x) {
        System.out.println("I am in base class and setting x now");
        this.x = x;
    }

    public void printMe(){
        System.out.println("Print me");
    }
}
class Derived extends Base{
    int y;
    public int getY() {
        return y;
    }
    public void setY(int y) {
        System.out.println("I am in base class and setting y now");
        this.y = y;
    }

    public void printMe(){
        System.out.println("Print me");
    }
}
public class Inheritence {
    public static void main(String[] args){
        //Creating an object of Base class
        Base b = new Base();
       // Derived b1 = new Derived(); -> will work similar to above statement
        b.setX(4);
        System.out.println(b.getX());

        // Creating an object of Derived class
        Derived b1 = new Derived();
        b1.setX(4);
        System.out.println(b1.getX());

        //
        b1.setY(24);
        System.out.println(b1.getY());
    }
}
