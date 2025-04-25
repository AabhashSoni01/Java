public class ArrayQue27 {

    // missing number in an array

    static int missingNum() {
        int[] arr = { 7, 5, 3, 4, 1, 2 };
        int n = arr.length + 1;
        int total = n * (n + 1) / 2;
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return total - sum;
    }

    public static void main(String[] args) {
        System.out.println("The missing number is: " + missingNum());
    }
}
