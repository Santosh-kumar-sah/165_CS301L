
import java.util.Stack;
public class StackExample {

    public static void main(String[] args) {
        // Create a Stack to hold Integer elements
        Stack<Integer> stack = new Stack<>();
        
        // Add elements to the Stack
        stack.push(10);
        stack.push(20);
        stack.push(30);
        System.out.println("Stack after pushing elements: " + stack);
        
        // Access the top element of the Stack
        int topElement = stack.peek();
        System.out.println("Top element: " + topElement);
        
        // Remove the top element from the Stack
        int removedElement = stack.pop();
        System.out.println("Removed element: " + removedElement);
        System.out.println("Stack after popping the top element: " + stack);
        
        // Check if the Stack is empty
        boolean isEmpty = stack.isEmpty();
        System.out.println("Is the Stack empty? " + isEmpty);
        
        // Check the size of the Stack
        int size = stack.size();
        System.out.println("Size of the Stack: " + size);
        
        // Iterate through the Stack
        System.out.println("Iterating through the Stack:");
        for (Integer num : stack) {
            System.out.println(num);
        }
        // Search for an element in the Stack
        int position = stack.search(20);    
        System.out.println("Position of element 20 in the Stack: " + position);
    }
    
}
