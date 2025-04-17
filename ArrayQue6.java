public class ArrayQue6 {
    public static void main(String[] args) {
        // compare two arrays
        int[] arr1 = { 1, 3, 5, 7, 8, 9 };
        int[] arr2 = { 1, 0, 90, 4, 8, 9 };

        boolean isEqual = java.util.Arrays.equals(arr1, arr2);

        if (isEqual) {
            System.out.println("Arrays are equal");
        } else {
            System.out.println("Arrays are not equal");
        }
    }
}
