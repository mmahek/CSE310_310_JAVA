import java.util.Collection;
import java.util.Scanner;
import java.util.Scanner;

public class Strings1{

    /*
     * import java.util.*;
     * 
     * public class Main {
     * public static int countwords(String str){
     * if(str.length()==0) return 0;
     * int count=1; //lets do java
     * for(int i=0;i<str.length();i++){ //my code is running
     * if(str.charAt(i)==' ') count++;
     * }
     * return count;
     * }
     * public static String reversestringwordwise(String str){
     * 
     * String output="";
     * int j=str.length(); //20 i j
     * for(int i=str.length()-1;i>=0;i--){ //my code is running
     * 
     * if(str.charAt(i)==' ') {
     * output+=str.substring(i+1,j) + " ";
     * j=i;
     * }
     * }
     * output+=str.substring(0,j);
     * return output;
     * }
     * public static String reversestring(String str){
     * String output="";
     * for(int i=str.length()-1;i>=0;i--){ //my code is running
     * output=output+str.charAt(i);
     * }
     * 
     * 
     * 
     * return output;
     * 
     * }
     * // public static void reversestringwordwise(String str){
     * 
     * // String output[]=str.split(" ");
     * // Collections.reverse(Arrays.asList(output));
     * // System.out.println(String.join(" ",output)); //n^2
     * 
     * // }
     * 
     * public static void main(String[] args) {
     * 
     * 
     * //wrapper classes in java
     * int a=20;
     * Integer c=Integer.valueOf(a);
     * Integer b=a; //autoboxing
     * Integer d=2000;
     * int e=d; //unboxing
     * System.out.print( e + " ");
     * System.out.println(d );
     * // Integer a=126;
     * // Integer b=126;
     * // for(int i=1;i<=4;i++){
     * // System.out.print("value of a = " + a);
     * // System.out.println( a==b);
     * // a++;b++;
     * // }
     * 
     * 
     * 
     * // int a=Integer.MAX_VALUE;
     * // int b=Integer.MIN_VALUE;
     * 
     * // Scanner sc=new Scanner(System.in);
     * // String str=sc.nextLine();
     * // int totalwords=countwords(str);
     * // System.out.println(totalwords);
     * // String reversed=reversestring(str);
     * // System.out.println(reversed);
     * // System.out.println( a + " " + b);
     * // String str="abc";
     * // String str2="abc";
     * // String str3=new String("abc");
     * // // System.out.println(str.equals(str2));
     * // System.out.println(str==str2);
     * // System.out.println(str==str3);
     * }
     * }
     */
    /* 1. Initialize the count with one - (1)my (2)code (3)is (4)java - therefore - 4 words
     */
    public static int countWords(String str){
        if(str.length() == 0) return 0;
        int count = 1;
        for(int i = 0 ; i < str.length() ; i++){
            if(str.charAt(i) == ' '){
                count ++;
            }
        }
        return count;
    }

    public static String reverseString(String ss){
        if(ss.length() == 0) return "";
        int e = ss.length()-1;
        String output = "";
        for(int i = e ; i >= 0 ; i--){
            output = output+ss.charAt(i);
        }
        return output;
    }

    public static void reString(String str){
       String output[] = str.split(" ");
       for(int i = 0 ; i < output.length ; i++){
        System.out.println(output[i]);
       }
       Collection.reverse(Arrays.asList(output));
       System.out.println(String.join(" ", output));
    }
    public static void main(String[] args) {
        /* Strings are immutable?
        String str = "abc";                       // To optimize the space, if a string already exists which is being created again, new one will point to the previous one only, thus same address. 
        String str2 = new String("abc"); // Whereas, here string is created in heap with new address, thus str2 will point new string at new address. - and hence strings are immutable
        String str3 = new String("abc");
        //System.out.println(str.equals(str2));
        // System.out.println(str==str2);
        // System.out.println(str==str3);*/

       /*// Substring function
        String str4 = "abcdefghij"; // -> string will be printed after 5th index, i.e. fghij
        System.out.println(str4.substring(5));*/

        /*// Count the number of words seperated by a space from astring
        Scanner sc = new Scanner(System.in);
        extracted();
        String str = sc.nextLine();
        int totalWords = countWords(str);
        System.out.println(totalWords);*/

        /*// Reverse a string - completely(each and every alphabet)
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the string to reverse: ");
        String ss = s.nextLine();
        String reversedString = reverseString(ss);
        System.out.println(reversedString);*/

        // Task 1
        // Reverse the string but words must no be
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the string to be reversed: ");
        String str = s.nextLine();
        System.out.println(reverseString(str));
    }
}
