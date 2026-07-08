import java.util.Scanner;

/**
 * Phase 1: Conditional Thinking (If-Else, Boolean Logic)
 * Level 5: Creative / Tricky Logical Scenarios
 * Question 45: Take three numbers and check if they are in arithmetic progression.
 * 
 * Mentor Tips (Java 26):
 * - Three numbers are in AP if b - a == c - b (when in order) or more generally if they can be ordered to have equal differences. Let's assume order is specified as a, b, c.
 */
public class Q45ArithmeticProgression {

    public static boolean solve(double a, double b, double c) {
        // TODO: Implement this method to solve the question
        false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("a: "); double a = scanner.nextDouble();\n        System.out.print("b: "); double b = scanner.nextDouble();\n        System.out.print("c: "); double c = scanner.nextDouble();\n        System.out.println("Arithmetic progression: " + solve(a, b, c));
        scanner.close();
    }
}
