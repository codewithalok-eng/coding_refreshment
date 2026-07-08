import java.util.Scanner;

/**
 * Phase 1: Conditional Thinking (If-Else, Boolean Logic)
 * Level 3: Math and Number Logic
 * Question 24: Check whether a given integer is single-digit, double-digit, or multi-digit.
 * 
 * Mentor Tips (Java 26):
 * - Take the absolute value of the number first. If it's 0-9: single-digit. If 10-99: double-digit. Else: multi-digit.
 */
public class Q24DigitCountType {

    public static String solve(int num) {
        // TODO: Implement this method to solve the question
        return "";
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Integer: "); int num = scanner.nextInt();\n        System.out.println("Digit type: " + solve(num));
        scanner.close();
    }
}
