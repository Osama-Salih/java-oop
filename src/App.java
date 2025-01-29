public class App {
    public static void main(String[] args) {
        
        int val = Integer.parseInt("string49");
        System.out.println(val);
        System.out.println(1);
        System.out.println(2);
        
        try {
            int arr[] = new int[5];
            arr[10] = 7 / 0;

            System.out.println("Hi 1");
            System.out.println("Hi 2");
            System.out.println("Hi 3");
        } 
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException | ArithmeticException");
        }
        catch (Exception e) {
            System.out.println("Exception");
        }

        try {
            int arr[] = new int[5];
            arr[7] = 5;
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println(ex);
            return;
        } finally {
            System.out.println("finally");
        }

        try {
            int arr[] = new int[5];
            arr[7] = 5;
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println(ex);
            System.exit(0);
        } finally {
            System.out.println("finally");
        }
        System.out.println(getNumber());
    }
    static int getNumber() {
        try {
            return 1;
        } catch(Exception e) {
            return 2;
        } finally {
            return 3;
        }
    }
}