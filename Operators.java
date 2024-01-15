public class Operators {
    public static void main(String[] args){
        int a = 4;
        int b = 6 % a; 
        /*System.out.println(b);
        //Logical operators
        System.out.println(55<5);
        System.out.println(23>0 || 22 == 2);*/


        //precendence & associativity

        //precendence of / & * is equivalent thus see for associativity, i.e. ltr
        int p = 6*5-34/2;
        //=30-34/2
        //=30-17
        //=13

        int p1 = 60/5-34*2;
        //=12-68
        //=-56

        System.out.println(p);
        System.out.println(p1);
    }
}
