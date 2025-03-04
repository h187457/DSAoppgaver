package DSAFullCourse.Recursion;

// Recursive method to calculate the factorial of a number
public class Factorial {
    public static int factorial(int n) {
        if (n == 0) {
            return 1; // Base case: factorial of 0 is 1
        } else {
            return n * factorial(n - 1); // Recursive call
        }
    }

    public static void main(String[] args) {
        int number = 5;
        int result = factorial(number); // Calculate the factorial of 5
        System.out.println("Factorial of " + number + " is: " + result);
    }
}

/*
  Explanation of Recursion:

  - The base case is when `n == 0`. For all other values, we reduce the problem by calling the function again with `n-1`.
  - Each recursive call multiplies the current number (`n`) with the factorial of `n-1` until the base case is reached.
  - This process builds up a call stack as the function calls itself, which then unwinds once the base case is met.
*/
