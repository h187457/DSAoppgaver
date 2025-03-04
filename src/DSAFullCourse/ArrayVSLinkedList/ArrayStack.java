package DSAFullCourse.ArrayVSLinkedList;

// Array-based stack implementation
public class ArrayStack {
    private int[] stack;
    private int top;

    public ArrayStack(int size) {
        stack = new int[size]; // Initialize the stack with a fixed size
        top = -1; // Stack is empty initially
    }

    // Push an element onto the stack
    public void push(int value) {
        if (top == stack.length - 1) {
            System.out.println("Stack is full!"); // Cannot push if the stack is full
        } else {
            stack[++top] = value; // Increment top and insert the value
        }
    }

    // Pop an element from the stack
    public int pop() {
        if (top == -1) {
            System.out.println("Stack is empty!"); // Cannot pop if the stack is empty
            return -1;
        } else {
            return stack[top--]; // Return the top value and decrement the top index
        }
    }

    public static void main(String[] args) {
        ArrayStack stack = new ArrayStack(5); // Create a stack of size 5
        stack.push(10); // Push 10 onto the stack
        stack.push(20); // Push 20 onto the stack
        System.out.println("Popped value: " + stack.pop()); // Pop and print the top value
    }
}

/*
  Explanation of Arrays vs Linked Lists:

  - Arrays have a fixed size, and elements are stored in contiguous memory locations.
  - Linked Lists have a dynamic size, where each node contains data and a reference (or pointer) to the next node in the list.

  In the above example, we implement a stack using an array. The `push()` method adds elements to the top of the stack, and the `pop()` method removes elements from the top.
  The stack can hold only a fixed number of elements (5 in this case), which is a limitation of using arrays.

  - Arrays are better when you need fast access to elements by index (O(1) time).
  - Linked Lists are better when you need frequent insertions and deletions (O(1) time for insert/delete at the head or tail).
*/
