import java.util.Scanner;

/**
 * Phase 1: Conditional Thinking (If-Else, Boolean Logic)
 * Level 5: Creative / Tricky Logical Scenarios
 * Question 43: Take day and month and check if it forms a valid calendar date (ignoring leap years).
 * 
 * Mentor Tips (Java 26):
 * - Check month boundaries (1-12) and day boundaries based on the month (e.g. 30 vs 31 days, and Feb max 28 days).
 */
public class Q43ValidDate {

    public static boolean solve(int day, int month) {
        // TODO: Implement this method to solve the question
        false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Day: "); int d = scanner.nextInt();
                System.out.print("Month: "); int m = scanner.nextInt();
                System.out.println("Valid date: " + solve(d, m));
        scanner.close();
    }
}
