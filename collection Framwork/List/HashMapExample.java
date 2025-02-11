
import java.util.HashMap;

public class HashMapExample {

    public static void main(String[] args) {
        // Creating a HashMap
        HashMap<Integer, String> map = new HashMap<>();

        // Adding key-value pairs
        map.put(1, "Apple");
        map.put(2, "Banana");
        map.put(3, "Mango");

        // Displaying the HashMap
        System.out.println("HashMap: " + map);

        // Accessing a value using a key
        System.out.println("Value for key 2: " + map.get(2));

        // Removing a key-value pair
        map.remove(2);
        System.out.println("After removing key: " + map);

        // Iterating over the HashMap
        System.out.println("Iterating over HashMap:");
        for (Integer key : map.keySet()) {
            System.out.println("Key: " + key + ", Value: " + map.get(key));
        }
    }
}
