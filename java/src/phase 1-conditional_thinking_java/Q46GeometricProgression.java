import java.util.Scanner;

/**
 * Phase 1: Conditional Thinking (If-Else, Boolean Logic)
 * Level 5: Creative / Tricky Logical Scenarios
 * Question 46: Take three numbers and check if they are in geometric progression.
 * 
 * Mentor Tips (Java 26):
 * - Three numbers a, b, c are in GP if b / a == c / b, which can be cross-multiplied as b * b == a * c (which avoids float division problems and division by zero!).
 */
public class Q46GeometricProgression {

    public static boolean solve(double a, double b, double c) {
        // TODO: Implement this method to solve the question
        false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("a: "); double a = scanner.nextDouble();\n        System.out.print("b: "); double b = scanner.nextDouble();\n        System.out.print("c: "); double c = scanner.nextDouble();\n        System.out.println("Geometric progression: " + solve(a, b, c));
        scanner.close();
    }
}
