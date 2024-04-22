import java.util.*;
public class CustomArrayList {
    public static void main(String[] args) {
        // ArrayList - resizable array, elements can be added and removed after compilation phase. Stores reference data types
        ArrayList<String> food = new ArrayList<String>();
        food.add("Pizza");
        food.add("Idli");
        food.add("Masala Dosa");

        food.set(0, "Sushi"); // Replaces the element at the specified position in this list with the specified element.
        food.remove(2); // Removes the element at the specified position in this list. Shifts any subsequent elements to the left (subtracts one from their indices).
        food.clear();// Removes all of the elements from this list. The list will be empty after this call returns.

        for(int i = 0 ; i < food.size() ; i++ ){
            System.out.println(food.get(i));
        }
    }
}
