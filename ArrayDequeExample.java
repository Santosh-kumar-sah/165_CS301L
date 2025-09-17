import java.util.ArrayDeque;

public class ArrayDequeExample{

    public static void main(String[] args) {
        ArrayDeque<String> deque = new ArrayDeque();

        deque.add("A");//when binded queue if full it throws an error
        deque.addFirst("F");
        deque.addLast("L");

        deque.offer("C");//it does not throw error
        deque.offerFirst("first");
        deque.offerLast("Last");

        System.out.println("Elements are"+deque);

        System.out.println("First element(peek)"+deque.peek());
        System.out.println("First element (peekFirst)"+deque.peekFirst());
        System.out.println("Last element(peekLast)"+deque.peekFirst());


        System.out.println("Removing elements...");
        System.out.println("Removed first(removeFirst)"+deque.removeFirst());
        System.out.println("Removed last(removeLast):"+deque.removeLast());
        System.out.println("Removed first(pollFirst):"+deque.pollFirst());
        System.out.println("Removed Last(pollLast):"+deque.pollLast());

        System.out.println("Deque after removals");
        System.out.println(deque);
    }
    
}