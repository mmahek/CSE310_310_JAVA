public class GenericClasses {
    public static void main(String[] args) {
        // Works when made 4 different classes for each Datatype
        // MyIntegerClass myInt = new MyIntegerClass(1);
        // MyDoubleClass myDouble = new MyDoubleClass(3.14);
        // MyCharacterClass myChar = new MyCharacterClass('@');
        // MyStringClass myString = new MyStringClass("Hello");

        // Working with only 1 Generic Class
        MyGenericClass<Integer> myInt = new MyGenericClass(1);
        MyGenericClass<Double> myDouble = new MyGenericClass(3.14);
        MyGenericClass<Character> myChar = new MyGenericClass('@');
        MyGenericClass<String> myString = new MyGenericClass("Hello");

        
        System.out.println(myInt.getValue());
        System.out.println(myDouble.getValue());
        System.out.println(myChar.getValue());
        System.out.println(myString.getValue());
    }
}
