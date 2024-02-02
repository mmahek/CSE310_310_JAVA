class Employee1 {
    int id;
    String name;
    int salary;

    public void getDeatils() {
        System.out.println("My id is " + id);
        System.out.println("My name is " + name);
    }
    public int getSalary(){
        return salary;
    }
}

public class Employee{
    public static void main(String[] args){
        Employee1 patty = new Employee1();
        Employee1 mini = new Employee1();
        Employee1 rocky = new Employee1();

        // Setting attributes for patty
        patty.id = 7635;
        patty.name = "Shamsher Pathania";        
        patty.salary = 150;

        // Setting attributes for mini
        patty.id = 8241;
        patty.name = "Mrunal Thakur";
        patty.salary = 180;

        // Setting attributes for rocky
        rocky.id = 1008;
        rocky.name = "Jai Singh Chauhan";
        rocky.salary = 230;

        //patty.getDeatils();
        mini.getDeatils();

        int salary = mini.getSalary();
        // int salary = mini.getSalary();
        // int salary = rocky.getSalary();
        System.out.println(salary);
    }
}