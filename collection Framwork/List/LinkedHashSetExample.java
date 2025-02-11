
import java.util.LinkedHashSet;

public class LinkedHashSetExample {

    public static void main(String[] args) {
        // Creating a LinkedHashSet
        LinkedHashSet<String> fruits = new LinkedHashSet<>();

        // Adding elements to LinkedHashSet
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("Mango");
        fruits.add("Cherry");
        // Adding a duplicate element (will not be added)
        fruits.add("Apple");
        // Displaying elements (in insertion order)
        System.out.println("Fruits in LinkedHashSet: " + fruits);
        // Checking if an element exists
        if (fruits.contains("barry")) {
            System.out.println("Fruit is in the set.");
        } else {
            System.out.println("Fruit is not in the set.");
        }
        // Removing an element
        fruits.remove("Mango");
        System.out.println("After removing fruit: " + fruits);
        // Iterating over the elements
        System.out.println("Iterating over LinkedHashSet:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
    }
}
