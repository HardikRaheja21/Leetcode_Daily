// Last updated: 2/16/2026, 7:04:38 AM
1class Solution {
2    public int findCircleNum(int[][] isConnected) {
3        int n = isConnected.length;
4        boolean[] visited = new boolean[n];
5        int provinces = 0;
6        for(int i = 0; i < n; i++){
7            if(!visited[i]){
8                bfs(isConnected, visited, i);
9                provinces++;
10            }
11        }
12        return provinces;
13    }
14    private static void bfs(int[][] isConnected, boolean[] visited, int start){
15        Queue<Integer> q = new LinkedList<>();
16        q.offer(start);
17        visited[start] = true;
18        while(!q.isEmpty()){
19            int city = q.poll();
20            for(int i = 0; i < isConnected.length; i++){
21                if(isConnected[city][i] == 1 && !visited[i]){
22                    q.offer(i);
23                    visited[i] = true;
24                }
25            }
26        }
27    }
28}