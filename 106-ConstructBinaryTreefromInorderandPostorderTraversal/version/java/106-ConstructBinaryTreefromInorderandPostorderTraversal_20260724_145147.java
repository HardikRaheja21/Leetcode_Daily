// Last updated: 7/24/2026, 2:51:47 PM
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
17    int postOrderIndex;
18    HashMap<Integer, Integer> mp = new HashMap<>();
19    public TreeNode buildTree(int[] inorder, int[] postorder) {
20        postOrderIndex = postorder.length - 1;
21        for(int i = 0; i < inorder.length; i++){
22            mp.put(inorder[i], i);
23        }
24        return build(postorder, 0, inorder.length - 1);
25    }
26    private TreeNode build(int[] postOrder, int left, int right){
27        if(left > right) return null;
28        int rootValue = postOrder[postOrderIndex--];
29        TreeNode root = new TreeNode(rootValue);
30        int inOrderIndex = mp.get(rootValue);
31        root.right = build(postOrder, inOrderIndex + 1, right);
32        root.left = build(postOrder, left, inOrderIndex - 1);
33        return root;
34    }
35}