import java.util.Scanner;

/**
 * Phase 1: Conditional Thinking (If-Else, Boolean Logic)
 * Level 2: Nested If & Multiple Conditions
 * Question 12: If the sides form a valid triangle, determine whether it is equilateral, isosceles, or scalene.
 * 
 * Mentor Tips (Java 26):
 * - First check if it is a valid triangle (Q11). If so: 3 equal sides = equilateral, 2 equal sides = isosceles, 0 equal sides = scalene.
 */
public class Q12TriangleType {

    public static String solve(double s1, double s2, double s3) {
        // TODO: Implement this method to solve the question
        return "invalid";
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Side 1: "); double s1 = scanner.nextDouble();\n        System.out.print("Side 2: "); double s2 = scanner.nextDouble();\n        System.out.print("Side 3: "); double s3 = scanner.nextDouble();\n        System.out.println("Triangle type: " + solve(s1, s2, s3));
        scanner.close();
    }
}
