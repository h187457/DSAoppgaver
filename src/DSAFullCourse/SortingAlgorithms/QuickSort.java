package DSAFullCourse.SortingAlgorithms;

// QuickSort implementation
public class QuickSort {
    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(arr, low, high); // Find the pivot index
            quickSort(arr, low, pivotIndex - 1); // Recursively sort the left part
            quickSort(arr, pivotIndex + 1, high); // Recursively sort the right part
        }
    }

    // Partition the array and return the index of the pivot
    public static int partition(int[] arr, int low, int high) {
        int pivot = arr[high]; // Choose the last element as pivot
        int i = (low - 1); // Index of smaller element
        for (int j = low; j < high; j++) {
            if (arr[j] <= pivot) { // If the current element is less than or equal to the pivot
                i++; // Increment the index of the smaller element
                // Swap arr[i] and arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        // Swap the pivot element with the element at i + 1
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;
        return i + 1; // Return the partition index
    }

    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " "); // Print each element of the array
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {10, 80, 30, 90, 40, 50, 70};
        System.out.println("Original array:");
        printArray(arr);

        quickSort(arr, 0, arr.length - 1); // Sort the array using QuickSort

        System.out.println("Sorted array:");
        printArray(arr); // Print the sorted array
    }
}

/*
  Explanation of QuickSort:

  - Time Complexity: O(n log n) on average, O(n²) in the worst case (when the pivot is the smallest or largest element).
  - Space Complexity: O(log n), as the recursive calls use stack space.

  - QuickSort works by choosing a pivot element and partitioning the array into two parts:
    - Elements smaller than the pivot go to the left.
    - Elements greater than the pivot go to the right.
  - Then, it recursively sorts the left and right parts.
  - This is a much faster algorithm compared to Bubble Sort for large datasets due to its average time complexity of O(n log n).
*/
