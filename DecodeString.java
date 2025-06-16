import java.util.*;

public class DecodeString {
    public static String decodeString(String s) {
        Stack<String> stack = new Stack<>();
        String current = "";
        int k = 0;

        for (char ch : s.toCharArray()) {
            if (Character.isDigit(ch)) {
                k = k * 10 + ch - '0';
            } else if (ch == '[') {
                stack.push(current);
                stack.push(String.valueOf(k));
                current = "";
                k = 0;
            } else if (ch == ']') {
                int times = Integer.parseInt(stack.pop());
                StringBuilder temp = new StringBuilder(stack.pop());
                current = temp.append(current.repeat(times)).toString();
            } else {
                current += ch;
            }
        }
        return current;
    }

    public static void main(String[] args) {
        System.out.println("Decoded: " + decodeString("3[a2[c]]")); // accaccacc
    }
}
