public class RunLengthEncoding {
    public static String encode(String s) {
        StringBuilder sb = new StringBuilder();
        int count = 1;
        for (int i = 1; i <= s.length(); i++) {
            if (i == s.length() || s.charAt(i) != s.charAt(i - 1)) {
                sb.append(s.charAt(i - 1)).append(count);
                count = 1;
            } else {
                count++;
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println("Encoded: " + encode("aaabbccc")); // a3b2c3
    }
}
