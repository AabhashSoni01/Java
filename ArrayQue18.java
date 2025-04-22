public class ArrayQue18 {
    public static void main(String[] args) {
        // minium element in matrix
        int[][] arr = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        int min = arr[0][0];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i][j] < arr[0][0]) {
                    min = arr[i][j];
                }
            }
        }
        System.out.println("Minimum element in matrix : " + min);
    }
}
