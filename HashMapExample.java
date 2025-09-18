import java.util.*;


public class HashMapExample {
    public static void main(String[] args) {
        HashMap<Integer,String> aiml = new HashMap<>();
        
        // Adding entries
        aiml.put(1, "Santosh");
        aiml.put(2, "Kumar");
        aiml.put(3, "Sah");
        aiml.put(4, "KIET");

        // Duplicate key -> replaces value
        aiml.put(2, "AI & ML");

        // One null key, multiple null values
        aiml.put(null, "Hello");
        aiml.put(5, null);
        aiml.put(6, null);

        // Display all entries
        System.out.println("HashMap: " + aiml);

        // Access value
        System.out.println("Key 3 -> " + aiml.get(3));

        // All keys
        System.out.println("Keys: " + aiml.keySet());

        // All values
        System.out.println("Values: " + aiml.values());

        // All key-value pairs
        System.out.println("Entries: " + aiml.entrySet());

         //  Traversal using keySet() (iterate keys, then fetch value using get())
        System.out.println("Traverse using keySet():");
        for (Integer key : aiml.keySet()) {
            System.out.println("Key: " + key + " -> Value: " + aiml.get(key));
        }
        System.out.println();

        // Traversal using values() (iterate only over values)
        System.out.println("Traverse using values():");
        for (String value : aiml.values()) {
            System.out.println("Value: " + value);
        }
        System.out.println();

        //  Traversal using entrySet() (best way: gives both key and value)
        System.out.println("Traverse using entrySet():");
        for (Map.Entry<Integer, String> entry : aiml.entrySet()) {
            System.out.println("Key: " + entry.getKey() + " -> Value: " + entry.getValue());
        }
        System.out.println();

        //  Traversal using forEach() (Java 8+ with lambda)
        System.out.println("Traverse using forEach():");
        aiml.forEach((key, value) -> {
            System.out.println("Key: " + key + " -> Value: " + value);
        });
        System.out.println();

        //  Traversal using Iterator (interview important)
        System.out.println("Traverse using Iterator:");
        Iterator<Map.Entry<Integer, String>> it = aiml.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<Integer, String> entry = it.next();
            System.out.println("Key: " + entry.getKey() + " -> Value: " + entry.getValue());
        }
    }
}
