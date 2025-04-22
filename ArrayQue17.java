public class ArrayQue17 {
    public static void main(String[] args) {
        // max element in matrix
        int[][] arr = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        int max = arr[0][0];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i][j] > arr[0][0]) {
                    max = arr[i][j];
                }
            }
        }
        System.out.println("Max element in matrix : " + max);
    }
}
