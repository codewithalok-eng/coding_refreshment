import java.util.Scanner;

/**
 * Phase 1: Conditional Thinking (If-Else, Boolean Logic)
 * Level 1: Simple Conditions (Getting started)
 * Question 9: Take a character and check if it's a vowel or consonant.
 * 
 * Mentor Tips (Java 26):
 * - Check if character (converted to lowercase) is one of 'a', 'e', 'i', 'o', 'u'.
 */
public class Q9VowelConsonant {

    public static String solve(char charVal) {
        // TODO: Implement this method to solve the question
        return "";
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a single letter: ");\n        char val = scanner.next().charAt(0);\n        System.out.println("Result: " + solve(val));
        scanner.close();
    }
}
