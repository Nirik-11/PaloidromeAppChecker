import java.util.LinkedList;
import java.util.ListIterator;

public class UseCase8PalindromeCheckerApp {

    public static boolean isPalindrome(String str) {
        if (str == null) return false;

        // 1. Clean the string: remove non-alphanumeric and lowercase
        String cleanStr = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        // 2. Load characters into a LinkedList
        LinkedList<Character> list = new LinkedList<>();
        for (char c : cleanStr.toCharArray()) {
            list.add(c);
        }

        // 3. Compare from both ends using ListIterators
        // forward starts at the beginning; backward starts at the end
        ListIterator<Character> forward = list.listIterator();
        ListIterator<Character> backward = list.listIterator(list.size());

        while (forward.nextIndex() < backward.previousIndex()) {
            if (!forward.next().equals(backward.previous())) {
                return false; // Mismatch found
            }
        }
        return true; // All characters matched
    }

    public static void main(String[] args) {
        // Corrected array initialization with proper commas
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
