// Bellman-Ford Algorithm

import java.util.Arrays;

public class BellmanFord {
    public static void main(String[] args) {
        int V = 5;
        int[][] edges = {
                { 0, 1, -1 }, { 0, 2, 4 },
                { 1, 2, 3 }, { 1, 3, 2 }, { 1, 4, 2 },
                { 3, 2, 5 }, { 3, 1, 1 },
                { 4, 3, -3 }
        };
        bellmanFord(V, edges, 0);
    }

    static void bellmanFord(int V, int[][] edges, int src) {
        int[] dist = new int[V];
        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[src] = 0;

        for (int i = 1; i < V; i++) {
            for (int[] e : edges) {
                int u = e[0], v = e[1], w = e[2];
                if (dist[u] != Integer.MAX_VALUE && dist[u] + w < dist[v]) {
                    dist[v] = dist[u] + w;
                }
            }
        }

        for (int[] e : edges) {
            int u = e[0], v = e[1], w = e[2];
            if (dist[u] != Integer.MAX_VALUE && dist[u] + w < dist[v]) {
                System.out.println("Graph contains negative weight cycle");
                return;
            }
        }

        System.out.println("Vertex Distance from Source");
        for (int i = 0; i < V; ++i)
            System.out.println(i + "\t" + dist[i]);
    }
}