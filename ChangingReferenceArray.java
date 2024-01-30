public class ChangingReferenceArray {
    static void change(int a){
        a = 98;
    }
    static void change2(int [] arr){
        arr[0] = 10;
    }
    public static void main(String[] args){
        // Case 1 : Changing the integer - value does not changes as it is making a copy only where change is being made and not on the real thing
        // int x = 45;
        // change(x);
        // System.out.print(x);

        // Case 2: Changing the Array - value changes as array is reference and when reference or object is passed, it changes value on the real thing as well
        int [] marks = {1, 2, 3, 4, 5};
        change2(marks);
        System.out.print(marks[0]);
    }
}
