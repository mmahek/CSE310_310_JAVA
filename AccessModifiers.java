class NewEmployee {
    // Validation - eg. name cannot start with digit or Phone Number cannot have special characters 
    private int id;
    private String name;

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
public class AccessModifiers{ // whee a method is accessible
    public static void main(String[] args){
        NewEmployee e1 = new NewEmployee();
        // e1.id = 24;
        // e1.name = "Mahek";//ṇ <-- Throws Error due to private access modifier
        e1.setName("Mahek");
        System.out.println(e1.getName());
        e1.setId(10124);
        System.out.println(e1.getId());
    }
}
