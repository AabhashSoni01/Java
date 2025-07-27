// 0/1 Knapsack (DP)
public class ZeroOneKnapsack {
    public static void main(String[] args) {
        int[] val = { 60, 100, 120 };
        int[] wt = { 10, 20, 30 };
        int W = 50;
        int maxProfit = knapsack(val, wt, W);
        System.out.println("Maximum profit: " + maxProfit);
    }

    public static int knapsack(int[] val, int[] wt, int W) {
        int n = val.length;
        int[][] dp = new int[n + 1][W + 1];
        for (int i = 1; i <= n; i++) {
            for (int w = 1; w <= W; w++) {
                if (wt[i - 1] <= w)
                    dp[i][w] = Math.max(dp[i - 1][w], dp[i - 1][w - wt[i - 1]] + val[i - 1]);
                else
                    dp[i][w] = dp[i - 1][w];
            }
        }
        return dp[n][W];
    }
}
