import java.util.Scanner;

/**
 * Phase 1: Conditional Thinking (If-Else, Boolean Logic)
 * Level 1: Simple Conditions (Getting started)
 * Question 1: Take a number and print whether it's positive, negative, or zero.
 * 
 * Mentor Tips (Java 26):
 * - Think about comparison operators (> , < , ==). You can write this using standard if-elif-else logic or match-case.
 */
public class Q1PositiveNegativeZero {

    public static String solve(double number) {

        if (number > 0) {
            return "positive";
        } else if (number < 0) {
            return "negative";
        } else {
            return "zero";
        }

    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");

        double val = scanner.nextDouble();

        System.out.println("Result: " + solve(val));

        scanner.close();

    }
}