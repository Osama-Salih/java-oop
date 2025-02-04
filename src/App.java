import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws IOException, ClassNotFoundException{
       File file = new File("Student.txt");
    //    Student2 s1 = new Student2(111, "osama", 100);
    // ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file));
    // oos.writeObject(s1);
   
        // ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));
        // Student2 s2 = (Student2)ois.readObject();

        // Reading and writing arrays of objects
       ArrayList<Student2> studentList = new ArrayList<>();
       Student2 s1 = new Student2(222,"Ali", 99);
       Student2 s2 = new Student2(333,"omar", 98);
       studentList.add(s1);
       studentList.add(s2);
       ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file));
       oos.writeObject(studentList);

       ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));

       @SuppressWarnings("unchecked")
    ArrayList<Student2> studentListRead = (ArrayList<Student2>)ois.readObject();

       for (Student2 s: studentListRead) {
        System.out.println(s);
       }
    }

}