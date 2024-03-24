interface MyCamera{
    void takeSnap();
    void recordVideo();

    private void greet(){
        System.out.println("Good Morning!");
    } // -- This is done to reduce the size of default method
    default void record4Kvideo(){
        greet();
        System.out.println("Recording in 4K...");
    }
}

interface MyWifi{
    String[] getNetworks();
    void connectToNetworks(String network);
}

class MyCellPhone{
    void callNumber(int phoneNumber){
        System.out.println("Calling " + phoneNumber);
    }
    void pickCall(){
        System.out.println("Connecting...");
    }
}

class MySmartPhone extends MyCellPhone implements MyWifi, MyCamera{
    public void takeSnap(){
        System.out.println("Taking snap...");
    }
    public void recordVideo(){
        System.out.println("Recording video...");
    }
    // public void record4Kvideo(){ //-- overriding default method, not necessary
    //     System.out.println("Taking snap and Recordingin 4k...");
    // }
    public String[] getNetworks(){
        System.out.println("Getting the list of Networks...");
        String[] networkList = {"Harry", "Mahek", "Hasbullah2G"};
        return networkList;
    }
    public void connectToNetworks(String network){
        System.out.println("Connecting to " + network);
    }
}
public class DefaultMethods {
    public static void main(String[] args) {
        MySmartPhone ms = new MySmartPhone();
        ms.record4Kvideo();
        //ms.greet(); -- error!
        String[] ar = ms.getNetworks();
        for (String item : ar){
            System.out.println(item);
        }
        
    }
}
