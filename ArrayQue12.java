public class ArrayQue12 {
    public static void main(String[] args) {
        String palindrom = "madam";
        int i = 0;
        int j = palindrom.length() - 1;
        while (i < j) {
            if (palindrom.charAt(i) != palindrom.charAt(j)) {
                System.out.println("not palindrom");
                break;
            }
            i++;
            j--;
        }
        if (i == j) {
            System.out.println("palindrom");
        }
    }
}
