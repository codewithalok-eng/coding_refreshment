import java.util.Scanner;

/**
 * Phase 1: Conditional Thinking (If-Else, Boolean Logic)
 * Level 5: Creative / Tricky Logical Scenarios
 * Question 49: Take two dates (day and month) and determine which one comes first in the calendar.
 * 
 * Mentor Tips (Java 26):
 * - Compare months first. If months are different, the smaller month comes first. If months are the same, compare the days.
 */
public class Q49DateComparison {

    public static String solve(int d1, int m1, int d2, int m2) {
        // TODO: Implement this method to solve the question
        return "";
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Day 1: "); int d1 = scanner.nextInt();
                System.out.print("Month 1: "); int m1 = scanner.nextInt();
                System.out.print("Day 2: "); int d2 = scanner.nextInt();
                System.out.print("Month 2: "); int m2 = scanner.nextInt();
                System.out.println("Earlier date: " + solve(d1, m1, d2, m2));
        scanner.close();
    }
}
