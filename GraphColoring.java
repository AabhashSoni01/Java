/* Graph Coloring (Backtracking) */

import java.util.Arrays;

class GraphColoring {
    public static void main(String[] args) {
        int V = 4;
        int[][] graph = {
                { 0, 1, 1, 1 },
                { 1, 0, 1, 0 },
                { 1, 1, 0, 1 },
                { 1, 0, 1, 0 }
        };
        int m = 3; // number of colors
        int[] color = new int[V];
        if (graphColoring(graph, m, color, 0)) {
            System.out.println("Solution Exists: Following are the assigned colors:");
            System.out.println(Arrays.toString(color));
        } else
            System.out.println("No solution with " + m + " colors.");
    }

    static boolean graphColoring(int[][] graph, int m, int[] color, int v) {
        int V = graph.length;
        if (v == V)
            return true;
        for (int c = 1; c <= m; c++) {
            if (isSafe(graph, v, color, c)) {
                color[v] = c;
                if (graphColoring(graph, m, color, v + 1))
                    return true;
                color[v] = 0;
            }
        }
        return false;
    }

    static boolean isSafe(int[][] graph, int v, int[] color, int c) {
        for (int i = 0; i < graph.length; i++)
            if (graph[v][i] == 1 && c == color[i])
                return false;
        return true;
    }
}