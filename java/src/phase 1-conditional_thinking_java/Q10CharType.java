import java.util.Scanner;

/**
 * Phase 1: Conditional Thinking (If-Else, Boolean Logic)
 * Level 1: Simple Conditions (Getting started)
 * Question 10: Take a character and check whether it's uppercase, lowercase, a digit, or a special character.
 * 
 * Mentor Tips (Java 26):
 * - In Python, use character methods isupper(), islower(), isdigit(). In Java, use Character.isUpperCase(), Character.isLowerCase(), Character.isDigit().
 */
public class Q10CharType {

    public static String solve(char charVal) {
        // TODO: Implement this method to solve the question
        return "";
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a single character: ");\n        char val = scanner.next().charAt(0);\n        System.out.println("Result: " + solve(val));
        scanner.close();
    }
}
