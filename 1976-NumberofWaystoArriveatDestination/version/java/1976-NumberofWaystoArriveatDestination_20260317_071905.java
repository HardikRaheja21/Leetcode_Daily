// Last updated: 3/17/2026, 7:19:05 AM
1class Pair {
2    long first;
3    int second;
4
5    public Pair(long _first, int _second) {
6        this.first = _first;
7        this.second = _second;
8    }
9}
10
11class Solution {
12    public int countPaths(int n, int[][] roads) {
13
14        ArrayList<ArrayList<Pair>> adj = new ArrayList<>();
15        for (int i = 0; i < n; i++) adj.add(new ArrayList<>());
16
17        for (int[] r : roads) {
18            adj.get(r[0]).add(new Pair(r[2], r[1]));
19            adj.get(r[1]).add(new Pair(r[2], r[0]));
20        }
21
22        PriorityQueue<Pair> pq =
23            new PriorityQueue<>((x, y) -> Long.compare(x.first, y.first));
24
25        long[] dist = new long[n];
26        int[] ways = new int[n];
27
28        Arrays.fill(dist, Long.MAX_VALUE);
29
30        dist[0] = 0;
31        ways[0] = 1;
32
33        pq.add(new Pair(0, 0));
34
35        int mod = (int)1e9 + 7;
36
37        while (!pq.isEmpty()) {
38            Pair curr = pq.poll();
39            long dis = curr.first;
40            int node = curr.second;
41
42            for (Pair it : adj.get(node)) {
43                long edW = it.first;
44                int adjNode = it.second;
45
46                if (dis + edW < dist[adjNode]) {
47                    dist[adjNode] = dis + edW;
48                    pq.add(new Pair(dist[adjNode], adjNode));
49                    ways[adjNode] = ways[node];
50                }
51                else if (dis + edW == dist[adjNode]) {
52                    ways[adjNode] = (ways[adjNode] + ways[node]) % mod;
53                }
54            }
55        }
56
57        return ways[n - 1];
58    }
59}