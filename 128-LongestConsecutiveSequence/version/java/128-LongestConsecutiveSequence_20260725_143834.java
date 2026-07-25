// Last updated: 7/25/2026, 2:38:34 PM
1class Solution {
2    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
3        List<List<Integer>> ans = new ArrayList<>();
4        List<Integer> lst = new ArrayList<>();
5        lst.add(0);
6        dfs(ans, lst, 0, graph);
7        return ans;
8    }
9    public void dfs(List<List<Integer>> ans, List<Integer> lst, int node, int[][] graph){
10        if(node == graph.length - 1){
11            ans.add(new ArrayList<>(lst));
12        }
13        for(int it : graph[node]){
14            lst.add(it);
15            dfs(ans, lst, it, graph);
16            lst.remove(lst.size() - 1);
17        }
18    }
19}