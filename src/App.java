// import java.util.ArrayList;

public class App {
    static void m() {
        new TestClass(5){
            @Override
            public void testMethod() {
                System.out.println(k);
            }

            public void testMethod2() {
                System.out.println();
            } 
        };
    }
    // var x = 4; // is not allowed here
    // static void print(var x) {} is not allowed here
    // static var print() {} is not allowed here
    public static void main(String[] args) {
        int d = 9;
        // ArrayList<Integer> list = new ArrayList<>();
        // ArrayList<var> list = new ArrayList<>(); is not allowed here
        // var<Integer> list1 = new ArrayList<>(); not allowed
        // var list1 = new ArrayList<>(); valid
        // var k; not valid
        // var k = 5;  valid

        var test = new TestClass(5){
            // static int x = 2;
            // final static int x = 2;
            // static int p = 10;
            @Override
            public void testMethod() {
                System.out.println("Test 2");
            }

            public void testMethod2() {
                System.out.println(d);
            } 
        };
        test.testMethod2();
        
        
    // var string = "String";
    // var n = 1;
    // var c = 'C';
    // var b = true;
    // var t = new TestClass();
    
    };
}   