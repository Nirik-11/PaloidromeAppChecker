import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class UseCase6PalindromeCheckerApp {

    public static boolean isPalindrome(String input) {
        // 1. Clean the input: Remove non-alphanumeric and convert to lowercase
        String clean = input.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        // Edge case: empty string or single character is technically a palindrome
        if (clean.length() <= 1) return true;

        // 2. Initialize the Data Structures
        Queue<Character> queue = new LinkedList<>();
        Deque<Character> stack = new ArrayDeque<>();

        // 3. Populate both simultaneously
        for (char c : clean.toCharArray()) {
            queue.add(c);  // Adds to the tail
            stack.push(c); // Adds to the top
        }

        // 4. Compare characters head-to-head
        while (!queue.isEmpty()) {
            // queue.remove() gets the front; stack.pop() gets the back
            if (!queue.remove().equals(stack.pop())) {
                return false; // Mismatch found
            }
        }

        return true; // All characters matched
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("--- Palindrome Checker (Stack + Queue) ---");
        System.out.print("Enter a word or phrase: ");

        String input = scanner.nextLine();

        if (isPalindrome(input)) {
            System.out.println("Result: \"" + input + "\" is a palindrome!");
        } else {
            System.out.println("Result: \"" + input + "\" is NOT a palindrome.");
        }

        scanner.close();
    }
}