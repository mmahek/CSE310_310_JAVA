
import java.io.FileReader;
import java.io.IOException;

public class FileReaderBroCode {
    public static void main(String[] args) {
        // Filereader - reads the contents of a file as a stream of characters. One by
        // one read() returns an int value which contains the byte value when read()
        // returns -1, there is no more data to be read.
        try {
            FileReader reader = new FileReader("art.txt");
            int data = reader.read();
            while (data != -1) {
                System.out.print((char) data);
                data = reader.read();
            }
            reader.close();
        } catch (FileNotFoundException e) {
            e.printStactTrace();
            // System.out.println();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
