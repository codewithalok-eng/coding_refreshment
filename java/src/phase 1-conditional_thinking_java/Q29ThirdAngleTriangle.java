import java.util.Scanner;

/**
 * Phase 1: Conditional Thinking (If-Else, Boolean Logic)
 * Level 3: Math and Number Logic
 * Question 29: Take two angles of a triangle and compute the third angle.
 * 
 * Mentor Tips (Java 26):
 * - The sum of all angles in a triangle is 180. The third angle is 180 - (a1 + a2). Check if input angles are valid (> 0 and sum < 180).
 */
public class Q29ThirdAngleTriangle {

    public static double solve(double a1, double a2) {
        // TODO: Implement this method to solve the question
        0.0;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Angle 1: "); double a1 = scanner.nextDouble();\n        System.out.print("Angle 2: "); double a2 = scanner.nextDouble();\n        System.out.println("Third angle: " + solve(a1, a2));
        scanner.close();
    }
}
