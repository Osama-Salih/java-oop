import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class App {
    public static void main(String[] args) throws IOException {
        // String s = "Hello";

        // Writer writer = new OutputStreamWriter(new FileOutputStream("test.txt"));
        // writer.write(s);
        // writer.flush();
        // writer.close();

    //  String s = "Hello";
    //  FileWriter fr = new FileWriter("test.txt");
    //  fr.write("AA");
    //  fr.write("\n");
    //  fr.write("BB");
    //  fr.close();

        
    // FileOutputStream fos = new FileOutputStream("test.txt");
    // String s = "Hello";
    // byte b[] = s.getBytes();
    // fos.write(b);
    // fos.close();

    // String s = "Hello osama";
    // FileWriter fr = new FileWriter("test.txt");
    // fr.write(s, 1, 2);
    // fr.write('97);
    // fr.write('b');
    // fr.write("AA");
    // fr.write("\n");
    // fr.write("BB");
    // fr.close();

    // File file = new File("test.txt");
    // FileReader fr = new FileReader(file);
    // int i;
    // while ((i = fr.read()) != -1) {
    //     System.out.print(i);
    // }
    // }
    File file = new File("test.txt");
    FileReader fr = new FileReader(file);

    char ch[] = new char[(int)file.length()];
    fr.read(ch);
    for (char c : ch) {
        System.out.print(c);
    }
    fr.close();
}
}