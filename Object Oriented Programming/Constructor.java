class Parent {
    Parent() {
        System.out.println("I am a constructor of Parent class");
    }

    Parent(int a) {
        System.out.println("I am a constructor of Parent class with a = " + a);
    }
}

class Child extends Parent {

    Child() {
        System.out.println("I am a constructor of Child Class");
    }

    Child(int a, int b) {
        super(a);
        System.out.println("I am a constructor of child class with a = " + a + " and b = " + b);
    }
}

class GrandChild extends Child {

    GrandChild() {
        System.out.println("I am a constructor of GrandChild class");
    }

    GrandChild(int a, int b, int c) {
        super(a, b);
        System.out.println("I am a constructor of GrandChild class with a = " + a + " , b = " + b + " and c = " + c);
    }
}

public class Constructor {
    public static void main(String[] args) {
        //GrandChild gg = new GrandChild();
        GrandChild g1 = new GrandChild(1, 2, 3);
    }
}
