/* TSP (Held-Karp DP) - small N only */

import java.util.Arrays;

class TSP {
    public static void main(String[] args) {
        int[][] dist = {
                { 0, 10, 15, 20 },
                { 10, 0, 35, 25 },
                { 15, 35, 0, 30 },
                { 20, 25, 30, 0 }
        };
        System.out.println("TSP minimum cost: " + tsp(dist));
    }

    static int tsp(int[][] dist) {
        int n = dist.length;
        int FULL = (1 << n);
        int[][] dp = new int[FULL][n];
        for (int[] row : dp)
            Arrays.fill(row, Integer.MAX_VALUE / 2);
        dp[1][0] = 0; // start at 0

        for (int mask = 1; mask < FULL; mask++) {
            for (int u = 0; u < n; u++) {
                if ((mask & (1 << u)) == 0)
                    continue;
                for (int v = 0; v < n; v++) {
                    if ((mask & (1 << v)) != 0)
                        continue;
                    dp[mask | (1 << v)][v] = Math.min(dp[mask | (1 << v)][v], dp[mask][u] + dist[u][v]);
                }
            }
        }

        int res = Integer.MAX_VALUE;
        for (int u = 1; u < n; u++)
            res = Math.min(res, dp[FULL - 1][u] + dist[u][0]);
        return res;
    }
}