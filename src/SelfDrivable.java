public interface SelfDrivable {
    void destination(String d);
    void drive();
    static void newMethod() {
        System.out.println("new Method");
    }
    
}
