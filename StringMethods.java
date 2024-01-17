public class StringMethods {
    //String Methods : Return the length og string, Change and return a copy of string 
    public static void main(String[] args) {

        String name = "Mahek";
/*
        // .length() method
        int value = name.length();// Returns the length of string
        System.out.println(value);

        // .toLowerCase()
        String lowerCase = name.toLowerCase();
        System.out.println(lowerCase);

        // .toUpperCase()
        String upperCase = name.toUpperCase();
        System.out.println(upperCase); 
        
        // .trim()
        String nonTrimmedString = "    Mahek    ";
        System.out.println(nonTrimmedString);
        String trimmedString = nonTrimmedString.trim();
        System.out.print(trimmedString);

        // .subString()
        String subS = name.substring(1,4); //endIndex is excluded
        System.out.println(subS);

        // .replace()
        // String replaceString = name.replace('k', 'r');
        String replaceString = name.replace("he", "raj");
        System.out.println(replaceString);

        // .startsWith() -> works with string only
        System.out.println(name.startsWith("Har"));

        // .endsWith()
        System.out.println(name.endsWith("ma"));

        // .charAt() -> returns the character at 
        System.err.println(name.charAt(4));

        // .indexOf() -> returns the 1st index of start of string - returns -1 when not found
        System.err.println(name.indexOf("he"));

        String modiName = "Mississipi";
        System.out.println(modiName.indexOf("ssi"));
        System.out.println(modiName.indexOf("ssi", 4));
        System.out.println(modiName.lastIndexOf("p", 4));

        // .equals() -> case sensitive
        System.out.println(name.equals("MahEk"));

        // .equalsIgnoreCase
        System.out.println(name.equalsIgnoreCase("MAHeK"));*/

        //Escape sequences
        System.out.println(("I am escape sequence \" \" double qoute"));
        System.out.println("I am \t tab");
        System.out.println("I am newline \n cahracter");



    }
}
