import java.util.Scanner;

/**
 * Phase 1: Conditional Thinking (If-Else, Boolean Logic)
 * Level 4: Logical Operators & Compound Statements
 * Question 32: Take a number and print 'Fizz' if divisible by 3, 'Buzz' if divisible by 5, and 'FizzBuzz' if divisible by both.
 * 
 * Mentor Tips (Java 26):
 * - Check divisibility by both (15) first! Otherwise, divisibility by 3 or 5 will trigger first.
 */
public class Q32FizzBuzz {

    public static String solve(int num) {
        // TODO: Implement this method to solve the question
        return "";
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Number: "); int num = scanner.nextInt();
                System.out.println("Result: " + solve(num));
        scanner.close();
    }
}
