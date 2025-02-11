
import java.util.HashSet;

public class HashSetExample {

    public static void main(String[] args) {
        // Creating a HashSet
        HashSet<String> fruits = new HashSet<>();

        // Adding elements to HashSet
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("Mango");

        // Adding a duplicate element (will not be added)
        fruits.add("Apple");

        // Displaying elements (order is not guaranteed)
        System.out.println("Fruits in HashSet: " + fruits);

        // Checking if an element exists
        if (fruits.contains("Banana")) {
            System.out.println("Banana is in the set.");
        }

        // Removing an element
        fruits.remove("Orange");
        System.out.println("After removing Orange: " + fruits);

        // Iterating over the elements
        System.out.println("Iterating over HashSet:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
    }
}
