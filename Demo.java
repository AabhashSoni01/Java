// import java.util.HashMap;

public class Demo {
    // // string anagram
    // public static void main(String[] args) {
    //     String str1 = "hello";
    //     String str2 = "oelhl";
    //     HashMap<Character, Integer> charCountMap = new HashMap<>();

    //     for (char c : str1.toCharArray()) {
    //         charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
    //     }

    //     for (char c : str2.toCharArray()) {
    //         if (!charCountMap.containsKey(c) || charCountMap.get(c) == 0) {
    //             System.out.println("Not an anagram");
    //             return;
    //         }
    //         charCountMap.put(c, charCountMap.get(c) - 1);
    //     }

    //     for (int count : charCountMap.values()) {
    //         if (count != 0) {
    //             System.out.println("Not an anagram");
    //             return;
    //         }
    //     }
    //     System.out.println("Anagram");
    // }

    // Spiral traversal of a matrix

    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12},
            {13, 14, 15, 16}
        };

        int top = 0;
        int bottom = matrix.length - 1;
        int left = 0;
        int right = matrix[0].length - 1;

        while (top <= bottom && left <= right) {
            // Traverse from left to right
            for (int i = left; i <= right; i++) {
                System.out.print(matrix[top][i] + " ");
            }
            top++;

            // Traverse from top to bottom
            for (int i = top; i <= bottom; i++) {
                System.out.print(matrix[i][right] + " ");
            }
            right--;

            if (top <= bottom) {
                // Traverse from right to left
                for (int i = right; i >= left; i--) {
                    System.out.print(matrix[bottom][i] + " ");
                }
                bottom--;
            }

            if (left <= right) {
                // Traverse from bottom to top
                for (int i = bottom; i >= top; i--) {
                    System.out.print(matrix[i][left] + " ");
                }
                left++;
            }
        }
    }
}
