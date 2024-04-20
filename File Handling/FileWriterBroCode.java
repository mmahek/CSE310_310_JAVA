import java.io.IOException;
import java.io.FileWriter;

public class FileWriterBroCode {
    public static void main(String[] args) {
        try {
            FileWriter writer = new FileWriter("poem.txt");
            writer.write("Roses are red\nViolets are blue\nBooty booty booty\nRockin' everywhere!");
            writer.append("\n(A poem by Mahek)");
            writer.close();
        } catch (IOException e) {
            // TODO: handle exception
            e.printStackTrace();
        }
    }
}
