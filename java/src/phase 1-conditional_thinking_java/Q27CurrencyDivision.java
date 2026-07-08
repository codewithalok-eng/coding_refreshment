import java.util.Scanner;

/**
 * Phase 1: Conditional Thinking (If-Else, Boolean Logic)
 * Level 3: Math and Number Logic
 * Question 27: Check if an amount can be evenly divided into 2000, 500, and 100 currency notes.
 * 
 * Mentor Tips (Java 26):
 * - An amount can be divided into 2000, 500, and 100 bills if it is a multiple of the smallest note denomination (100). i.e. amount % 100 == 0.
 */
public class Q27CurrencyDivision {

    public static boolean solve(int amount) {
        // TODO: Implement this method to solve the question
        false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Amount: "); int amt = scanner.nextInt();
                System.out.println("Evenly divisible: " + solve(amt));
        scanner.close();
    }
}
