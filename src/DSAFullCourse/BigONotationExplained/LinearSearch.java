package DSAFullCourse.BigONotationExplained;

// Linear search in an array
public class LinearSearch {
    public static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i; // Return the index where the target is found
            }
        }
        return -1; // If target is not found, return -1
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int target = 3;
        int result = linearSearch(arr, target);
        System.out.println("Target found at index: " + result);
    }
}

/*
  Explanation of Big-O and Linear Search:

  - Time Complexity: O(n) because in the worst case, we may need to search through all 'n' elements in the array.
  - Space Complexity: O(1), since we're only using a few variables and the space used does not depend on the size of the input.

  - In this code, we loop through the array from index 0 to n (the length of the array).
  - We check each element one by one, comparing it with the target value.
  - If we find the target, we return the index; otherwise, after finishing the loop, we return -1 to indicate the target was not found.
*/
