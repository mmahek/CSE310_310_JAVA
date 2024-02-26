class NewEmployee {
    // Validation - eg. name cannot start with digit or Phone Number cannot have
    // special characters
    private int id;
    private String name;

    // Constructor- Directly initialising the id and name 
    public NewEmployee(){
        id = 45;
        name = "Your-Name-Here";
    }
    
    // Passing arguments for id and name
    public NewEmployee(String myName, int myId) {
        id = myId;
        name = myName;
    }
    
    public NewEmployee(String myName) {        
        name = myName;
    }

    public String getName() { // getter
        return name;
    }

    public void setName(String n) { // setter
        this.name = n;
    }

    public void setId(int i) { // setter
        this.id = i;
    }

    public int getId() { // getter
        return id;
    }
}
public class Constructors{
    public static void main(String[] args) {
        //NewEmployee e1 = new NewEmployee("Arjun", 33); // <-- gets parmeters thus will consider second constructor
        NewEmployee e1 = new NewEmployee(); // <-- This does not gets any inputs(parameters) thus will consider first constructor
        NewEmployee e2;
        // e1.id = 24;
        // e1.name = "Mahek";//ṇ <-- Throws Error due to private access modifier


        // e1.setName("Mahek");
        // e1.setId(10124);

        // Automatically Invoked
        System.out.println(e1.getName());
        System.out.println(e1.getId());
    }
}