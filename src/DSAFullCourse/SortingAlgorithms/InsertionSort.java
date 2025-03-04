package DSAFullCourse.SortingAlgorithms;

import java.util.Arrays;

// Insertion Sort
public class InsertionSort {
    public static void insertionSort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }

    public static void main(String[] args) {
        int[] arr = {9, 5, 1, 4, 3};
        insertionSort(arr);
        System.out.println("Sorted array: " + Arrays.toString(arr));
    }
}

/*
Explanation of Insertion Sort:
- We start from the second element and compare it with the previous elements.
- Shift the larger elements to the right and insert the selected element at its correct position.
- Time Complexity: O(n^2) worst and average case, O(n) best case.
*/