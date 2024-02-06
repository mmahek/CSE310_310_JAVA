class Rectangle{
    private int length;
    private int breadth;
    
    public Rectangle() {
        this.length = 4;
        this.breadth = 5;
    }

    public Rectangle(int l, int b){
        this.breadth = b;
        this.length = l; 
    }

    public int getLength() {
        return length;
    }

    // public void setLength(int length) {
    //     this.length = length;
    // }

    public int getBreadth() {
        return breadth;
    }

    // public void setBreadth(int breadth) {
    //     this.breadth = breadth;
    // }

}
class Cylinder{    
    private float radius;
    private float height;
    
    public Cylinder(float radius, float height){
        this.radius = radius;
        this.height = height;
    }
    public float getRadius(){
        return radius;
    }
    public void setRadius(float radius){
        this.radius = radius;
    }

    public float getHeight(){
        return height;
    }
    public void setHeight(float height){
        this.height = height;
    }

    public void totalSurfaceArea(){
        float TSA = (float) (2 * Math.PI * radius * height);
        System.out.println("TSA = " + TSA);
    }
    public void volume(){
        //float pi = 22f / 7;
        float vol = (float) ( 2 * Math.PI * radius * radius * height);
        System.out.println("volume = " + vol);
    }

}
public class PracticeSetCH9{
    public static void main(String[] args){
        /* 
        //Problem 1
        Cylinder myCylinder = new Cylinder();
        
        //myCylinder.setRadius(9);
        //float r = myCylinder.getRadius();
        //System.out.println("Radius is " + r);

        //myCylinder.setHeight(12);
        //System.out.println("Height is " + myCylinder.getHeight());

        // Problem 2
        //Cylinder myCylinder = new Cylinder();
        myCylinder.totalSurfaceArea();
        myCylinder.volume();

        //Problem 3 - do 1 using constructor
        Cylinder myCylinder = new Cylinder(9, 12);
        myCylinder.totalSurfaceArea();
        myCylinder.volume();

        //Problem 4
        Rectangle r1 = new Rectangle();
        System.out.println("Breath is " + r1.getBreadth());
        System.out.println("Length is " + r1.getLength());*/

        //Problem 5
        


    }
}