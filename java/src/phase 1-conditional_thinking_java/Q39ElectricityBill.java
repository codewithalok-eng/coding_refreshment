import java.util.Scanner;

/**
 * Phase 1: Conditional Thinking (If-Else, Boolean Logic)
 * Level 4: Logical Operators & Compound Statements
 * Question 39: Take electricity units consumed and calculate the bill as per slabs (using if-else).
 * 
 * Mentor Tips (Java 26):
 * - Define slabs (e.g., first 100 units at $1/unit, next 200 at $2/unit, above that $5/unit). Calculate progressively.
 */
public class Q39ElectricityBill {

    public static double solve(double units) {
        // TODO: Implement this method to solve the question
        0.0;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter units: "); double u = scanner.nextDouble();
                System.out.println("Bill: " + solve(u));
        scanner.close();
    }
}
