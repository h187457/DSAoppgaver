package DSAFullCourse.SortingAlgorithms;

import java.util.Arrays;

// Selection Sort
public class SelectionSort {
    public static void selectionSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }

    public static void main(String[] args) {
        int[] arr = {29, 10, 14, 37, 13};
        selectionSort(arr);
        System.out.println("Sorted array: " + Arrays.toString(arr));
    }
}

/*
Explanation of Selection Sort:
- We iterate through the array and find the smallest element in the remaining part.
- Swap the smallest element with the first element of the unsorted part.
- Repeat for the next unsorted part.
- Time Complexity: O(n^2) in all cases.
*/