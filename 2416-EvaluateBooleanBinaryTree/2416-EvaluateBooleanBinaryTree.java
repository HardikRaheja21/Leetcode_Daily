// Last updated: 2/10/2026, 3:13:08 PM
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
    public boolean evaluateTree(TreeNode root) {
        if(root.left == null || root.right == null) return root.val == 1;
        boolean leftVal = evaluateTree(root.left);
        boolean rightVal = evaluateTree(root.right);
        if(root.val == 2) return leftVal || rightVal;
        else return leftVal && rightVal;
    }    
}