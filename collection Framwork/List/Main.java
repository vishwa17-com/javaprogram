
import java.util.ArrayList; // Import ArrayList class

public class Main {

    public static void main(String[] args) {
        // Create an ArrayList of Strings
        ArrayList<String> names = new ArrayList<>();

        // Add elements to the ArrayList
        names.add("A");
        names.add("B");
        names.add("C");
        // Print the ArrayList
        System.out.println("Names: " + names);
        // Access an element using get() method
        System.out.println("First name: " + names.get(0));
        System.out.println("Last name: " + names.get(2));
        // Remove an element
        names.remove(" 'A', 'B' , 'C' ");
        //names.remove("C");
        System.out.println("After removal: " + names);
        // Get the size of the ArrayList
        System.out.println("Size of ArrayList: " + names.size());
        // Loop through the ArrayList
        System.out.println("All names:");
        for (String name : names) {
            System.out.println(name);
        }
    }
}
