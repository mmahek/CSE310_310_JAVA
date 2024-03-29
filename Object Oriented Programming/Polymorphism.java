interface MyCamera2 {
    void takeSnap();

    void recordVideo();

    private void greet() {
        System.out.println("Good Morning!");
    } // -- This is done to reduce the size of default method

    default void record4Kvideo() {
        greet();
        System.out.println("Recording in 4K...");
    }
}

interface MyWifi2 {
    String[] getNetworks();

    void connectToNetworks(String network);
}

class MyCellPhone2 {
    void callNumber(int phoneNumber) {
        System.out.println("Calling " + phoneNumber);
    }

    void pickCall() {
        System.out.println("Connecting...");
    }
}

class MySmartPhone2 extends MyCellPhone2 implements MyWifi2, MyCamera2 {
    public void takeSnap() {
        System.out.println("Taking snap...");
    }

    public void recordVideo() {
        System.out.println("Recording video...");
    }

    // public void record4Kvideo(){ //-- overriding default method, not necessary
    // System.out.println("Taking snap and Recordingin 4k...");
    // }
    public String[] getNetworks() {
        System.out.println("Getting the list of Networks...");
        String[] networkList = { "Harry", "Mahek", "Hasbullah2G" };
        return networkList;
    }

    public void connectToNetworks(String network) {
        System.out.println("Connecting to " + network);
    }
}
public class Polymorphism {
    public static void main(String[] args) {
         MyCamera2 cam1 = new MySmartPhone2(); // A reference is of interface MyCamera2 = object is an instance of B -- cam1 does not know about the other functions of MySmartPhone2
         // This is a smartphone use it as a camera otherwise get error.
         // cam1.getNetworks(); -- error == cannot be used, camera is needed then wifi se aapka kya matlkab?
         // This is done for the good - known as Polymorphism
         cam1.recordVideo();
         cam1.record4Kvideo();

         MySmartPhone2 s = new MySmartPhone2();
         s.takeSnap();
         s.callNumber(92609);
         s.getNetworks();

    }
}
