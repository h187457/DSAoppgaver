package DSAFullCourse.PriorityQueues;

import DSAFullCourse.Heaps.MaxHeap;

import java.util.*; // Importing utilities

public class PriorityQueueExample {
    private final MaxHeap maxHeap;

    public PriorityQueueExample(int capacity) {
        maxHeap = new MaxHeap(capacity); // Initialize a max heap for the priority queue
    }

    // Add an element with priority
    public void add(int priority) {
        maxHeap.insert(priority); // Insert the priority element into the heap
    }

    // Remove and return the element with the highest priority
    public int remove() {
        if (maxHeap == null) {
            throw new NoSuchElementException("Priority Queue is empty");
        }
        int highestPriority = maxHeap.heap[0]; // The root of the heap is the element with highest priority
        maxHeap.heapifyUp(0); // Restore heap property
        return highestPriority;
    }

    public static void main(String[] args) {
        PriorityQueueExample pq = new PriorityQueueExample(10);

        pq.add(5);
        pq.add(1);
        pq.add(10);
        pq.add(8);

        System.out.println("Removed: " + pq.remove()); // Should print 10
        System.out.println("Removed: " + pq.remove()); // Should print 8
    }
}

/*
  Explanation of Priority Queue:

  - Time Complexity for add: O(log n), as we need to maintain the heap property.
  - Space Complexity: O(n), as we are storing the elements in the heap array.

  - The PriorityQueueExample class uses a Max Heap to implement a priority queue.
  - The `add()` method inserts an element based on priority.
  - The `remove()` method removes and returns the element with the highest priority (root of the heap).
*/
