class Mobile{
    String Brand;
    int price;
    static String name; 

    public void show(){ // instance method
        System.out.println(Brand + " : " + price + " : " + name );
    }

    // public static void show1(){
    //     System.out.println("In static method");
    //     System.out.println(Brand + " : " + price + " : " + name);
    //  }
    // error: non-static variable price cannot be referenced from a static context 
        // non-static variables cannot be used inside static methods because now the compiler doesnot understand or say is confused between the instance variables Brand and price because their exists two objects with different values for these.
    
    // Solution for above problem is below -  using object reference
     public static void show1(Mobile obj) {
         System.out.println("In static method");
         System.out.println(obj.Brand + " : " + obj.price + " : " + obj.name);
     }
}
public class StaticVariables {
    public static void main(String args[]){ // Since main method is the statrting point of any program, its object cannot be created before its starting thus there comes the condition of deadlock. To prevent this, Java makes main method static hence invocation is possible without the need to create object
        Mobile obj1 = new Mobile();
        obj1.Brand = "Samsung";
        obj1.price = 1700;
        Mobile.name = "SmartPhone"; // Refer to the static variable with .class'sName to show that it is a class level variable

        Mobile obj2 = new Mobile();
        obj2.Brand = "OnePlus";
        obj2.price = 1350;
        obj2.name = "SmartPhone";
        //obj2.name = "FoldPhone"; // This(name) is static field thus is shared by all objects hence making changes in one object affects all

        obj1.show();
        obj2.show();

        //Mobile.show1(); // calling static method directly with class's name - problem is compiler doesnot know which object refer to
        // to not have this confusion, java says lets not use non-static variables DIRECTLY inside static methods

        //Indirectly we can use by manually passing the object as argument 
        Mobile.show1(obj1);
    }
}
