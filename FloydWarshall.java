
// Floyd-Warshall Algorithm
import java.util.*;

public class FloydWarshall {
    final static int INF = 99999;

    public static void main(String[] args) {
        int[][] graph = {
                { 0, 5, INF, 10 },
                { INF, 0, 3, INF },
                { INF, INF, 0, 1 },
                { INF, INF, INF, 0 }
        };
        floydWarshall(graph);
    }

    public static void floydWarshall(int[][] graph) {
        int V = graph.length;
        int[][] dist = new int[V][V];
        for (int i = 0; i < V; i++)
            for (int j = 0; j < V; j++)
                dist[i][j] = graph[i][j];

        for (int k = 0; k < V; k++)
            for (int i = 0; i < V; i++)
                for (int j = 0; j < V; j++)
                    if (dist[i][k] + dist[k][j] < dist[i][j])
                        dist[i][j] = dist[i][k] + dist[k][j];

        System.out.println("Shortest distances between every pair of vertices:");
        for (int[] row : dist)
            System.out.println(Arrays.toString(row));
    }
}
