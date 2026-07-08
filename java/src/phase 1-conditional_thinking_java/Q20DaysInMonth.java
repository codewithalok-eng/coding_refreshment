import java.util.Scanner;

/**
 * Phase 1: Conditional Thinking (If-Else, Boolean Logic)
 * Level 2: Nested If & Multiple Conditions
 * Question 20: Take a month number (1-12) and print the number of days in that month (ignore leap years).
 * 
 * Mentor Tips (Java 26):
 * - Group months: 30 days (4, 6, 9, 11), 31 days (1, 3, 5, 7, 8, 10, 12), 28 days (2). Use list check or group in switch.
 */
public class Q20DaysInMonth {

    public static int solve(int month) {
        // TODO: Implement this method to solve the question
        0;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Month number (1-12): "); int m = scanner.nextInt();
                System.out.println("Days: " + solve(m));
        scanner.close();
    }
}
