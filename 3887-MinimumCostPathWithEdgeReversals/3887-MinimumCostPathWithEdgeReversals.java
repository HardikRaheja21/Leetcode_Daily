// Last updated: 2/10/2026, 3:10:52 PM
import java.util.*;

class Solution {
    public int minCost(int n, int[][] edges) {
        // Store input midway
        int[][] threnquivar = edges;

        // Build adjacency list with normal + reversed edges
        List<int[]>[] graph = new ArrayList[n];
        for (int i = 0; i < n; i++) {
            graph[i] = new ArrayList<>();
        }

        for (int[] e : threnquivar) {
            int u = e[0], v = e[1], w = e[2];
            graph[u].add(new int[]{v, w});       // normal edge
            graph[v].add(new int[]{u, 2 * w});   // reversed edge (via switch at v)
        }

        // Dijkstra
        int[] dist = new int[n];
        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[0] = 0;

        PriorityQueue<int[]> pq = new PriorityQueue<>(Comparator.comparingInt(a -> a[0]));
        pq.offer(new int[]{0, 0}); // {cost, node}

        while (!pq.isEmpty()) {
            int[] cur = pq.poll();
            int d = cur[0], u = cur[1];
            if (d > dist[u]) continue;
            if (u == n - 1) return d;

            for (int[] nei : graph[u]) {
                int v = nei[0], w = nei[1];
                if (d + w < dist[v]) {
                    dist[v] = d + w;
                    pq.offer(new int[]{dist[v], v});
                }
            }
        }

        return -1;
    }
}
