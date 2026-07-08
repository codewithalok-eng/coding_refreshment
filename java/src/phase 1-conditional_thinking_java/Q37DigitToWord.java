import java.util.Scanner;

/**
 * Phase 1: Conditional Thinking (If-Else, Boolean Logic)
 * Level 4: Logical Operators & Compound Statements
 * Question 37: Take a single digit (0-9) and print its word form ('Zero' to 'Nine').
 * 
 * Mentor Tips (Java 26):
 * - Use a match-case statement in Python 3.14, and switch statement/expression in Java 26.
 */
public class Q37DigitToWord {

    public static String solve(int digit) {
        // TODO: Implement this method to solve the question
        return "Invalid";
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digit (0-9): "); int d = scanner.nextInt();
                System.out.println("Word: " + solve(d));
        scanner.close();
    }
}
