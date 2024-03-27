import java.lang.String;
class Mobile {
    String Brand;
    int price;
    static String name;

    static { // static blocl - called once irrespective of the number of objects created
        name = "Phone";
        System.out.println("Inside static block");
    }
    public Mobile(){
        Brand = "";
        price = 200;
        System.out.println("Inside constructor");
        // name = "Phone"; -- no need to instantiate again and again as it is static
    }

    public void show() { // instance method
        System.out.println(Brand + " : " + price + " : " + name);
    }

}

public class StaticInitBlock {
   public static void main(String args[]) //throws ClassNotFoundException { Class.forName("Mobile"); 
    {
        
        Mobile obj1 = new Mobile();
        obj1.Brand = "Samsung";
        obj1.price = 1700;
        Mobile.name = "SmartPhone"; 

        Mobile obj2 = new Mobile();
        obj2.Brand = "Samsung";
        obj2.price = 1700;
        Mobile.name = "SmartPhone";
        
        obj1.show();
        obj2.show();
      }
}


