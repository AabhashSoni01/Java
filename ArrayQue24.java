public class ArrayQue24 {
    // static void sum() {
    // int a=53;
    // int b=47;
    // int c=a+b;System.out.println("sum : " + c);
    // }

    static void sum(int a,int b) {
        int sum = 0;
        while (a > 0) {
            int digit = a % 10;
            sum = sum + digit;
            a = a / 10;
        }
        System.out.println("sum 1 : " + sum);

        while (b > 0) {
            int digit = b % 10;
            sum = sum + digit;
            b = b / 10;
        }
        System.out.println("sum 2 : " + sum);
    }

    public static void main(String[] args) {
        sum(123,357);
    }
}
