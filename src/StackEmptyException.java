/**
 * Exception thrown when attempting to perform an operation on an empty stack.
 * @author Fabian Steinhauser
 * @version 2025-02-22
 */
public class StackEmptyException extends Exception {
    /**
     * Constructs a new StackEmptyException with the specified detail message.
     * @param message the detail message
     */
    public StackEmptyException(String message) {
        super(message);
    }

    /**
     * Constructs a new StackEmptyException with a default message.
     */
    public StackEmptyException() {
        super("Stack is Empty!");
    }
}
