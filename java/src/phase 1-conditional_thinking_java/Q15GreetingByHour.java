import java.util.Scanner;

/**
 * Phase 1: Conditional Thinking (If-Else, Boolean Logic)
 * Level 2: Nested If & Multiple Conditions
 * Question 15: Take the hour of the day (0-23) and print 'Good Morning', 'Good Afternoon', 'Good Evening', or 'Good Night'.
 * 
 * Mentor Tips (Java 26):
 * - E.g. 5-11 Good Morning, 12-16 Good Afternoon, 17-21 Good Evening, else Good Night.
 */
public class Q15GreetingByHour {

    public static String solve(int hour) {
        // TODO: Implement this method to solve the question
        return "";
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Hour (0-23): "); int hour = scanner.nextInt();
                System.out.println("Greeting: " + solve(hour));
        scanner.close();
    }
}
