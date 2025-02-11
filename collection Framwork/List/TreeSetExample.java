
import java.util.TreeSet;

public class TreeSetExample {

    public static void main(String[] args) {
        // Creating a TreeSet
        TreeSet<String> fruits = new TreeSet<>();

        // Adding elements to TreeSet
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("Mango");

        // Adding a duplicate element (will not be added)
        fruits.add("Apple");

        // Displaying elements (sorted order)
        System.out.println("Fruits in TreeSet: " + fruits);

        // Checking if an element exists
        if (fruits.contains("Banana")) {
            System.out.println("Banana is in the set.");
        }

        // Removing an element
        fruits.remove("Orange");
        System.out.println("After removing Orange: " + fruits);

        // Iterating over the elements
        System.out.println("Iterating over TreeSet:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
    }
}
