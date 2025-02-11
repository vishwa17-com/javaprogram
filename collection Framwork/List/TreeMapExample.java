
import java.util.TreeMap;

public class TreeMapExample {

    public static void main(String[] args) {
        // Creating a TreeMap
        TreeMap<Integer, String> map = new TreeMap<>();

        // Adding key-value pairs
        map.put(3, "Mango");
        map.put(1, "Apple");
        map.put(2, "Banana");
        map.put(5, "orange");

        // Displaying the TreeMap (sorted by keys)
        System.out.println("TreeMap: " + map);

        // Accessing a value using a key
        System.out.println("Value for key 2: " + map.get(2));

        // Removing a key-value pair
        map.remove(3);
        System.out.println("After removing key 3: " + map);

        // Iterating over the TreeMap
        System.out.println("Iterating over TreeMap:");
        for (Integer key : map.keySet()) {
            System.out.println("Key: " + key + ", Value: " + map.get(key));
        }
    }
}
