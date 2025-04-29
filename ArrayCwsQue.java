public class ArrayCwsQue {

    // que 1
    static void que1(int n) {
        // print natural numbers upto n
        System.out.print("que1 - natural numbers upto " + n + " are : ");
        for (int i = 1; i <= n; i++) {
            System.out.print(i + " ");
        }
        System.out.println("\n");
    }

    // que2
    static void que2(int n1, int n2) {
        // even numbers between two given range
        System.out.print("que2 - even numbers between " + n1 + " and " + n2 + " are : ");
        for (int i = n1; i <= n2; i++) {
            if (i % 2 == 0)
                System.out.print(i + " ");
        }
        System.out.println("\n");
    }

    // que3
    static void que3(int n) {
        // print n natural numbers in reverse order
        System.out.print("que3 - natural numbers in reverse order upto " + n + " are : ");
        for (int i = n; i >= 1; i--) {
            System.out.print(i + " ");
        }
        System.out.println("\n");
    }

    // que4
    static void que4(int n) {
        // sum of n natural numbers
        int sum = 0;
        System.out.print("que4 - sum of natural numbers upto " + n + " is : ");
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        System.out.println(sum + "\n");
    }

    // que5
    static void que5(int n) {
        // product of n natural numbers
        int product = 1;
        System.out.print("que5 - product of natural numbers upto " + n + " is : ");
        for (int i = 1; i <= n; i++) {
            product *= i;
        }
        System.out.println(product + "\n");
    }

    // que6
    static void que6(int n) {
        // extract and display all digits from a given number
        System.out.print("que6 - digits of " + n + " are : ");

        // in orignal order
        String nStr = Integer.toString(n); // Convert the number to string to access digits in order
        for (int i = 0; i < nStr.length(); i++) {
            System.out.print(nStr.charAt(i) + " ");
        }

        // in reverse order
        // while (n > 0) {
        // System.out.print(n % 10 + " ");
        // n /= 10;
        // }
        System.out.println("\n");
    }

    // que7
    static void que7(int n) {
        // sum of all digits in a given number
        int sum = 0;
        System.out.print("que7 - sum of digits of " + n + " is : ");
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        System.out.println(sum + "\n");
    }

    // que8
    static void que8(int n) {
        // count of all digits in a given number
        int count = 0;
        System.out.print("que8 - count of digits in " + n + " is : ");
        while (n > 0) {
            count++;
            n /= 10;
        }
        System.out.println(count + "\n");
    }

    // que9
    static void que9(int n) {
        // to reverse a given number
        int rev = 0;
        while (n > 0) {
            rev = rev * 10 + n % 10;
            n /= 10;
        }
        System.out.println("que9 - reverse of number " + n + " is : " + rev + "\n");
    }

    // que10
    static void que10(int n) {
        // to check a number is palindrome or not
        int rev = 0;
        int orignal = n;
        while (n > 0) {
            rev = rev * 10 + n % 10;
            n /= 10;
        }
        if (orignal == rev) {
            System.out.println("que10 - " + orignal + " is palindrome\n");
        } else {
            System.out.println("que10 - " + orignal + " is not palindrome\n");
        }
    }

    // que11
    static void que11(int n) {
        // to find all factors of a given number
        System.out.print("que11 - factors of " + n + " are : ");
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println("\n");
    }

    public static void main(String[] args) {
        que1(9);
        que2(4, 10);
        que3(7);
        que4(7);
        que5(5);
        que6(123);
        que7(541);
        que8(12345678);
        que9(567);
        que10(12321);
        que11(34);
    }
}
