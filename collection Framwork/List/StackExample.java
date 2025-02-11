
import java.util.Stack;

public class StackExample {

    public static void main(String[] args) {
        // Creating a stack of integers
        Stack<Integer> stack = new Stack<>();

        // Pushing elements onto the stack
        stack.push(11);
        stack.push(25);
        stack.push(03);
        stack.push(41);
        stack.push(55);
        stack.push(88);
        stack.push(17);

        System.out.println("Stack after pushing elements: " + stack);

        // Popping the top element from the stack
        int poppedElement = stack.pop();
        System.out.println("Popped element: " + poppedElement);
        // Peeking the top element without removing it
        int topElement = stack.peek();
        System.out.println("Top element (after pop): " + topElement);
        // Checking if the stack is empty
        boolean isEmpty = stack.isEmpty();
        System.out.println("Is stack empty? " + isEmpty);
        // Iterating through the stack
        System.out.println("Iterating through the stack:");
        for (Integer element : stack) {
            System.out.println(element);
        }
    }
}
