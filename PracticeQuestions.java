import org.w3c.dom.css.Rect;

class BankAccount{
    int accountNumber;
    double balance;

    public double deposite(double depositeAmount){
        balance = balance + depositeAmount;
        return balance;
    }

    public double withraw(double withdrawAmount) {
        balance = balance - withdrawAmount;
        return balance;
    }

    public void show(){
        System.out.println("Current account balance is " + balance);
    }
}

abstract class Shape {
    abstract double perimeter();

    abstract double area();
}

class Rectangle extends Shape {
    public int length;
    public int width;

    Rectangle(int length, int width){
        this.length=length;
        this.width=width;
    }

    public double perimeter() {
        return 2 * (length + width);
    }

    public double area() {
        return length * width;
    }
}

class Circle extends Shape {
    public int radius;
    Circle(int radius){
        this.radius=radius;
    }

    public double perimeter() {
        return 2 * 3.14* radius;
    }

    public double area() {
        return 3.14 * radius * radius;
    }
}

class Person{
    static int count;
    {
        count = count + 1;
    }
    public Person(){
    
    }
    public Person(int k){

    }
}
public class PracticeQuestions {
    public static void main(String[] args){

        //Question 1
        // BankAccount b1 = new BankAccount();
        
        // double d1 = b1.deposite(1000);
        // //System.out.println("Current balance after deposite is " + d1);
        // b1.show();
        // double d2 = b1.withraw(200);
        // b1.show();
        //System.out.println("Current balance after withdrawl is " + d2);

        //Question 2
        // Circle c1 = new Circle(7);
        // double p1 = c1.perimeter();
        // System.out.println("Perimeter of circle is "+p1);

        // double a1 = c1.area();
        // System.out.println("Area of circle is " + a1);
        

        // Rectangle r1 = new Rectangle(2, 4);
        // double p2 = r1.perimeter();
        // System.out.println("Perimeter of Rectangle is " + p2);
        
        // double a2 = r1.area();
        // System.out.println("Area of rectangle is " + a2);

        //Question 3
        // Person p1 = new Person();
        // Person p2 = new Person(24);
        // System.out.println("The number of Objects or Instances created area: " + Person.count);
        
    }
}
