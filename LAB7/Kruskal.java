import java.util.*;

class Kruskal {
    static int[] parent, rank;

    static int find(int x) {
        if (parent[x] != x)
            parent[x] = find(parent[x]);
        return parent[x];
    }

    static void union(int a, int b) {
        a = find(a);
        b = find(b);

        if (a != b) {
            if (rank[a] < rank[b])
                parent[a] = b;
            else if (rank[a] > rank[b])
                parent[b] = a;
            else {
                parent[b] = a;
                rank[a]++;
            }
        }
    }

    public static void main(String[] args) {
        int[][] edges = {
            {0, 1, 10},
            {0, 2, 6},
            {0, 3, 5},
            {1, 3, 15},
            {2, 3, 4}
        };

        parent = new int[4];
        rank = new int[4];

        for (int i = 0; i < 4; i++)
            parent[i] = i;

        Arrays.sort(edges, Comparator.comparingInt(e -> e[2]));

        int cost = 0;

        System.out.println("Kruskal MST:");

        for (int[] e : edges) {
            if (find(e[0]) != find(e[1])) {
                union(e[0], e[1]);
                System.out.println(e[0] + " - " + e[1] + " : " + e[2]);
                cost += e[2];
            }
        }

        System.out.println("Total cost = " + cost);
    }
}