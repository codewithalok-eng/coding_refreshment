import java.util.Scanner;

/**
 * Phase 1: Conditional Thinking (If-Else, Boolean Logic)
 * Level 1: Simple Conditions (Getting started)
 * Question 8: Take a temperature value and print 'Cold', 'Warm', or 'Hot' using range conditions.
 * 
 * Mentor Tips (Java 26):
 * - Define your thresholds, e.g. < 15 is Cold, 15 to 30 is Warm, > 30 is Hot.
 */
public class Q8TemperatureRange {

    public static String solve(double temp) {
        // TODO: Implement this method to solve the question
        return "";
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter temperature: ");
                double val = scanner.nextDouble();
                System.out.println("Result: " + solve(val));
        scanner.close();
    }
}
