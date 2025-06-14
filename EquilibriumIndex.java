public class EquilibriumIndex {

    // Equilibrium index (sum of left = sum of right)

    public static int findEquilibrium(int[] arr) {
        int totalSum = 0, leftSum = 0;
        for (int num : arr)
            totalSum += num;

        for (int i = 0; i < arr.length; i++) {
            totalSum -= arr[i]; // right sum
            if (leftSum == totalSum)
                return i;
            leftSum += arr[i];
        }
        return -1; // no equilibrium index
    }

    public static void main(String[] args) {
        int[] arr = { 1, 3, 5, 2, 2 };
        System.out.println("Equilibrium Index: " + findEquilibrium(arr));
    }
}
