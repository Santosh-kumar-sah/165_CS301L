import java.util.Vector;

public class VecoterExample {
    public static void main(String[] args) {
        // Create a Vector to hold Integer elements
        Vector<Integer> vector = new Vector<>(4);
        System.out.println(vector.capacity());// Default capacity is 10

        // Add elements to the Vector                    
        vector.add(10);
        vector.add(20);
        vector.add(30);
        System.out.println("Vector after adding elements: " + vector);

        // Access elements in the Vector
        int firstElement = vector.get(0);
        System.out.println("First element: " + firstElement);

        // Remove an element from the Vector
        vector.remove(1); // Removes the element at index 1 (20)
        System.out.println("Vector after removing element at index 1: " + vector);

        // Iterate through the Vector
        System.out.println("Iterating through the Vector:");
        for (Integer num : vector) {
            System.out.println(num);
        }

        // Check the size of the Vector
        int size = vector.size();
        System.out.println("Size of the Vector: " + size);
        
        // First Element
        System.out.println("First element of vector: " + vector.firstElement());

        // Last Element
        System.out.println("Last element of vector: " + vector.lastElement());

        Vector<Integer> vc2 = new Vector<>();
        vc2.add(100);
        vc2.add(200);       
        vc2.add(300);

        System.out.println("second Vector vc2: " + vc2);

        vc2.addAll(vector); // Adding all elements from vector to vc2
        System.out.println("vc2 after adding all elements from vector: " + vc2);
        vc2.removeAll(vector); // Removing all elements of vector from vc2
        System.out.println("vc2 after removing all elements of vector: " + vc2);

        
        // Clear all elements from the Vector
        vector.clear();
        System.out.println("Vector after clearing all elements: " + vector);

    }
}