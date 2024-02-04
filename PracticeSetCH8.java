class Employee{
    int salary;
    String name;
    
    public int getSalary(){
        return salary;
    }
    public String getName(){
        return name;
    }
    public void setName(String n){
        name = n;
    }
}

class Cellphone{
    public void ring(){
        System.out.println("Ringing...");
    }
    public void vibrate(){
        System.out.println("Vibrating...");
    }
    public void callFriend(){
        System.out.println("Calling Deepanjali...");
    }
}

class Square{
    float side;

    public float calculateArea(){
        return side*side;
    }
    public float calculatePerimeter(){
        return 4*side;
    }
    public void diagonal(){
        float d = (float) (side * Math.sqrt(2));
        System.out.println("The diagonal of a Square with side " + " is " + d);
    }
}

class Rectangle{
    float breadth;
    float length;
    public float calculateArea(){
        return length*breadth;
    }
    public float calculatePerimeter(){
        return 2*(length+breadth);
    }
    public void diagonal(){
        float d = (float) Math.sqrt((length*length) + (breadth*breadth));
        System.out.println("The diagonal of a rectangle with length " + length + " and breadth " + breadth + " is " + d);
    }
}

class TommyVecetti{
    public void hit(){
        System.out.println("Tommy is hitting");
    }
    public void run(){
        System.out.println("Tommy is running");
    }
    public void fire(){
        System.out.println("Tommy is firing");
    }
    public void die(){
        System.out.println("Tommy has been WASTED!");
    }
    public String arrest(){
        return "Tommy has been BUSTED!";
    }
}

class Circle{
    float radius;

    public float calculateArea(){
        float pi = (float) (22.0/7);
        float area = radius*radius*pi; 
        return area;
    }

    public float diameter(){
        return radius*2;
    }
}
public class PracticeSetCH8 {
    public static void main(String[] args) {
        
        // Problem 1
        // Employee mahek = new Employee();
        // mahek.setName("Mahek Yadav");
        // System.out.println(mahek.name + "'s Name is " + mahek.getName());
        // mahek.salary = 234;
        // System.out.println(mahek.name + "'s salary is " +mahek.getSalary());

        // Problem 2
        // Cellphone SamsungM20 = new Cellphone();
        // SamsungM20.ring();
        // SamsungM20.vibrate();
        // SamsungM20.callFriend();

        //Problem 3
        // Square s1 = new Square();
        // s1.side = 8f;
        // System.out.println("The area of a Square with side " + s1.side + " is " + s1.calculateArea());
        // System.out.println("The perimeter of a Square with side " + s1.side + " is " + s1.calculatePerimeter());
        // s1.diagonal();

        // Problem 4
        // Rectangle r1 = new Rectangle();
        // r1.length = 6f;
        // r1.breadth = 4f;
        // System.out.println("The area of a rectangle with length " + r1.length + " and breadth " + r1.breadth + " is " + r1.calculateArea());
        // System.out.println("The perimeter of a rectangle with length " + r1.length + " and breadth " + r1.breadth + " is " + r1.calculatePerimeter());
        //r1.diagonal();

        // problem 5
        // TommyVecetti tv = new TommyVecetti();
        // tv.run();
        // tv.hit();
        // tv.fire();
        // tv.die();
        // System.out.println(tv.arrest());
        
        //Problem 6
        Circle c1 = new Circle();
        c1.radius = 24f;
        System.out.println("The area of a circle with radius " + c1.radius + " is " + c1.calculateArea());
        System.out.println("The diameter of a circle with radius " + c1.radius + " is " + c1.diameter());

    }
}
