import java.util.Scanner;

/**
 * Phase 1: Conditional Thinking (If-Else, Boolean Logic)
 * Level 2: Nested If & Multiple Conditions
 * Question 18: Take an alphabet character and check if it lies between 'a' and 'm' or 'n' and 'z'.
 * 
 * Mentor Tips (Java 26):
 * - You can compare characters directly using '<=' and '>=' (comparison is lexicographical).
 */
public class Q18AlphabetRange {

    public static String solve(char charVal) {
        // TODO: Implement this method to solve the question
        return "";
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Char: "); char c = scanner.next().charAt(0);
                System.out.println("Range: " + solve(c));
        scanner.close();
    }
}
