public class LongestPalindrome {

    // Longest palindromic substring in a string
    // Uses expand around center technique

    public static String expand(String s, int left, int right) {
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        return s.substring(left + 1, right);
    }

    public static String longestPalindrome(String s) {
        String result = "";
        for (int i = 0; i < s.length(); i++) {
            String odd = expand(s, i, i);
            String even = expand(s, i, i + 1);
            if (odd.length() > result.length())
                result = odd;
            if (even.length() > result.length())
                result = even;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println("Longest Palindromic Substring: " + longestPalindrome("babad"));
    }
}
