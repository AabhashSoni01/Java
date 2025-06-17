import java.util.Arrays;

// Find Median in Row-wise Sorted Matrix

public class MedianMatrix {
    public static int findMedian(int[][] matrix) {
        int r = matrix.length, c = matrix[0].length;
        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;

        for (int[] row : matrix) {
            min = Math.min(min, row[0]);
            max = Math.max(max, row[c - 1]);
        }

        int desired = (r * c + 1) / 2;
        while (min < max) {
            int mid = (min + max) / 2;
            int place = 0;
            for (int[] row : matrix)
                place += Arrays.binarySearch(row, mid) < 0 ? -Arrays.binarySearch(row, mid) - 1
                        : Arrays.binarySearch(row, mid) + 1;

            if (place < desired)
                min = mid + 1;
            else
                max = mid;
        }

        return min;
    }

    public static void main(String[] args) {
        int[][] mat = { { 1, 3, 5 }, { 2, 6, 9 }, { 3, 6, 9 } };
        System.out.println("Median: " + findMedian(mat));
    }
}
