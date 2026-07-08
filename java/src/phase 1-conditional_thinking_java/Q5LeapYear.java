import java.util.Scanner;

/**
 * Phase 1: Conditional Thinking (If-Else, Boolean Logic)
 * Level 1: Simple Conditions (Getting started)
 * Question 5: Check if a given year is a leap year.
 * 
 * Mentor Tips (Java 26):
 * - A year is a leap year if it is divisible by 4, except for end-of-century years, which must be divisible by 400.
 */
public class Q5LeapYear {

    public static boolean solve(int year) {
        // TODO: Implement this method to solve the question
        return false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a year: ");\n        int val = scanner.nextInt();\n        System.out.println("Leap year: " + solve(val));
        scanner.close();
    }
}
