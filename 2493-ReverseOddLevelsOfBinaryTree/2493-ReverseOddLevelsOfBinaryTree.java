// Last updated: 2/13/2026, 7:23:01 AM
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public TreeNode reverseOddLevels(TreeNode root) {
        if(root != null){
            traverse(root.left, root.right, 0);
        }
        return root;
    }
    private static void traverse(TreeNode left, TreeNode right, int level){
        if(left == null || right == null) return;
        if(level % 2 == 0){
            int temp = left.val;
            left.val = right.val;
            right.val = temp;
        }
        traverse(left.left, right.right, level + 1);
        traverse(left.right, right.left, level + 1);
    }
}