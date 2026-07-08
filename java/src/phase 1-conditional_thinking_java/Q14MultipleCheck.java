import java.util.Scanner;

/**
 * Phase 1: Conditional Thinking (If-Else, Boolean Logic)
 * Level 2: Nested If & Multiple Conditions
 * Question 14: Check if one of two given numbers is a multiple of the other.
 * 
 * Mentor Tips (Java 26):
 * - Either a % b == 0 or b % a == 0. Make sure to handle division by zero cases if they enter 0!
 */
public class Q14MultipleCheck {

    public static boolean solve(int a, int b) {
        // TODO: Implement this method to solve the question
        return false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("First: "); int a = scanner.nextInt();\n        System.out.print("Second: "); int b = scanner.nextInt();\n        System.out.println("One is a multiple of another: " + solve(a, b));
        scanner.close();
    }
}
