// Last updated: 7/25/2026, 2:38:25 PM
1class Solution {
2    public boolean validPath(int n, int[][] edges, int source, int destination) {
3        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
4        for(int i = 0; i < n; i++) adj.add(new ArrayList<>());
5        for(int i = 0; i < edges.length; i++){
6            int u = edges[i][0];
7            int v = edges[i][1];
8            adj.get(u).add(v);
9            adj.get(v).add(u);
10        }
11        //if(bfs(adj, source, destination, n)) return true;  //BFS
12        boolean[] vis = new boolean[n];
13        if(dfs(adj, source, destination, vis)) return true;
14        return false;        
15    }
16
17
18    //DFS
19    public boolean dfs(ArrayList<ArrayList<Integer>> adj, int source, int destination, boolean[] vis){
20        if(source == destination) return true;
21
22        vis[source] = true;
23
24        for(int it : adj.get(source)){
25            if(!vis[it]){
26                if(dfs(adj, it, destination, vis))
27                    return true;
28            }
29        }
30
31        return false;
32    }
33
34
35
36
37
38
39    //BFS
40    // public boolean bfs(ArrayList<ArrayList<Integer>> adj, int source, int destination, int n){
41    //     boolean[] vis = new boolean[n];
42    //     Queue<Integer> q = new LinkedList<>();
43    //     q.offer(source);
44    //     vis[source] = true;
45    //     while(!q.isEmpty()){
46    //         int node = q.poll();
47    //         if(node == destination) return true;
48    //         for(int it : adj.get(node)){
49    //             if(!vis[it]){
50    //                 vis[it] = true;
51    //                 q.offer(it);
52    //             }
53    //         }
54    //     }
55    //     return false;
56    // }
57}