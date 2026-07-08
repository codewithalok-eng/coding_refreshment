import java.util.Scanner;

/**
 * Phase 1: Conditional Thinking (If-Else, Boolean Logic)
 * Level 3: Math and Number Logic
 * Question 21: Take a 3-digit number and check if all digits are distinct.
 * 
 * Mentor Tips (Java 26):
 * - Extract digits using / and % operators. Let d1 = num / 100, d2 = (num / 10) % 10, d3 = num % 10. Check if d1 != d2 and d2 != d3 and d1 != d3.
 */
public class Q21DistinctDigits {

    public static boolean solve(int num) {
        // TODO: Implement this method to solve the question
        false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("3-digit number: "); int num = scanner.nextInt();\n        System.out.println("Distinct: " + solve(num));
        scanner.close();
    }
}
