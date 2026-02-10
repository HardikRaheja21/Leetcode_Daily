// Last updated: 2/10/2026, 3:10:56 PM
import java.util.*;

class Solution {

    class DSU {
        int[] parent;

        public DSU(int n) {
            parent = new int[n];
            for (int i = 0; i < n; ++i)
                parent[i] = i;
        }

        int find(int x) {
            if (parent[x] != x)
                parent[x] = find(parent[x]);
            return parent[x];
        }

        boolean unite(int x, int y) {
            int px = find(x), py = find(y);
            if (px == py)
                return false;
            parent[px] = py;
            return true;
        }
    }

    public int minCost(int n, int[][] edges, int k) {
        // Step 1: Sort edges by weight
        Arrays.sort(edges, (a, b) -> Integer.compare(a[2], b[2]));

        DSU dsu = new DSU(n);
        List<Integer> mstEdges = new ArrayList<>();

        // Step 2: Build MST using Kruskal’s algorithm
        for (int[] edge : edges) {
            int u = edge[0], v = edge[1], w = edge[2];
            if (dsu.unite(u, v)) {
                mstEdges.add(w);
            }
        }

        // Step 3: Remove k - 1 largest edges
        Collections.sort(mstEdges); // ascending order

        while (k > 1 && !mstEdges.isEmpty()) {
            mstEdges.remove(mstEdges.size() - 1);
            k--;
        }

        // Step 4: Return the largest remaining edge or 0
        return mstEdges.isEmpty() ? 0 : mstEdges.get(mstEdges.size() - 1);
    }
}
