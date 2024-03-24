class EkClass {
    int v; // instance variable

    public int getA() {
        return v;
    }

    EkClass(int v) {
        this.v = v; // This constructor initializes the instance variable a with the value of v.
        // By using this.v, I am specifying that I want to assign the parameter v to the
        // instance variable v of the class.
    }
}

class DusriClass extends EkClass {

    DusriClass(int c) {
        super(c);
        System.out.println("Mai ek constructor hoon");
    }
}

public class ThisKeyword {
    public static void main(String[] args) {
        EkClass e = new EkClass(24);
        System.out.println(e.getA());
        DusriClass d = new DusriClass(11);
    }
}
