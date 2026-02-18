// Last updated: 2/18/2026, 12:55:06 PM
1class Solution {
2    
3    public int findCheapestPrice(int n, int[][] flights, int src, int dst, int k) {
4
5        // Graph: u -> (v, cost)
6        HashMap<Integer, HashMap<Integer, Integer>> mpp = new HashMap<>();
7        for (int i = 0; i < n; i++) {
8            mpp.put(i, new HashMap<>());
9        }
10
11        for (int[] f : flights) {
12            mpp.get(f[0]).put(f[1], f[2]);
13        }
14
15        // Distance array
16        int[] distance = new int[n];
17        Arrays.fill(distance, Integer.MAX_VALUE);
18        distance[src] = 0;
19
20        // Queue holds {node, cost}
21        Queue<pair> q = new LinkedList<>();
22        q.add(new pair(src, 0));
23
24        int stops = 0;
25
26        // BFS by levels (each level = one stop)
27        while (!q.isEmpty() && stops <= k) {
28
29            int size = q.size();
30
31            while (size-- > 0) {
32                pair cur = q.poll();
33                 int node = cur.v;
34                int costSoFar = cur.cost;
35
36                for (int neighbor : mpp.get(node).keySet()) {
37                    int edgeCost = mpp.get(node).get(neighbor);
38
39                    if (costSoFar + edgeCost <  distance[neighbor]) {
40                        distance[neighbor] = costSoFar + edgeCost;
41                        q.add(new pair(neighbor, distance[neighbor]));
42                    }
43                }
44            }
45            stops++;
46        }
47
48        return distance[dst] == Integer.MAX_VALUE ? -1 : distance[dst];
49    }
50    class pair{
51        int v;
52        int cost;
53         public pair(int v,int cost){
54            this.v = v;
55            this.cost = cost;
56         }
57
58    }
59}