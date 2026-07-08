import java.util.Scanner;

/**
 * Phase 1: Conditional Thinking (If-Else, Boolean Logic)
 * Level 3: Math and Number Logic
 * Question 26: Take coordinates (x, y) and determine which quadrant the point lies in.
 * 
 * Mentor Tips (Java 26):
 * - Q1: x > 0, y > 0; Q2: x < 0, y > 0; Q3: x < 0, y < 0; Q4: x > 0, y < 0. Don't forget the cases when x = 0 or y = 0.
 */
public class Q26QuadrantCheck {

    public static String solve(double x, double y) {
        // TODO: Implement this method to solve the question
        return "";
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("x: "); double x = scanner.nextDouble();\n        System.out.print("y: "); double y = scanner.nextDouble();\n        System.out.println("Quadrant: " + solve(x, y));
        scanner.close();
    }
}
