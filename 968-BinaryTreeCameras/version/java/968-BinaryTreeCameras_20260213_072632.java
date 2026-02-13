// Last updated: 2/13/2026, 7:26:32 AM
1/**
2 * Definition for a binary tree node.
3 * public class TreeNode {
4 *     int val;
5 *     TreeNode left;
6 *     TreeNode right;
7 *     TreeNode() {}
8 *     TreeNode(int val) { this.val = val; }
9 *     TreeNode(int val, TreeNode left, TreeNode right) {
10 *         this.val = val;
11 *         this.left = left;
12 *         this.right = right;
13 *     }
14 * }
15 */
16class Solution {
17    private int ans = 0;
18    public int minCameraCover(TreeNode root) {
19        return dfs(root) > 2 ? ans + 1 : ans;
20    }
21    public int dfs(TreeNode node){
22        if(node == null) return 0;
23        int val = dfs(node.left) + dfs(node.right);
24        if(val == 0) return 3;
25        if(val < 3) return 0;
26        ans++;
27        return 1;
28    }
29}