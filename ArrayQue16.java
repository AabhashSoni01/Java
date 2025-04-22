public class ArrayQue16 {
    public static void main(String[] args) {
        // column wise sum
        int[][] arr = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        for (int j = 0; j < arr[0].length; j++) {
            int colSum = 0;
            for (int i = 0; i < arr.length; i++) {
                colSum += arr[i][j];
            }
            System.out.println("Column " + j + " sum: " + colSum);
        }
    }
}
