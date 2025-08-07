// Kruskal’s Algorithm

import java.util.Arrays;

class Edge implements Comparable<Edge> {
    int src, dest, weight;

    Edge(int s, int d, int w) {
        src = s;
        dest = d;
        weight = w;
    }

    public int compareTo(Edge e) {
        return this.weight - e.weight;
    }
}

class Subset {
    int parent, rank;
}

public class Kruskal {
    int V, E;
    Edge[] edge;

    Kruskal(int v, int e) {
        V = v;
        E = e;
        edge = new Edge[E];
    }

    public static void main(String[] args) {
        int V = 4, E = 5;
        Kruskal graph = new Kruskal(V, E);
        graph.edge[0] = new Edge(0, 1, 10);
        graph.edge[1] = new Edge(0, 2, 6);
        graph.edge[2] = new Edge(0, 3, 5);
        graph.edge[3] = new Edge(1, 3, 15);
        graph.edge[4] = new Edge(2, 3, 4);
        graph.kruskalMST();
    }

    int find(Subset[] subsets, int i) {
        if (subsets[i].parent != i)
            subsets[i].parent = find(subsets, subsets[i].parent);
        return subsets[i].parent;
    }

    void union(Subset[] subsets, int x, int y) {
        int xroot = find(subsets, x);
        int yroot = find(subsets, y);
        if (subsets[xroot].rank < subsets[yroot].rank)
            subsets[xroot].parent = yroot;
        else if (subsets[xroot].rank > subsets[yroot].rank)
            subsets[yroot].parent = xroot;
        else {
            subsets[yroot].parent = xroot;
            subsets[xroot].rank++;
        }
    }

    void kruskalMST() {
        Edge[] result = new Edge[V];
        int e = 0;
        Arrays.sort(edge);
        Subset[] subsets = new Subset[V];
        for (int v = 0; v < V; v++) {
            subsets[v] = new Subset();
            subsets[v].parent = v;
            subsets[v].rank = 0;
        }
        int i = 0;
        while (e < V - 1) {
            Edge next = edge[i++];
            int x = find(subsets, next.src);
            int y = find(subsets, next.dest);
            if (x != y) {
                result[e++] = next;
                union(subsets, x, y);
            }
        }
        System.out.println("Edges in MST:");
        for (i = 0; i < e; i++) {
            System.out.println(result[i].src + " -- " + result[i].dest + " == " + result[i].weight);
        }
    }
}