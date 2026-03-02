import java.util.ArrayDeque;
import java.util.Deque;

public class UseCase8PalindromeCheckerApp {
    public static boolean isPalindrome(String str) {
        if (str == null) return false;

        // FIX 1: Added missing comma in replaceAll
        String cleanStr = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        Deque<Character> deque = new ArrayDeque<>();
        for (char c : cleanStr.toCharArray()) {
            deque.addLast(c);
        }

        while (deque.size() > 1) {
            // Characters are compared as primitives, so != works fine here
            if (deque.removeFirst() != deque.removeLast()) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        // FIX 2: Added missing commas between array elements
        String[] testStrings = {
                "racecar",
                "A man, a plan, a canal: Panama",
                "hello",
                "Madam, I'm Adam"
        };

        for (String s : testStrings) {
            System.out.println("\"" + s + "\" is palindrome: " + isPalindrome(s));
        }
    }
}
