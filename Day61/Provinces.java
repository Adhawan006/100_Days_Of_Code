package hundred_days_of_code.Day61;

class Solution {

    public int findCircleNum(int[][] isConnected) {

        int n = isConnected.length;

        boolean[] visited = new boolean[n];

        int provinces = 0;

        for (int i = 0; i < n; i++) {

            if (!visited[i]) {
                dfs(isConnected, visited, i);
                provinces++;
            }
        }

        return provinces;
    }

    private void dfs(int[][] graph, boolean[] visited, int city) {

        visited[city] = true;

        for (int neighbour = 0; neighbour < graph.length; neighbour++) {

            if (graph[city][neighbour] == 1 && !visited[neighbour]) {
                dfs(graph, visited, neighbour);
            }
        }
    }
}
