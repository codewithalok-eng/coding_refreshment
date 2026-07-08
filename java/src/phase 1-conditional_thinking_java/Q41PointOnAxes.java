import java.util.Scanner;

/**
 * Phase 1: Conditional Thinking (If-Else, Boolean Logic)
 * Level 5: Creative / Tricky Logical Scenarios
 * Question 41: Take coordinates (x, y) and check if the point lies on the X-axis, Y-axis, or at the origin.
 * 
 * Mentor Tips (Java 26):
 * - Origin if x == 0 and y == 0. X-axis if y == 0 (and x != 0). Y-axis if x == 0 (and y != 0).
 */
public class Q41PointOnAxes {

    public static String solve(double x, double y) {
        // TODO: Implement this method to solve the question
        return "";
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("x: "); double x = scanner.nextDouble();\n        System.out.print("y: "); double y = scanner.nextDouble();\n        System.out.println("Point lies on: " + solve(x, y));
        scanner.close();
    }
}
