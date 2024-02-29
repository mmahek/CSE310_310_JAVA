public class AutoBoxing {
    public static void main(String[] args) {
        /* Autoboxing - It is automatic conversion of premitive into its wrapper class. 
        Autoboxing occurs when assigning the value of primitive Int to wrapper Int. The int is automatically converted to an Integer object.
         
        Unboxing - Conversion of wrapper classs into primitive. 
        Unboxing occurs when assigning the value of another Wrapper Int to another Primitive Int. The Integer object is automatically converted to an int.
        
        */
        int a = 2000;
        Integer c = Integer.valueOf(a); // explicitly converting the primitive int into its corresponding wrapper class Integer 
        Integer b = a; // autoboxing
        System.out.println(a + " " + b + " " + c );
    }
}
