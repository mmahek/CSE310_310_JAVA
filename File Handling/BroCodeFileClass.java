
import java.io.File;
public class BroCodeFileClass {
    public static void main(String[] args) {
        File file = new File("file1.txt");
        if(file.exists()){
            System.out.println("That file exists o:!");
            System.out.println(file.getPath());
            System.out.println(file.getAbsolutePath());
            System.out.println(file.isFile());
            file.delete();
            System.out.println(file.exists());
        } else{
            System.out.println("That file doesnot exists :()");
        }
    }
}
