import java.util.Scanner;

/**
 * Phase 1: Conditional Thinking (If-Else, Boolean Logic)
 * Level 1: Simple Conditions (Getting started)
 * Question 7: Take three numbers and print the largest.
 * 
 * Mentor Tips (Java 26):
 * - Compare using relational operators (e.g. if a >= b and a >= c) or nest conditions.
 */
public class Q7LargestOfThree {

    public static double solve(double a, double b, double c) {
        // TODO: Implement this method to solve the question
        return 0.0;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number: ");\n        double a = scanner.nextDouble();\n        System.out.print("Enter second number: ");\n        double b = scanner.nextDouble();\n        System.out.print("Enter third number: ");\n        double c = scanner.nextDouble();\n        System.out.println("Largest: " + solve(a, b, c));
        scanner.close();
    }
}
