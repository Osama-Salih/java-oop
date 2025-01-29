import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class App {
    public static void main(String[] args) {
        
        try {
            readFile("C:\\Osama\\Name.txt");
        } catch (FileNotFoundException e) {}
        catch (IOException e) {}
    
    
    // static void readFile(String filePath) {
    //     try {
    //         FileReader reader = new FileReader(filePath); 
    //     } catch (IOException e) {
    //         System.out.print(e);
    //     }
    // }

    static void readMultiFile(String filePath) throws FileNotFoundException, IOException {
        try {
            readFile("C:\\Osama\\Name.txt");
        } catch (FileNotFoundException e) {}
        catch (IOException e) {}
    }

    static void readFile(String filePath) throws FileNotFoundException, IOException {
        FileInputStream fin = null;
        try {
            fin = new FileInputStream(filePath);
            System.out.print("file content: ");
            int r = 0;

            while((r = fin.read()) != -1) {
                System.out.print((char) r);
            }
        } catch (FileNotFoundException e) {
            System.out.print(e);
        }
        catch (IOException e) {
            System.out.print(e);
        } finally {
             if (fin != null) {
                try {
                    fin.close();
                } catch (IOException e) {
                    System.out.println(e);
                }
             }
        }
    }
}