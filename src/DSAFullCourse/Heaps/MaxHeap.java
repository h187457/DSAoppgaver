package DSAFullCourse.Heaps;

// Max Heap implementation
public class MaxHeap {
    public int[] heap;
    private int size;

    public MaxHeap(int capacity) {
        heap = new int[capacity]; // Initialize the heap array with the given capacity
        size = 0; // Start with an empty heap
    }

    // Parent index of a node
    private int parent(int index) {
        return (index - 1) / 2;
    }

    // Left child index of a node
    private int leftChild(int index) {
        return 2 * index + 1;
    }

    // Right child index of a node
    private int rightChild(int index) {
        return 2 * index + 2;
    }

    // Swap two elements in the heap
    private void swap(int index1, int index2) {
        int temp = heap[index1];
        heap[index1] = heap[index2];
        heap[index2] = temp;
    }

    // Heapify the tree (ensure heap property)
    public void heapifyUp(int index) {
        while (index > 0 && heap[parent(index)] < heap[index]) {
            swap(index, parent(index));
            index = parent(index);
        }
    }

    // Insert a new element into the heap
    public void insert(int value) {
        if (size == heap.length) {
            throw new IllegalStateException("Heap is full");
        }
        heap[size] = value; // Add the new value at the end
        heapifyUp(size); // Restore the heap property
        size++;
    }

    // Print the heap
    public void printHeap() {
        for (int i = 0; i < size; i++) {
            System.out.print(heap[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        MaxHeap maxHeap = new MaxHeap(10);
        maxHeap.insert(10);
        maxHeap.insert(20);
        maxHeap.insert(15);
        maxHeap.insert(30);
        maxHeap.insert(25);

        maxHeap.printHeap(); // Should print: 30 25 15 10 20
    }
}

/*
  Explanation of Max Heap:

  - Time Complexity for insert: O(log n), because we need to maintain the heap property by "bubbling up" the inserted element.
  - Space Complexity: O(n), as we store all elements in the heap array.

  - Max Heaps are complete binary trees where each parent node is greater than or equal to its child nodes.
  - The `insert()` method places a new value at the end of the heap and then adjusts the heap using `heapifyUp()`.
  - The `printHeap()` method prints the elements of the heap array.
*/
