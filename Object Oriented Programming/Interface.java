import java.util.*;
// Interface - it is a point where two things meet and interact
// In Java, Interface is a group of related methods with empty bodies

interface Bicycle{ // If interface Bicycle is implemented, then it forces the class to implement these methods as well by making them public and define them
    int speed = 60; // final
    void applyBreak(int decrement);
    void speedUp(int increment);
}

interface blowHorn { 
    void blowHornK3G();
    void blowHornMHN();
}
class AvonCycle implements Bicycle, blowHorn{
    void blowHorn(){
        System.out.println("Pee Pee Poo Poo");
    }

    public void applyBreak(int decrement){
        //speed = speed - decrement;
        System.out.println("Applying Break, speed = " + speed);
    }
    public void speedUp(int increment){
        //speed = speed + increment; 
        System.out.println("Speeding Up, speed = " + speed);
    }
    public void blowHornK3G(){
        System.out.println("Kabhi Khushi Kabhi Gam");
    }
    public void blowHornMHN(){
        System.out.println("Poo Poo");
    }
}
public class Interface {
    public static void main(String[] args) {
        AvonCycle cycleMahek = new AvonCycle();
        // Creating Properties in interface is possible
        System.out.println("Initial Speed = " + cycleMahek.speed);
        // Modifying properties in Interface is not allowed as they are final
        //cycleMahek.speed = 34; -- error: cannot assign a value to static final variable speed
        // cycleMahek.applyBreak(11);
        // System.out.println(cycleMahek.speed);
        cycleMahek.blowHornK3G();
        cycleMahek.blowHornMHN();
    }
}

/*
    Abstract Classes vs Interfaces
    -   More than one interfaces can be implemented in a single classn whereas, only one class can be extended in case of abstrct class
    
 */