class Outer{
    int randomVar;

    public void method(){
        System.out.println("Inside method");
    }

    class Inner{
        public void methodInsideInnerClass(){
            System.out.println("method Inside Inner class!");
        }
    }

    static class staticInner {
        public void methodInsideStaticInnerClass() {
            System.out.println("method Inside Static Inner class!");
        }
    }
}

public class innerClass {
    public static void main(String[] args) {
        Outer obj = new Outer();
        obj.method();

        Outer.Inner obj1 = obj.new Inner();
        // Inner belongs to Outer = object of Outer.new -> creates obj of Inner class -- because, methodInsideInner is a non-static method thus it needs object to be called
        obj1.methodInsideInnerClass(); // use obj1 to called methodInsideInner

        Outer.staticInner obj2 = new Outer.staticInner();
        // staticInner class Belongs to Outer = object of Outer class .InnerClass
        obj2.methodInsideStaticInnerClass();
    }
}
// Outer class cannot be made static