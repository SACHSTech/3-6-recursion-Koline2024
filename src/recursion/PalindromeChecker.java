package recursion;

public class PalindromeChecker {

    public static boolean isPalindrome(String s) {

        // recursive case
        if (s.length() == 1) {
            return true;

            // recursive case;
        } else if (s.charAt(0) == s.charAt(s.length() - 1)) {
            return isPalindrome(s.substring(1, s.length() - 1));
        }
        return false;
    }

    public static void main(String[] args) {
        String s = "biaic";
        System.out.println(isPalindrome(s));
    }

}
