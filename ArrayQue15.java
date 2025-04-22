public class ArrayQue15 {
    public static void main(String[] args) {
        // row wise matrix sum
        int[][] arr = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        for (int i = 0; i < arr.length; i++) {
            int rowSum = 0;
            for (int j = 0; j < arr[i].length; j++) {
                rowSum += arr[i][j];
            }
            System.out.println("sum of row " + i + " : " + rowSum);
        }
    }
}
