import java.util.Scanner;

/**
 * Phase 1: Conditional Thinking (If-Else, Boolean Logic)
 * Level 4: Logical Operators & Compound Statements
 * Question 31: Take a character and check if it is a letter, a digit, or neither.
 * 
 * Mentor Tips (Java 26):
 * - Python: char.isalpha() or char.isdigit(). Java: Character.isLetter() or Character.isDigit().
 */
public class Q31CharClassification {

    public static String solve(char charVal) {
        // TODO: Implement this method to solve the question
        return "";
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Char: "); char c = scanner.next().charAt(0);\n        System.out.println("Classification: " + solve(c));
        scanner.close();
    }
}
