import java.util.Scanner;

/**
 * Phase 1: Conditional Thinking (If-Else, Boolean Logic)
 * Level 4: Logical Operators & Compound Statements
 * Question 38: Take a weekday number (1-7) and determine if it is a weekday or weekend.
 * 
 * Mentor Tips (Java 26):
 * - Weekday is 1 to 5, weekend is 6 and 7. You can check: day in [6, 7] or day == 6 || day == 7.
 */
public class Q38WeekdayWeekend {

    public static String solve(int day) {
        // TODO: Implement this method to solve the question
        return "Invalid";
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Day number (1-7): "); int d = scanner.nextInt();
                System.out.println("Type: " + solve(d));
        scanner.close();
    }
}
