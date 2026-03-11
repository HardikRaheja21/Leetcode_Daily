// Last updated: 3/11/2026, 10:41:12 AM
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
11        if(bfs(adj, source, destination, n)) return true;
12        return false;        
13    }
14    public boolean bfs(ArrayList<ArrayList<Integer>> adj, int source, int destination, int n){
15        boolean[] vis = new boolean[n];
16        Queue<Integer> q = new LinkedList<>();
17        q.offer(source);
18        vis[source] = true;
19        while(!q.isEmpty()){
20            int node = q.poll();
21            if(node == destination) return true;
22            for(int it : adj.get(node)){
23                if(!vis[it]){
24                    vis[it] = true;
25                    q.offer(it);
26                }
27            }
28        }
29        return false;
30    }
31}