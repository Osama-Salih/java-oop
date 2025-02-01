import java.io.File;
import java.io.IOException;

public class App {
    public static void main(String[] args) throws IOException {
        File f = new File("abc.txt");
        System.out.println(f.exists());
        f.createNewFile();

        if (f.exists()) {
            System.out.println("File name: " + f.getName());
            System.out.println("Absolute path: " + f.getAbsolutePath());
            System.out.println("file path: " + f.getPath());
            System.out.println("Readable: " + f.canRead());
            System.out.println("Writeable: " + f.canWrite());
            System.out.println("File size in bytes: " + f.length());
            System.out.println("Is directory: " + f.isDirectory());
            System.out.println("Is file: " + f.isFile());
            System.out.println("Is hidden: " + f.isHidden());
            System.out.println("Last modified: " + f.lastModified());
            System.out.println("Can execute: " + f.canExecute());
            System.out.println("Can read: " + f.canRead());
            System.out.println("Can write: " + f.canWrite());
        }
    }
}
