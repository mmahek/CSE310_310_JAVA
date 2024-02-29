public class Class {
    public static void main(String[] args) {
        System.out.println(Student.perCentageCriteria);
         Student mahek = new Student();
         System.out.println(mahek.perCentageCriteria);
        // System.out.println(mahek.rollNo);// by default value is 0
        // Student vaishanvi = new Student(12, 25);
        // // System.out.println(mahek.eleigiblity); // by default value is false

        // Student rashmi = new Student(123,4);// roll no is set to be 123
        //  rashmi.rollNo = 24;// rolll no changes to 24
        // System.out.println(rashmi.rollNo);
        // System.out.println(rashmi.marks);

        // System.out.println(vaishanvi.rollNo + " " + vaishanvi.marks);
        
    }
}

class Student{
    static int perCentageCriteria;
    int rollNo = 1; // set the default value
    int marks;

    boolean eligiblity;
    Student(){
        System.out.println("constructor is called"); // in this case constructor is called the number of new objects are formed here it is two times
    }
    // Constructor overloading - multiple constructors present in single program's  class
    Student(int a){
        
        //System.out.println("constructor 2 is called");
    }
    Student(int a, int b){
        rollNo = a;
        marks = b;
        System.out.println("constructor 3 is called");
    }
}
/* Access Modifiers
    1. Private - accessible only in same class - not outside class
    2. Default - same class and sam package
    3. Protected - same class same package - different package but class shold be inherited 
 */
/*
    Constructor - is used to initialize the properties of object.
    Constructor is called at the time of creation of an object.
    Called once for one object.
    No return Type, has same name as the class.
    Every class has its default constructor whether we make one or not.
 */
/* Static - it means belongs to class

 */