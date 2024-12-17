public class OuterClass {
    static int x = 199;
    public static class InnerClass {
        public void print() {
            System.out.println("X = " + x);
        }
    }
}
