import java.util.Scanner;

/**
 * Phase 1: Conditional Thinking (If-Else, Boolean Logic)
 * Level 4: Logical Operators & Compound Statements
 * Question 34: Take 24-hour time (hours and minutes) and print whether it is AM or PM.
 * 
 * Mentor Tips (Java 26):
 * - 0 to 11 is AM, 12 to 23 is PM. (Usually 12:00 PM starts noon, 0:00 AM is midnight).
 */
public class Q34AmPmConvert {

    public static String solve(int hours, int minutes) {
        // TODO: Implement this method to solve the question
        return "";
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Hours (0-23): "); int h = scanner.nextInt();
                System.out.print("Minutes (0-59): "); int m = scanner.nextInt();
                System.out.println("Time: " + solve(h, m));
        scanner.close();
    }
}
