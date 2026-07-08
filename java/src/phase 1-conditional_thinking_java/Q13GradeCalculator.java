import java.util.Scanner;

/**
 * Phase 1: Conditional Thinking (If-Else, Boolean Logic)
 * Level 2: Nested If & Multiple Conditions
 * Question 13: Take marks (0-100) and print the corresponding grade (A/B/C/D/F).
 * 
 * Mentor Tips (Java 26):
 * - Use an if-elif-else chain mapping marks to standard thresholds (e.g. 90+ A, 80+ B, 70+ C, 60+ D, else F).
 */
public class Q13GradeCalculator {

    public static String solve(double marks) {
        // TODO: Implement this method to solve the question
        return "F";
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter marks: ");
                double val = scanner.nextDouble();
                System.out.println("Grade: " + solve(val));
        scanner.close();
    }
}
