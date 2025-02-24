/**
 * A test class for demonstrating the functionality of the Stack class.
 * It tests the stack with both Integer and String types, checking various operations such as push, pop, peek, and handling exceptions.
 * @author Fabian Steinhauser
 * @version 2025-02-22
 */
public class StackTest {

    /**
     * Main method to run the stack test.
     *
     * @param args the command line arguments (not used)
     */
    public static void main(String[] args) {
        // Testing with a stack of integers
        System.out.println("Testing Integer Stack:");
        Stack<Integer> intStack = new Stack<>(5); // Stack with capacity of 5

        try {
            // Push elements to the stack
            intStack.push(10);
            intStack.push(20);
            intStack.push(30);
            intStack.push(40);
            intStack.push(50);

            System.out.println("List of elements in stack: " + intStack.list());

            // Test peek and pop methods
            System.out.println("Peek: " + intStack.peek()); // Should return 50
            System.out.println("Pop: " + intStack.pop()); // Should return 50
            System.out.println("Pop: " + intStack.pop()); // Should return 40

            System.out.println("List of elements after pop operations: " + intStack.list());

            // Trying to push when the stack is full should throw StackFullException
            intStack.push(60);
            intStack.push(70); // Should throw StackFullException here

        } catch (StackFullException | StackEmptyException e) {
            System.out.println(e.getMessage());
        }

        // Testing with a stack of strings
        System.out.println("\nTesting String Stack:");
        Stack<String> strStack = new Stack<>(3); // Stack with capacity of 3

        try {
            // Push elements to the string stack
            strStack.push("Hello");
            strStack.push("World");
            strStack.push("Java");

            System.out.println("List of elements in stack: " + strStack.list());

            // Test peek and pop methods
            System.out.println("Peek: " + strStack.peek()); // Should return "Java"
            System.out.println("Pop: " + strStack.pop()); // Should return "Java"
            System.out.println("Pop: " + strStack.pop()); // Should return "World"

            System.out.println("List of elements after pop operations: " + strStack.list());

            // Trying to pop from an empty stack should throw StackEmptyException
            System.out.println("Pop: " + strStack.pop()); // Should return "Hello"
            System.out.println("Pop: " + strStack.pop()); // Should throw StackEmptyException here

        } catch (StackFullException | StackEmptyException e) {
            System.out.println(e.getMessage());
        }
    }
}
