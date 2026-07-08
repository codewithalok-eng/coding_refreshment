import java.util.Scanner;

/**
 * Phase 1: Conditional Thinking (If-Else, Boolean Logic)
 * Level 4: Logical Operators & Compound Statements
 * Question 35: Take income and age, and check if eligible for tax (age > 18 and income > 5 L).
 * 
 * Mentor Tips (Java 26):
 * - Combine conditions using logical AND.
 */
public class Q35TaxEligibility {

    public static boolean solve(int age, double income) {
        // TODO: Implement this method to solve the question
        false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Age: "); int age = scanner.nextInt();
                System.out.print("Income (Lakhs): "); double inc = scanner.nextDouble();
                System.out.println("Eligible for tax: " + solve(age, inc));
        scanner.close();
    }
}
