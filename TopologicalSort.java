
// Topological Sort (using DFS)
import java.util.*;

public class TopologicalSort {
    static int V = 6;
    @SuppressWarnings("unchecked")
    static ArrayList<Integer>[] graph = (ArrayList<Integer>[]) new ArrayList[V];

    public static void main(String[] args) {
        for (int i = 0; i < V; i++)
            graph[i] = new ArrayList<>();
        graph[5].add(2);
        graph[5].add(0);
        graph[4].add(0);
        graph[4].add(1);
        graph[2].add(3);
        graph[3].add(1);

        boolean[] visited = new boolean[V];
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < V; i++)
            if (!visited[i])
                topoUtil(i, visited, stack);

        System.out.print("Topological Sort: ");
        while (!stack.isEmpty())
            System.out.print(stack.pop() + " ");
    }

    static void topoUtil(int v, boolean[] visited, Stack<Integer> stack) {
        visited[v] = true;
        for (int u : graph[v])
            if (!visited[u])
                topoUtil(u, visited, stack);
        stack.push(v);
    }
}
