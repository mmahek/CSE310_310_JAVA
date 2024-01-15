public class ResultingDataType{
    public static void main(String[] args){
        byte x = 5;
        int y = 6;
        short z = 8;
        int a = y + z;
        float b = 6.54f + x;
        //System.out.println(b);

        //Increment and decrement

        int i = 56;
        System.out.println(i);//56
        System.out.println(i++); //first i is printed and then incremented - 56 prints and then +1
        System.out.println(i);//57
        System.out.println(++i); //first i is incremented and then it is printed - +1 = 58
        System.out.println(i);//58

        //character incrementation
        char c = 'a';
        System.out.print(++c);//b

    }
}