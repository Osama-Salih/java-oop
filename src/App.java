public class App {
    public interface Showable {
        public void print();
    }

    static void display(Showable s) {
        s.print();
    }
    public static void main(String[] args) {
        display(new Showable() {
            @Override            
            public void print() {
                System.out.println("Showable");
            }
        });

    //   Showable showable;

    //   showable = () -> System.out.println("showable..");
    //   showable.print();
      };
    
}  