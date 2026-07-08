import java.util.Scanner;

/**
 * Phase 1: Conditional Thinking (If-Else, Boolean Logic)
 * Level 5: Creative / Tricky Logical Scenarios
 * Question 50: Take a year and print the corresponding century (e.g., '19th century', '20th century').
 * 
 * Mentor Tips (Java 26):
 * - Century can be calculated as: (year - 1) // 100 + 1. Append the correct suffix ('st', 'nd', 'rd', 'th').
 */
public class Q50YearToCentury {

    public static String solve(int year) {
        // TODO: Implement this method to solve the question
        return "";
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter year: "); int year = scanner.nextInt();\n        System.out.println("Century: " + solve(year));
        scanner.close();
    }
}
