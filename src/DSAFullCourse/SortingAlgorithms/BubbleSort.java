package DSAFullCourse.SortingAlgorithms;

import java.util.Arrays;

// Bubble Sort
public class BubbleSort {
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {5, 3, 8, 6, 2, 7, 4, 1};
        bubbleSort(arr);
        System.out.println("Sorted array: " + Arrays.toString(arr));
    }
}

/*
Explanation of Bubble Sort:
- We iterate through the array multiple times.
- In each pass, adjacent elements are compared and swapped if they are in the wrong order.
- The largest element bubbles to the end with each full pass.
- The process is repeated until the array is fully sorted.
- Time Complexity: O(n^2) in worst and average cases, O(n) in best case (already sorted).
*/