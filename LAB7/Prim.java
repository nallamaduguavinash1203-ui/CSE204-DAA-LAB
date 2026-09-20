import java.util.*;

class Prim {
    public static void main(String[] args) {
        int[][] graph = {
            {0, 10, 6, 5},
            {10, 0, 0, 15},
            {6, 0, 0, 4},
            {5, 15, 4, 0}
        };

        int n = graph.length;
        boolean[] visited = new boolean[n];
        int[] key = new int[n];
        int[] parent = new int[n];

        Arrays.fill(key, Integer.MAX_VALUE);
        key[0] = 0;
        parent[0] = -1;

        int cost = 0;

        System.out.println("Prim MST:");

        for (int count = 0; count < n; count++) {
            int u = -1;

            for (int i = 0; i < n; i++)
                if (!visited[i] && (u == -1 || key[i] < key[u]))
                    u = i;

            visited[u] = true;

            if (parent[u] != -1) {
                System.out.println(parent[u] + " - " + u + " : " + key[u]);
                cost += key[u];
            }

            for (int v = 0; v < n; v++) {
                if (graph[u][v] != 0 && !visited[v] &&
                    graph[u][v] < key[v]) {
                    key[v] = graph[u][v];
                    parent[v] = u;
                }
            }
        }

        System.out.println("Total cost = " + cost);
    }
}
