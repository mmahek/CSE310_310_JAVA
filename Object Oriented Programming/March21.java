public class March21 {
    public static void main(String[] args) {
        Servicebased karan = new Servicebased();
        System.out.println("Salary: " + karan.salary);
        System.out.println("Bonus: " + karan.bonus);
        System.out.println("Insurance: " + karan.insurance);
    }
}

class Placed {
    int salary;
    int bonus;

    // Constructor
    Placed(int salary, int bonus) {
        this.salary = salary;
        this.bonus = bonus;
    }
}

class Servicebased extends Placed {
    int insurance;

    // Constructor
    Servicebased() {
        super(50000, 10000); // Default salary and bonus values
        this.insurance = 5000; // Default insurance value
    }
}

class ProductBased extends Placed {
    int joiningBonus;
    int stocks;

    // Constructor
    ProductBased(int salary, int bonus, int joiningBonus, int stocks) {
        super(salary, bonus);
        this.joiningBonus = joiningBonus;
        this.stocks = stocks;
    }
}
