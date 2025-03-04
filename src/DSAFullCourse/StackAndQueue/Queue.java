package DSAFullCourse.StackAndQueue;

// Queue implementation using an array
public class Queue {
    private int[] queue;
    private int front, rear, size;

    public Queue(int capacity) {
        queue = new int[capacity];
        front = 0;
        rear = -1;
        size = 0;
    }

    // Enqueue operation (add to the rear of the queue)
    public void enqueue(int value) {
        if (size == queue.length) {
            System.out.println("Queue is full!");
        } else {
            rear = (rear + 1) % queue.length; // Circular queue, to avoid overflow
            queue[rear] = value;
            size++;
        }
    }

    // Dequeue operation (remove from the front of the queue)
    public int dequeue() {
        if (size == 0) {
            System.out.println("Queue is empty!");
            return -1;
        } else {
            int dequeuedValue = queue[front];
            front = (front + 1) % queue.length; // Circular queue logic
            size--;
            return dequeuedValue;
        }
    }

    public static void main(String[] args) {
        Queue q = new Queue(5); // Create a queue with capacity of 5
        q.enqueue(10); // Enqueue 10
        q.enqueue(20); // Enqueue 20
        System.out.println("Dequeued value: " + q.dequeue()); // Dequeue and print
    }
}

/*
  Explanation of Queue Implementation:

  - The queue is implemented using a circular array to efficiently reuse space.
  - The `enqueue()` method adds elements to the rear of the queue.
  - The `dequeue()` method removes elements from the front of the queue.

  - Time complexity for both `enqueue` and `dequeue` operations is O(1).
  - Arrays are used in the circular queue implementation to efficiently manage space.

  - The key difference between stacks and queues is the order in which elements are added and removed:
    - Stack (LIFO): Last element added is the first one to be removed.
    - Queue (FIFO): First element added is the first one to be removed.
*/
