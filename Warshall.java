/* Warshall's Algorithm (Transitive Closure) */

import java.util.Arrays;

class Warshall {
    public static void main(String[] args) {
        int[][] graph = {
                { 1, 1, 0, 0 },
                { 0, 1, 1, 0 },
                { 0, 0, 1, 1 },
                { 0, 0, 0, 1 }
        };
        transitiveClosure(graph);
    }

    static void transitiveClosure(int[][] graph) {
        int V = graph.length;
        int[][] reach = new int[V][V];
        for (int i = 0; i < V; i++)
            System.arraycopy(graph[i], 0, reach[i], 0, V);

        for (int k = 0; k < V; k++)
            for (int i = 0; i < V; i++)
                for (int j = 0; j < V; j++)
                    reach[i][j] = (reach[i][j] != 0) ? reach[i][j] : (reach[i][k] != 0 && reach[k][j] != 0 ? 1 : 0);

        System.out.println("Transitive closure matrix:");
        for (int i = 0; i < V; i++)
            System.out.println(Arrays.toString(reach[i]));
    }
}