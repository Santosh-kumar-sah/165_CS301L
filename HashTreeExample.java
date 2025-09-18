import java.util.*;
public class HashTreeExample {
    
    public static void main(String[] args) {
        // Create a TreeMap with Integer keys and String values
        TreeMap<Integer, String> aiml = new TreeMap<>();

        // 🔹 Adding entries (put method)
        aiml.put(3, "Sah");
        aiml.put(1, "Santosh");
        aiml.put(4, "KIET");
        aiml.put(2, "AI & ML");

        // Duplicate key -> replaces old value
        aiml.put(2, "Kumar");

        // Null key is NOT allowed -> uncommenting next line will throw NullPointerException
        // aiml.put(null, "Hello");

        // Multiple null values are allowed
        aiml.put(5, null);
        aiml.put(6, null);

        // 🔹 Get a value using key
        System.out.println("Get key 3: " + aiml.get(3));
        System.out.println();

        // 🔹 Traversal using keySet() (keys are sorted automatically)
        System.out.println("Traverse using keySet():");
        for (Integer key : aiml.keySet()) {
            System.out.println("Key: " + key + " -> Value: " + aiml.get(key));
        }
        System.out.println();

        // 🔹 Traversal using values() (order of values = order of keys)
        System.out.println("Traverse using values():");
        for (String value : aiml.values()) {
            System.out.println("Value: " + value);
        }
        System.out.println();

        // 🔹 Traversal using entrySet()
        System.out.println("Traverse using entrySet():");
        for (Map.Entry<Integer, String> entry : aiml.entrySet()) {
            System.out.println("Key: " + entry.getKey() + " -> Value: " + entry.getValue());
        }
        System.out.println();

        // 🔹 Traversal using forEach (Java 8+ lambda)
        System.out.println("Traverse using forEach():");
        aiml.forEach((key, value) -> {
            System.out.println("Key: " + key + " -> Value: " + value);
        });
        System.out.println();

        // 🔹 Traversal using Iterator
        System.out.println("Traverse using Iterator:");
        Iterator<Map.Entry<Integer, String>> it = aiml.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<Integer, String> entry = it.next();
            System.out.println("Key: " + entry.getKey() + " -> Value: " + entry.getValue());
        }
    }

}