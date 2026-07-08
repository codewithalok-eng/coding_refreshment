import java.util.Scanner;

/**
 * Phase 1: Conditional Thinking (If-Else, Boolean Logic)
 * Level 1: Simple Conditions (Getting started)
 * Question 3: Check if a number is divisible by 5.
 * 
 * Mentor Tips (Java 26):
 * - A number is divisible by 5 if the remainder when divided by 5 is 0 (number % 5 == 0).
 */
public class Q3DivisibleBy5 {

    public static boolean solve(int number) {
        // TODO: Implement this method to solve the question
        return false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");\n        int val = scanner.nextInt();\n        System.out.println("Divisible by 5: " + solve(val));
        scanner.close();
    }
}
