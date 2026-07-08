import java.util.Scanner;

/**
 * Phase 1: Conditional Thinking (If-Else, Boolean Logic)
 * Level 2: Nested If & Multiple Conditions
 * Question 19: Take a day number (1-7) and print the corresponding day name.
 * 
 * Mentor Tips (Java 26):
 * - Perfect for a switch statement/expression in Java 26, and match-case in Python 3.14.
 */
public class Q19DayName {

    public static String solve(int day) {
        // TODO: Implement this method to solve the question
        return "Invalid";
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Day number (1-7): "); int d = scanner.nextInt();
                System.out.println("Day: " + solve(d));
        scanner.close();
    }
}
