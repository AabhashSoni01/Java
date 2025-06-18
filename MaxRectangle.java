import java.util.Stack;

// Maximum Size Rectangle of All 1s (Binary Matrix)

public class MaxRectangle {
    public static int maxHistogramArea(int[] row) {
        Stack<Integer> stack = new Stack<>();
        int maxArea = 0, i = 0;
        while (i < row.length) {
            if (stack.isEmpty() || row[i] >= row[stack.peek()]) {
                stack.push(i++);
            } else {
                int height = row[stack.pop()];
                int width = stack.isEmpty() ? i : i - stack.peek() - 1;
                maxArea = Math.max(maxArea, height * width);
            }
        }
        while (!stack.isEmpty()) {
            int height = row[stack.pop()];
            int width = stack.isEmpty() ? i : i - stack.peek() - 1;
            maxArea = Math.max(maxArea, height * width);
        }
        return maxArea;
    }

    public static int maxRectangle(int[][] matrix) {
        int[] histogram = matrix[0].clone();
        int maxArea = maxHistogramArea(histogram);
        for (int i = 1; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++)
                histogram[j] = matrix[i][j] == 0 ? 0 : histogram[j] + 1;
            maxArea = Math.max(maxArea, maxHistogramArea(histogram));
        }
        return maxArea;
    }

    public static void main(String[] args) {
        int[][] mat = {
                { 0, 1, 1, 0 },
                { 1, 1, 1, 1 },
                { 1, 1, 1, 1 },
                { 1, 1, 0, 0 }
        };
        System.out.println("Max Rectangle Area: " + maxRectangle(mat));
    }
}
