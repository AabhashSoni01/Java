import java.util.Scanner;

public class CharacterToASCII {
    public static void main(String[] args) {
        System.out.println("Enter a character : ");
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);
        sc.close();
        System.out.println((int)ch);
    }
}
