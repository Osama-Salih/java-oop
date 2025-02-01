import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class App {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        // FileOutputStream fos1 = new FileOutputStream("test.txt");
        // fos1.write("مرحبا".getBytes());
        // fos1.flush();
        // FileInputStream fis = new FileInputStream("test.txt");
        // System.out.println(fis.read());
        
        File file = new File("userProfileImage.png");
        FileInputStream fin = new FileInputStream(file);
        byte b[] = new byte[(int) file.length()];
        fin.read(b);


        for (int i = 0; i < b.length; i++) {
            System.out.print(b[i]);
        }

        FileOutputStream fos = new FileOutputStream("userProfileImage2.png");
        fos.write(b);
        fos.flush();
        fos.close();
        fin.close();
    }
}
