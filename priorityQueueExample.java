import java.util.PriorityQueue;

public class priorityQueueExample {

    public static void main(String[] args) {
        // Create a PriorityQueue to hold Integer elements
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        
        // Add elements to the PriorityQueue
        priorityQueue.add(30);
        priorityQueue.add(10);
        priorityQueue.add(20);
        System.out.println("PriorityQueue after adding elements: " + priorityQueue);

        // offer() method to add elements
        priorityQueue.offer(5);//returns true if the element is added successfully
        System.out.println("PriorityQueue after offering an element: " + priorityQueue);
        
        // Access the head element of the PriorityQueue
        int headElement = priorityQueue.peek();
        System.out.println("Head element: " + headElement);
        
        // Remove the head element from the PriorityQueue
        int removedElement = priorityQueue.poll();
        System.out.println("Removed element: " + removedElement);
        System.out.println("PriorityQueue after polling the head element: " + priorityQueue);

        // Remove a specific element(do not handle exception handling)
        boolean isRemoved = priorityQueue.remove(20); // returns true if the element was present
        System.out.println("Was the element 20 removed? " + isRemoved);
        System.out.println("PriorityQueue after removing element 20: " + priorityQueue);
        
        // Check if the PriorityQueue is empty
        boolean isEmpty = priorityQueue.isEmpty();
        System.out.println("Is the PriorityQueue empty? " + isEmpty);
        
        // Check the size of the PriorityQueue
        int size = priorityQueue.size();
        System.out.println("Size of the PriorityQueue: " + size);
        
        // Iterate through the PriorityQueue
        System.out.println("Iterating through the PriorityQueue:");
        for (Integer num : priorityQueue) {
            System.out.println(num);
        }
        
        // Clear all elements from the PriorityQueue
        priorityQueue.clear();
        System.out.println("PriorityQueue after clearing all elements: " + priorityQueue);
    }


    
}
