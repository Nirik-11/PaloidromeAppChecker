public class UseCase9PalindromeCheckerApp {

    public static boolean isPalindrome(String s) {

        if (s == null) {
            return false; // Or true, depending on requirements for null strings
        }
        return isPalindromeRecursive(s, 0, s.length() - 1);
    }


    private static boolean isPalindromeRecursive(String s, int left, int right) {

        if (left >= right) {
            return true;
        }


        if (s.charAt(left) != s.charAt(right)) {
            return false; // Mismatch found, not a palindrome.
        }


        return isPalindromeRecursive(s, left + 1, right - 1);
    }

    public static void main(String[] args) {
        String s1 = "madam";
        String s2 = "racecar";
        String s3 = "hello";
        String s4 = "abccba";

        System.out.println(s1 + " is a palindrome: " + isPalindrome(s1));
        System.out.println(s2 + " is a palindrome: " + isPalindrome(s2));
        System.out.println(s3 + " is a palindrome: " + isPalindrome(s3));
        System.out.println(s4 + " is a palindrome: " + isPalindrome(s4));
    }
}
