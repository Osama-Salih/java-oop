public class TestClass {
    int k = 10;
    public TestClass() {
        System.out.println("TestClass");
    }

    public TestClass(int x) {
        System.out.println("param testClass");
    }

    {
        System.out.println("init block");
    }
    public void testMethod() {
        System.out.println("Test");
    }    
}
