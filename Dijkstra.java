
// Dijkstra's Algorithm
import java.util.*;

class Dijkstra {
    public static void main(String[] args) {
        int V = 5;
        int[][] graph = {
                { 0, 9, 6, 5, 3 },
                { 9, 0, INF, INF, INF },
                { 6, INF, 0, 2, INF },
                { 5, INF, 2, 0, 2 },
                { 3, INF, INF, 2, 0 }
        };
        dijkstra(graph, 0);
    }

    static final int INF = Integer.MAX_VALUE;

    public static void dijkstra(int[][] graph, int src) {
        int V = graph.length;
        int[] dist = new int[V];
        boolean[] visited = new boolean[V];
        Arrays.fill(dist, INF);
        dist[src] = 0;

        for (int count = 0; count < V - 1; count++) {
            int u = minDistance(dist, visited);
            visited[u] = true;
            for (int v = 0; v < V; v++) {
                if (!visited[v] && graph[u][v] != 0 && dist[u] != INF
                        && dist[u] + graph[u][v] < dist[v]) {
                    dist[v] = dist[u] + graph[u][v];
                }
            }
        }
        System.out.println("Vertex\tDistance from Source");
        for (int i = 0; i < V; i++)
            System.out.println(i + "\t" + dist[i]);
    }

    static int minDistance(int[] dist, boolean[] visited) {
        int min = INF, min_index = -1;
        for (int v = 0; v < dist.length; v++) {
            if (!visited[v] && dist[v] <= min) {
                min = dist[v];
                min_index = v;
            }
        }
        return min_index;
    }
}
