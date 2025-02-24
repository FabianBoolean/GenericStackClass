/**
 * A generic Stack class that provides basic stack operations (push, pop, peek, and list).
 * @author Fabian Steinhauser
 * @version 2025-02-22
 * @param <T> the type of elements in the stack
 */
public class Stack<T> {
    private Object[] array; // Generic array (actually an Object array)
    private int top;
    private int capacity;

    /**
     * Default constructor with a capacity of 10.
     */
    public Stack() {
        this.capacity = 10;
        this.array = new Object[capacity];
        this.top = -1;  // Initially the stack is empty
    }

    /**
     * Constructor with custom capacity.
     * @param capacity the capacity of the stack
     */
    public Stack(int capacity) {
        this.capacity = capacity;
        this.array = new Object[capacity];
        this.top = -1;
    }

    /**
     * Adds an element to the stack.
     * @param item the element to be pushed onto the stack
     * @throws StackFullException if the stack is full
     */
    public void push(T item) throws StackFullException {
        if (top == capacity - 1) {
            throw new StackFullException("Stack is full, cannot push element.");
        }
        array[++top] = item; // Increment top and push the item
    }

    /**
     * Removes and returns the last element from the stack.
     * @return the element at the top of the stack
     * @throws StackEmptyException if the stack is empty
     */
    public T pop() throws StackEmptyException {
        if (top == -1) {
            throw new StackEmptyException("Stack is empty, cannot pop element.");
        }
        T item = (T) array[top--]; // Pop the top item and decrement top
        return item;
    }

    /**
     * Returns the last element from the stack without removing it.
     * @return the element at the top of the stack
     * @throws StackEmptyException if the stack is empty
     */
    public T peek() throws StackEmptyException {
        if (top == -1) {
            throw new StackEmptyException("Stack is empty, cannot peek.");
        }
        return (T) array[top]; // Return the top element without removing it
    }

    /**
     * Lists all elements in the stack as a concatenated string.
     * @return a string representing all elements in the stack
     */
    public String list() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i <= top; i++) {
            sb.append(array[i].toString());
            if (i < top) {
                sb.append(";");
            }
        }
        return sb.toString();
    }
}
