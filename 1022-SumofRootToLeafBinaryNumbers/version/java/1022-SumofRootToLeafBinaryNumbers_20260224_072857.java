// Last updated: 2/24/2026, 7:28:57 AM
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
17    public int sumRootToLeaf(TreeNode root) {
18        return dfs(root, 0);
19    }
20    private int dfs(TreeNode node, int sum) {
21        if (node == null) {
22            return 0;
23        }
24
25        sum = (sum << 1) + node.val;
26
27        if (node.left == null && node.right == null) {
28            return sum;
29        }
30
31        return dfs(node.left, sum) + dfs(node.right, sum);
32    }
33}