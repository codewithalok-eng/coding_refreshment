import java.util.Scanner;

/**
 * Phase 1: Conditional Thinking (If-Else, Boolean Logic)
 * Level 2: Nested If & Multiple Conditions
 * Question 11: Take three sides and check if they form a valid triangle.
 * 
 * Mentor Tips (Java 26):
 * - Triangle inequality theorem states that sum of any two sides must be strictly greater than the third side.
 */
public class Q11ValidTriangle {

    public static boolean solve(double s1, double s2, double s3) {
        // TODO: Implement this method to solve the question
        return false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Side 1: "); double s1 = scanner.nextDouble();\n        System.out.print("Side 2: "); double s2 = scanner.nextDouble();\n        System.out.print("Side 3: "); double s3 = scanner.nextDouble();\n        System.out.println("Valid triangle: " + solve(s1, s2, s3));
        scanner.close();
    }
}
