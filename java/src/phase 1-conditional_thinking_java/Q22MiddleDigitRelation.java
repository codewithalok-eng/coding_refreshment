import java.util.Scanner;

/**
 * Phase 1: Conditional Thinking (If-Else, Boolean Logic)
 * Level 3: Math and Number Logic
 * Question 22: Take a 3-digit number and determine if the middle digit is the largest, smallest, or neither.
 * 
 * Mentor Tips (Java 26):
 * - Extract three digits. Let middle be d2. Compare d2 against d1 (hundreds) and d3 (units).
 */
public class Q22MiddleDigitRelation {

    public static String solve(int num) {
        // TODO: Implement this method to solve the question
        return "";
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("3-digit number: "); int num = scanner.nextInt();
                System.out.println("Middle relation: " + solve(num));
        scanner.close();
    }
}
