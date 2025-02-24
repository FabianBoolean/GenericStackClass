/**
 * Exception thrown when attempting to perform an operation on a full stack.
 * @author Fabian Steinhauser
 * @version 2025-02-22
 */
public class StackFullException extends Exception {
    /**
     * Constructs a new StackFullException with the specified detail message.
     *
     * @param message the detail message
     */
    public StackFullException(String message) {
        super(message);
    }

    /**
     * Constructs a new StackFullException with a default message.
     */
    public StackFullException() {
        super("Stack is full!");
    }
}