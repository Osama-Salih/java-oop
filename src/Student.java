public class  Student {
   private int no;
   private String name;
   private String password;
   private boolean loggedIn;
   private static int count = 1;
   private static String colleg = "IT";
   private static int minimalPasswordLength = 6;

    Student(String name, String password) {
        System.out.println("Param cons");
        this.no = count;
        this.name = name;
        this.password = password;
        count++;
    }

    public String toString() {
        return "Student{" + this.no + ", name: " + this.name + "}";
    }

    public boolean logIn(int enterdNo, String enterdPasswrod) {
        if (enterdNo == no && enterdPasswrod.equals(password)) {
            loggedIn = true;
            return true;
        } else {
            return false;
        }
    }

    public static boolean validatePassword(String password) {
         int x = 5;
        Student s = new Student("Belal", "123");
        s.name = "AAA";

        if (password.length() >= minimalPasswordLength) {
            return true;
        } else {
            return false;
        }
    }
} 
