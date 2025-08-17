import java.util.PriorityQueue;

/* Branch and Bound – 0/1 Knapsack (Best-first Search) */
class BBNode implements Comparable<BBNode> {
    int level;
    int profit;
    int weight;
    double bound;

    BBNode(int l, int p, int w) {
        level = l;
        profit = p;
        weight = w;
    }

    public int compareTo(BBNode o) {
        return Double.compare(o.bound, this.bound);
    } // max-heap by bound
}

class BranchBoundKnapsack {
    static int maxProfit = 0;

    static double bound(BBNode u, int n, int W, int[] val, int[] wt) {
        if (u.weight >= W)
            return 0;
        double profitBound = u.profit;
        int j = u.level + 1;
        int totweight = u.weight;
        while (j < n && totweight + wt[j] <= W) {
            totweight += wt[j];
            profitBound += val[j];
            j++;
        }
        if (j < n)
            profitBound += (W - totweight) * ((double) val[j] / wt[j]);
        return profitBound;
    }

    static int knapsack(int W, int[] wt, int[] val, int n) {
        PriorityQueue<BBNode> pq = new PriorityQueue<>();
        BBNode v = new BBNode(-1, 0, 0);
        v.bound = bound(v, n, W, val, wt);
        pq.add(v);
        while (!pq.isEmpty()) {
            v = pq.poll();
            if (v.bound <= maxProfit)
                continue;
            BBNode u = new BBNode(v.level + 1, v.profit + val[v.level + 1], v.weight + wt[v.level + 1]);
            if (u.weight <= W && u.profit > maxProfit)
                maxProfit = u.profit;
            u.bound = bound(u, n, W, val, wt);
            if (u.bound > maxProfit)
                pq.add(u);

            u = new BBNode(v.level + 1, v.profit, v.weight);
            u.bound = bound(u, n, W, val, wt);
            if (u.bound > maxProfit)
                pq.add(u);
        }
        return maxProfit;
    }

    public static void main(String[] args) {
        int[] val = { 60, 100, 120 };
        int[] wt = { 10, 20, 30 };
        int W = 50;
        // Items must be sorted by value/weight descending for better bounds
        int n = val.length;
        // (for simplicity we assume already sorted here)
        System.out.println("Max profit (BB): " + knapsack(W, wt, val, n));
    }
}