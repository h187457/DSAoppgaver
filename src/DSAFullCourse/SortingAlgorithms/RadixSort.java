package DSAFullCourse.SortingAlgorithms;

import java.util.Arrays;

public class RadixSort {
    public static void radixSort(int[] arr) {
        int max = Arrays.stream(arr).max().getAsInt();
        for (int exp = 1; max / exp > 0; exp *= 10) {
            countingSortByDigit(arr, exp);
        }
    }

    private static void countingSortByDigit(int[] arr, int exp) {
        int n = arr.length;
        int[] output = new int[n];
        int[] count = new int[10];

        // Count occurrences of digits
        for (int num : arr) {
            int digit = (num / exp) % 10;
            count[digit]++;
        }

        // Convert count array to prefix sum
        for (int i = 1; i < 10; i++) {
            count[i] += count[i - 1];
        }

        // Build sorted array based on current digit
        for (int i = n - 1; i >= 0; i--) {
            int digit = (arr[i] / exp) % 10;
            output[count[digit] - 1] = arr[i];
            count[digit]--;
        }

        // Copy back to original array
        System.arraycopy(output, 0, arr, 0, n);
    }

    public static void main(String[] args) {
        int[] arr = {170, 45, 75, 90, 802, 24, 2, 66};
        radixSort(arr);
        System.out.println("Radix Sort: " + Arrays.toString(arr));
    }
}

/*
### **Explanation:**
1. **Find Max Value** - Determines how many digit places to sort.
2. **Sort by Each Digit** - Uses Counting Sort on ones, tens, hundreds, etc.
3. **Update Array** - Reorders numbers based on current digit.
✔️ **Time Complexity:** O(nk), where k is the max number of digits.
✔️ **Best Use Case:** Sorting large numbers efficiently without comparisons.
*/
