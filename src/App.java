public class App {

  static int x;
      
  static {
    x = 5;
    System.out.println("static block");
  }
  static {
    x = 15;
    System.out.println("static block");
  }

    public static void main(String[] args) throws Exception {
      // Student s1 = new Student("a", "123");
      // System.out.println(x);

      OuterClass.InnerClass p = new OuterClass.InnerClass();
      p.print();

      
      //  Car c1 = new Car();
      //  Circle c2 = new Circle();

      // c1.setName("KIA");
      // System.out.println(c1.getName());
      // c1.setModel(2024);

      // System.out.println(c1.getModel());

 
      // c1.setRadius(3.0);
      // c1.setColor("Black");
      // System.out.println("c1 area = " + c1.getArea());

      // c2.setRadius(2.0);
      // c2.setColor("Blue");
      // System.out.println(c2.getCircumference());
      // System.out.println(c2.toString());


      // Account a1 = new Account();
      // Account a2 = new Account();
      // Account a3 = new Account();

      // a1.insert(4451238, "Mohammed", 10000);
      // a1.deposit(12000);
      // a1.withdraw(2000);
      // a1.checkBalance();
      // System.out.println(a1.toString());

      // a2.insert(9563145, "Belal", 100);
      // a2.deposit(50);
      // a2.withdraw(140);
      // a2.checkBalance();
      // System.out.println(a2.toString());


      // a3.insert(4451238, "Ahmad", 500);
      // a3.deposit(550);
      // a3.withdraw(10);
      // a3.checkBalance();
      // System.out.println(a3.toString());

      // Product p1 = new Product("Camera", "this is disc", 30, 10, 3, "red");
      // Product p2 = new Product("T-shirt", "size", 15);
      // p2.display();

      // Product p3 = new Product();
      // p3.display();
    
      // App m = new App();
      // m.x = 9;
      // x = 8;
      // System.out.println(x);
      // Student s1 = new Student("Osama", "123");
      // Student s2 = new Student("Ali", "253");
      // Student s3 = new Student("Mohammed", "938");
      
      // System.out.println(s1.logIn(1, "123"));
    }
}
