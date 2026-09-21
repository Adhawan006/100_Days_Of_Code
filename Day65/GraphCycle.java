package hundred_days_of_code.Day65;

import java.util.*;

class Solution {

    public boolean isCycle(int V, int[][] edges) {

        // Create adjacency list
        List<List<Integer>> graph = new ArrayList<>();

        for (int i = 0; i < V; i++) {
            graph.add(new ArrayList<>());
        }

        // Add edges
        for (int[] edge : edges) {
            int u = edge[0];
            int v = edge[1];

            graph.get(u).add(v);
            graph.get(v).add(u);
        }

        boolean[] visited = new boolean[V];

        // Check every connected component
        for (int i = 0; i < V; i++) {
            if (!visited[i]) {
                if (dfs(graph, visited, i, -1)) {
                    return true;
                }
            }
        }

        return false;
    }

    private boolean dfs(List<List<Integer>> graph, boolean[] visited, int node, int parent) {

        visited[node] = true;

        for (int neighbor : graph.get(node)) {

            if (!visited[neighbor]) {

                if (dfs(graph, visited, neighbor, node)) {
                    return true;
                }

            } else if (neighbor != parent) {
                return true;
            }
        }

        return false;
    }
}
