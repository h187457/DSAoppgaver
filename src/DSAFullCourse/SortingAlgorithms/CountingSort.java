package DSAFullCourse.SortingAlgorithms;

import java.util.Arrays;

public class CountingSort {
    public static void countingSort(int[] arr) {
        // Find the maximum value in the array
        int max = Arrays.stream(arr).max().getAsInt();

        // Create a count array to store the frequency of each element
        int[] count = new int[max + 1];

        // Count occurrences of each element
        for (int num : arr) {
            count[num]++;
        }

        // Reconstruct the sorted array
        int index = 0;
        for (int i = 0; i <= max; i++) {
            while (count[i] > 0) {
                arr[index++] = i;
                count[i]--;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {4, 2, 2, 8, 3, 3, 1};
        countingSort(arr);
        System.out.println("Counting Sort: " + Arrays.toString(arr));
    }
}

/*
### **Explanation:**
1. **Find Max Value** - Identify the largest number to determine the count array size.
2. **Create Count Array** - An array where the index represents a number and the value represents how many times it appears.
3. **Fill Count Array** - Count occurrences of each number.
4. **Reconstruct Sorted Array** - Iterate through the count array and place numbers back in sorted order.
✔️ **Time Complexity:** O(n + k), where k is the max element.
✔️ **Best Use Case:** Sorting small-range integers efficiently.
*/
