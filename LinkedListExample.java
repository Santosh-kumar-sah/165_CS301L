
import java.util.*;
public class LinkedListExample {
    public static void main(String[] args) {
        LinkedList<String> ll = new LinkedList<>();
        ll.add("A");
        ll.add("B");
        ll.add("C");
        ll.add("D");
        System.out.println(ll);
        ll.addFirst("First");
        ll.addLast("Last");
        System.out.println(ll);
        ll.removeFirst();
        ll.removeLast();
        System.out.println(ll);
        System.out.println(ll.get(2));
        ll.set(2, "Z");
        System.out.println(ll);
        System.out.println("Size: " + ll.size());
        System.out.println("Contains B? " + ll.contains("B"));
        Collections.sort(ll);
        System.out.println("Sorted: " + ll);
    }
    
}
