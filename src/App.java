public class App {
    static void fun(Car obj) {
        obj.autopilot();
    }

    public static void main(String[] args) {
        fun(new SUV());
        fun(new Hatchback());
    }
}