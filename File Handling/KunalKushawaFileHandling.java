import java.io.*;
public class KunalKushawaFileHandling {
    public static void main(String[] args) {
        // Taking data in byte stream and putting it in character stream
        // try(InputStreamReader isr = new InputStreamReader(System.in) ){
        //     System.out.println("Enter some letters");
        //     int letters = isr.read();
        //     while(isr.ready()){ //converting int to chars
        //         System.out.println((char) letters);
        //         letters = isr.read();
        //     }
        //     //isr.close();
        //     System.out.println();
        // } catch (IOException e) {
        //     // TODO: handle exception
        //     System.out.println(e.getMessage());
        // }
        try (FileReader fr = new FileReader("poem.txt")) {
            System.out.println("Enter some letters");
            int letters = fr.read();
            while (fr.ready()) { // converting int to chars
                System.out.print((char) letters);
                letters = fr.read();
            }
            // fr.close();
            System.out.println();
        } catch (IOException e) {
            // TODO: handle exception
            System.out.println(e.getMessage());
        }

        // try(BufferReader br = new BufferReader(new InputStreamReader(System.in)); // byte to char stream and then char stream
        // ){
        // while(br.ready()){ // .ready() tells you that if a file is ready to be read
        //     String input = br.readLine();
        //     br.readLine();
        // }
         
        //     System.out.println("You typed : " + br.readLine());
        // } catch (IOException e) {
        //     // TODO: handle exception
        //     System.out.println(e.getMessage());
        // }
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.println("Enter some text:");
            String input = br.readLine();
            System.out.println("You typed: " + input);
        } catch (IOException e) {
            System.out.println("Error reading input: " + e.getMessage());
        }
    }
}