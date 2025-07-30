// Matrix Chain Multiplication
public class MatrixChain {
    public static void main(String[] args) {
        int[] dims = { 40, 20, 30, 10, 30 };
        int n = dims.length;
        int[][] dp = new int[n][n];
        for (int i = 1; i < n; i++)
            dp[i][i] = 0;

        for (int L = 2; L < n; L++) {
            for (int i = 1; i < n - L + 1; i++) {
                int j = i + L - 1;
                dp[i][j] = Integer.MAX_VALUE;
                for (int k = i; k < j; k++) {
                    int cost = dp[i][k] + dp[k + 1][j] + dims[i - 1] * dims[k] * dims[j];
                    if (cost < dp[i][j])
                        dp[i][j] = cost;
                }
            }
        }
        System.out.println("Minimum number of multiplications: " + dp[1][n - 1]);
    }
}