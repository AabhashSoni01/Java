public class ArrayQue21 {
    public static void main(String[] args) {

        // removing repeated element

        String str = "hhelloo";
        String newStr = "";
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (newStr.indexOf(c) == -1) {
                newStr += c;
            }
        }
        System.out.println(newStr);
    }
}
