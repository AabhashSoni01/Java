public class ArrayQue11 {
    public static void main(String[] args) {
        // common letter in string
        String str1 = "hello";
        String str2 = "hiiii";
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) == str2.charAt(i)) {
                System.out.println(str1.charAt(i));
            }
        }
    }
}
