import java.util.Scanner;

/**
 * Phase 1: Conditional Thinking (If-Else, Boolean Logic)
 * Level 2: Nested If & Multiple Conditions
 * Question 17: Take two numbers and determine whether both are even, both are odd, or one is even and one is odd.
 * 
 * Mentor Tips (Java 26):
 * - Check modular residues of both numbers and group them.
 */
public class Q17EvenOddCombination {

    public static String solve(int a, int b) {
        // TODO: Implement this method to solve the question
        return "";
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("First: "); int a = scanner.nextInt();
                System.out.print("Second: "); int b = scanner.nextInt();
                System.out.println("Result: " + solve(a, b));
        scanner.close();
    }
}
