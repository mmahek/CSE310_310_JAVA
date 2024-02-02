class Employee{
    int id;
    String name;
    int salary;

    public void printDetails(){
        System.out.println("My id is " + id);
        System.out.println("My name is " + name);
    }
    public int getSalary(){
        return salary;
    }
}

public class myclass {
    public static void main(String[] args) {
        System.out.println("This is my Custom Class:");
        Employee abhinav = new Employee(); // Instantiating a new Employee Object
        Employee john = new Employee();

        // Setting Properties(attributes) for abhinav
        abhinav.id = 001;
        abhinav.name = "Padhle";
        abhinav.salary = 34000;

        // Setting Properties(attributes) for john
        john.id = 002;
        john.name = "John Diwedi";
        john.salary = 12000;

        // Printing the aatributes
        // System.out.println(abhinav.id);
        // System.out.println(abhinav.name);
        abhinav.printDetails();
        john.printDetails();
        int salary = john.getSalary();
        System.out.println(salary);
    }
}

// Real World object = Properties + Behaviour
// Objects in OOPS   = Attributes + Methods