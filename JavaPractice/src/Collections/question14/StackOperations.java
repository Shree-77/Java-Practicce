package Collections.question14;

import java.util.Stack;

/**
 * Stack Implementation
 *     Implement a Stack using the LinkedList class from the Java Collections framework. Write methods to perform the following stack operations:
 *
 *     a) Push an element onto the stack.
 *     b) Pop an element from the stack.
 *     c) Peek at the top element without removing it.
 *     d) Check if the stack is empty.
 *     e) Find the size of the stack.
 */

public class StackOperations {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        stack.push("Shree");
        stack.add("ME");
        stack.add("batman");
        stack.push("Dark Knight");
        System.out.println(stack);

        stack.pop();
        System.out.println(stack);

        System.out.println(stack.isEmpty());

        System.out.println(stack.size());

        System.out.println(stack.peek());

    }
}
