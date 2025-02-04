import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.regex.Pattern;

public class App {
    public static void main(String[] args) throws IOException {
        FileWriter fr = new FileWriter("abc.txt");
       PrintWriter pr = new PrintWriter(fr, true);

       pr.println(98);
       pr.write(98);
       pr.print("BBB");
       pr.print('C');
       pr.print(true);
 
       pr.flush();
       pr.close();

        File file = new File("test.txt");
        Scanner scan = new Scanner("AAA, BBB, CCC");
        scan.useDelimiter(",");
        System.out.println(scan.delimiter());
        System.out.println(scan.delimiter());

        while(scan.hasNext())
            System.out.println(scan.next());

        File file1 = new File("test.txt");
        Scanner scan1 = new Scanner(file1);

        while(scan1.hasNextLine()) {
            parseLine(scan1.nextLine());
        }
     }

    static void parseLine(String str) {
        String name, address, phone;
        Scanner sc = new Scanner(str);
        sc.useDelimiter(",");
        
        while(sc.hasNext()) {
            name = sc.next();
            address = sc.next();
            phone = sc.next();
            System.out.println("Name: " + name + " Address: " + address + " Phone: " + phone);
        }
        sc.close();
    }
 }  