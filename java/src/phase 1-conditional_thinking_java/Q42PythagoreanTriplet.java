import java.util.Scanner;

/**
 * Phase 1: Conditional Thinking (If-Else, Boolean Logic)
 * Level 5: Creative / Tricky Logical Scenarios
 * Question 42: Take three numbers and check if they can form a Pythagorean triplet.
 * 
 * Mentor Tips (Java 26):
 * - A Pythagorean triplet satisfies a^2 + b^2 = c^2, but the inputs may not be in order! Check all three combinations: a^2+b^2=c^2, a^2+c^2=b^2, b^2+c^2=a^2.
 */
public class Q42PythagoreanTriplet {

    public static boolean solve(double a, double b, double c) {
        // TODO: Implement this method to solve the question
        false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("a: "); double a = scanner.nextDouble();
                System.out.print("b: "); double b = scanner.nextDouble();
                System.out.print("c: "); double c = scanner.nextDouble();
                System.out.println("Pythagorean triplet: " + solve(a, b, c));
        scanner.close();
    }
}
