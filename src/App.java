public class App {
    public static void main(String[] args) throws Exception {
       Car c1 = new Car();

      c1.setName("KIA");
      System.out.println(c1.getName());
      c1.setModel(2024);

      System.out.println(c1.getModel());
    }
}
