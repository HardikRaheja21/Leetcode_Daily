// Last updated: 3/11/2026, 11:00:43 AM
1class Solution {
2    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
3        boolean[] visited = new boolean[rooms.size()];
4        dfs(rooms, 0, visited);
5        for(int i = 0; i < rooms.size(); i++){
6            if(!visited[i]) return false;
7        }
8        return true;
9    }
10    public void dfs(List<List<Integer>> adj, int node, boolean[] visited){
11        visited[node] = true;
12        for(int it : adj.get(node)){
13            if(!visited[it]){
14                visited[it] = true;
15                dfs(adj, it, visited);
16            }
17        }
18    }
19}