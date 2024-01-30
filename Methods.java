public class Methods {
    /* Methods and functions are terminologies used in programming interchangably. The difference is methods are the functions present inside classes. */
    // Static is used here so that the methods can be called/invoked without object. As only static functions can be called like that. It gets associated with the class rather than the object. Static methods are shared.
    static int logic(int x, int y){
        int z;
        if(x>y){
            z=x+y;
        }
        else{
            z= (x+y)*5;
        }
        return z;
    }
    public static void main(String[] args) {
        int a = 1; 
        int b = 2;
        // Method invocation using Object Creation
        // Methods obj = new Methods(); -> className objectName = new(keyword) className()
        // int c = obj.logic(a, b);
        int c = logic(a, b);

        int a1 = 2;
        int b1 = 1;

        // int c1 = obj.logic(a1, b1);
        int c1 = logic(a1, b1);
        System.out.println(c);
        System.out.println(c1);
    }
}
