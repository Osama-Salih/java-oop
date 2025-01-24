import java.util.ArrayList;
import java.util.Arrays;
// import java.util.Collections;
// import java.util.List;
import java.util.Scanner;

public class App {

    static void displayMenu() {
        System.out.println();
        System.out.println(
            "1. Add element\n" +
            "2. Remove element\n" +
            "3. Print element\n" +
            "4. Exit"
        );
        System.out.println();
    }
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(50, 70, 30, 40, 10, 60, 20, 80));
        // ArrayList<Integer> list2 = new ArrayList<>(list1.subList(0, 9));

        // Collections.sort(list1); // Sort ASC
        // Collections.sort(list1, Collections.reverseOrder()); // Sort ASC
        // Collections.reverse(list1); // return elms in reverse order
        // System.out.println(Collections.min(list1)); // return the minimum element
        // System.out.println(Collections.max(list1)); // return the maximum element
        // System.out.println(list1);
        // list1.forEach(el -> System.out.print(el + " - "));
        // list1.isEmpty();
        // list1.clear();
        // list1.ensureCapacity(150);
        // System.out.println(list1);
        // System.out.println(list.contains(20)); // Check if element exists or not.

        // list2.retainAll(Collections.singleton(1)); // Return all matching elements.
        // System.out.println(list2);



        // Create a list of Distinct elements taken from the user, and print these elements
        
        // Scanner in = new Scanner(System.in);
        // ArrayList<Integer> list = new ArrayList<>();
        // for (int i = 0; i < 5; i++) {
        //     int temp = in.nextInt();
        //     if (!list.contains(temp))
        //         list.add(temp);
        // }
        // System.out.println(list);

        while (true) {
            ArrayList<Integer> list = new ArrayList<>();
            Scanner in = new Scanner(System.in);

            displayMenu();
            int choice = in.nextInt();  
            switch(choice) {
                
                case 1:
                // Add
                    System.out.println("Enter an integer: ");
                    list.add(in.nextInt());
                    System.out.println("Element added");
                    break;

                case 2:
                // Remove 
                    System.out.println("Enter a number to be deleted: ");
                    int num = in.nextInt();
                    if(!list.contains(num)) 
                        System.out.println("Element not found");
                    else {   
                    list.remove((Integer) num);
                    System.out.println("Element Removed");
                    }
                    break;
                
                case 3:
                // Print
                    System.out.println(list);   
                    break; 

                case 4: 
                // Exit
                    return;
            }
        }
    }
}