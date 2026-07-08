import java.util.Scanner;

/**
 * Phase 1: Conditional Thinking (If-Else, Boolean Logic)
 * Level 5: Creative / Tricky Logical Scenarios
 * Question 44: Take time (hours and minutes) and print the smaller angle between the hour and minute hands.
 * 
 * Mentor Tips (Java 26):
 * - Hour hand moves 0.5 deg per minute. Minute hand moves 6 deg per minute. Hour hand also moves 30 deg per hour. Calculate absolute difference, then return min(diff, 360 - diff).
 */
public class Q44ClockAngle {

    public static double solve(int hours, int minutes) {
        // TODO: Implement this method to solve the question
        0.0;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Hours: "); int h = scanner.nextInt();
                System.out.print("Minutes: "); int m = scanner.nextInt();
                System.out.println("Smaller angle: " + solve(h, m));
        scanner.close();
    }
}
