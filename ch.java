public class ch {
    public static String revString(String str) {
        if (str.length() == 0) { // Handle empty string case
            return "";
        }

        StringBuilder outp = new StringBuilder(); // Use StringBuilder for efficiency

        for (int i = str.length() - 1; i >= 0; i--) {
            char ch = str.charAt(i);
            outp.append(ch); // Append all characters, not just spaces
        }

        return outp.toString(); // Return the reversed string
    }

}
