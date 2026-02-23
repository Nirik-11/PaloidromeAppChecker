import java.util.Scanner;

public class UseCase3PalindromeCheckerApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string to check if it's a palindrome: ");
        String input = scanner.nextLine();


        if (input == null || input.trim().isEmpty()) {
            System.out.println("Invalid input. Please enter a non-empty string.");
            scanner.close();
            return;
        }


        String cleaned = input.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();


        String reversed = new StringBuilder(cleaned).reverse().toString();


        if (cleaned.equals(reversed)) {
            System.out.println("The string is a palindrome.");
        } else {
            System.out.println("The string is NOT a palindrome.");
        }

        scanner.close();
    }
}
