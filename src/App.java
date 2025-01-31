import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class App {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        // The Character size in java is 2 bytes
        // System.out.println("Character size: " + Character.SIZE / 8);
        // System.out.println("String size: " + "a".getBytes().length);

        File f = new File("a.txt");
        // FileInputStream fis = new FileInputStream("a.txt");
        FileInputStream fis = new FileInputStream(f);

        // byte b[] = new byte[3];
        byte b[] = new byte[(int)f.length()];
        fis.read(b);
        // System.out.println((char)b[0]);
        String s = new String(b);
        System.out.println(s);
        fis.close();
        // int data;
        // while((data = fis.read()) != -1) {
        //     System.out.println((char) data);
        // }
        
        // System.out.println((char)fis.read());
        // System.out.println((char)fis.read());
        // System.out.println(fis.read());
    }
}
