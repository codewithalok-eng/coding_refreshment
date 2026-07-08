import java.util.Scanner;

/**
 * Phase 1: Conditional Thinking (If-Else, Boolean Logic)
 * Level 1: Simple Conditions (Getting started)
 * Question 6: Take two numbers and print the larger one.
 * 
 * Mentor Tips (Java 26):
 * - Use a simple if-else comparison or Python's max() / Java's Math.max().
 */
public class Q6LargerOfTwo {

    public static double solve(double a, double b) {
        // TODO: Implement this method to solve the question
        return 0.0;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number: ");
                double a = scanner.nextDouble();
                System.out.print("Enter second number: ");
                double b = scanner.nextDouble();
                System.out.println("Larger number: " + solve(a, b));
        scanner.close();
    }
}
