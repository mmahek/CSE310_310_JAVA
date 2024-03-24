class Circle{
    public int radius;

    Circle(){
        System.out.println("I am non parameterised");
    }
    Circle(int r){
        System.out.println("This is parameterised constructor of circle");
        this.radius = r;
    }

    public double area(){
        return this.radius * this.radius * Math.PI;
    }
}

class Cylinder extends Circle{
      public int height;

      Cylinder(int r, int h){
        super(r); // this line Of code takes control to parent class with r - use no. 3
        System.out.println("I am cylinder parameterised constructor");
        this.height = h;
      }

      public double volume(){
        return height*Math.PI*this.radius*this.radius;
      }
}

class Rectangle{
    public int length;
    public int width;

    Rectangle(int l, int w){
        this.length = l;
        this.width = w;
    }
    public void setLength(int length) {
        this.length = length;
    }
    public void setWidth(int width) {
        this.width = width;
    }

    public int area(){
        return this.length*this.width;
    }
}

class Cuboid extends Rectangle{
    public int height;

    Cuboid(int l, int w, int h){
        super(l, w);
        System.out.println("THis is parameterised constructor of Cuboid");
        this.height = h;
    }
    public int volume(){
        return height*this.length*this.width;
    }
}

class Base{
    Base(){
        System.out.println("Base constructor");
    }
}
class Derived extends Base{
    Derived(){
        System.out.println("Derived 1");
    }
}
class Derived2 extends Derived{
    Derived2(){
        System.out.println("Derived 2");
    }
}
public class PracticeSet10 {
    public static void main(String[] args) {
        // Problem 1
        // Circle objC = new Circle(12); 
        // Cylinder obj = new Cylinder(12, 4);
        // double area = obj.area();
        // System.out.println("Area of circle is " + area);

        // double vol = obj.volume();
        // System.out.println("Volume of cylinder is " + vol);


        //Problem 2
        // Rectangle r1 = new Rectangle(12,13);
        // Cuboid c1 = new Cuboid(2, 3, 4);
        // int area = c1.area();
        // System.out.println("Area of rectangle is " + area);

        // int vol = c1.volume();
        // System.out.println("Volume of rectangle is " + vol);

        //Problem 3
        Derived2 d2= new Derived2();


    }
}
