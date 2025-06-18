import java.util.Arrays;

// Boolean Matrix Problem (Set row/col to 1 if any cell is 1)

public class BooleanMatrix {
    public static void modifyMatrix(int[][] mat) {
        int r = mat.length, c = mat[0].length;
        boolean[] row = new boolean[r];
        boolean[] col = new boolean[c];

        for (int i = 0; i < r; i++)
            for (int j = 0; j < c; j++)
                if (mat[i][j] == 1) {
                    row[i] = true;
                    col[j] = true;
                }

        for (int i = 0; i < r; i++)
            for (int j = 0; j < c; j++)
                if (row[i] || col[j])
                    mat[i][j] = 1;
    }

    public static void main(String[] args) {
        int[][] mat = {
                { 1, 0, 0 },
                { 0, 0, 0 },
                { 0, 0, 1 }
        };
        modifyMatrix(mat);
        for (int[] row : mat)
            System.out.println(Arrays.toString(row));
    }
}
