package pl.pp;

public class Task2 {
    public static void main(String[] args) {
        // Test the factorial calculation methods and measure execution time
        int N = 10; // Change this value to calculate factorial for a different number

        // Calculate factorial iteratively
        long startTimeIterative = System.nanoTime();
        long factorialIterative = calculateFactorialIterative(N);
        long endTimeIterative = System.nanoTime();
        long executionTimeIterative = endTimeIterative - startTimeIterative;

        System.out.println("Factorial of " + N + " (calculated iteratively) is: " + factorialIterative);
        System.out.println("Execution time for iterative calculation: " + executionTimeIterative + " nanoseconds");

        // Calculate factorial recursively
        long startTimeRecursive = System.nanoTime();
        long factorialRecursive = calculateFactorialRecursive(N);
        long endTimeRecursive = System.nanoTime();
        long executionTimeRecursive = endTimeRecursive - startTimeRecursive;

        System.out.println("Factorial of " + N + " (calculated recursively) is: " + factorialRecursive);
        System.out.println("Execution time for recursive calculation: " + executionTimeRecursive + " nanoseconds");
    }

    private static long calculateFactorialIterative(int N) {
        long factorial = 1;
        for (int i = 1; i <= N; i++) {
            factorial *= i;
        }
        return factorial;
    }

    private static long calculateFactorialRecursive(int N) {
        if (N == 0 || N == 1) {
            return 1;
        } else {
            return N * calculateFactorialRecursive(N - 1);
        }
    }
}
