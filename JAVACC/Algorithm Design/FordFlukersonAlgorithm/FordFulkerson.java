package FordFlukersonAlgorithm;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class FordFulkerson {
    static final int V = 7; 
    boolean bfs(int[][] rGraph, int s, int t, int[] parent) {
        boolean[] visited = new boolean[V];
        Arrays.fill(visited, false);

        Queue<Integer> queue = new LinkedList<>();
        queue.add(s);
        visited[s] = true;
        parent[s] = -1;

        while (!queue.isEmpty()) {
            int u = queue.poll();

            for (int v = 0; v < V; v++) {
                if (!visited[v] && rGraph[u][v] > 0) {
                    queue.add(v);
                    parent[v] = u;
                    visited[v] = true;
                }
            }
        }
        return visited[t];
    }

    int fordFulkerson(int[][] graph, int s, int t) {
        int[][] rGraph = new int[V][V];
        for (int i = 0; i < V; ++i)
            System.arraycopy(graph[i], 0, rGraph[i], 0, V);

        int[] parent = new int[V];
        int maxFlow = 0;

        while (bfs(rGraph, s, t, parent)) {
            int pathFlow = Integer.MAX_VALUE;
            for (int v = t; v != s; v = parent[v]) {
                int u = parent[v];
                pathFlow = Math.min(pathFlow, rGraph[u][v]);
            }

            for (int v = t; v != s; v = parent[v]) {
                int u = parent[v];
                rGraph[u][v] -= pathFlow;
                rGraph[v][u] += pathFlow;
            }

            maxFlow += pathFlow;
        }
        return maxFlow;
    }

    public static void main(String[] args) {
        int[][] graph = new int[][]{
                {0, 7, 10, 0, 0, 0, 0},
                {0, 0, 1, 5, 3, 0, 0},
                {0, 0, 0, 0, 2, 7, 0},
                {0, 0, 0, 0, 0, 2, 10},
                {0, 0, 0, 3, 0, 2, 0},
                {0, 0, 0, 0, 0, 0, 4},
                {0, 0, 0, 0, 0, 0, 0}
        };
        FordFulkerson m = new FordFulkerson();

        System.out.println("The maximum possible flow is " + m.fordFulkerson(graph, 0, 5));
    }
}
